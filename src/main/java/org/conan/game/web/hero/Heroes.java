package org.conan.game.web.hero;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.conan.game.base.BasePage;
import org.conan.game.dota.generated.HeroType;
import org.conan.game.dota.generated.HeroesType;
import org.conan.game.model.SingletonData;

public class Heroes extends BasePage {

    private HeroesType heroes = SingletonData.getInstance();

    public Heroes() {
        ListView<HeroType> heroesTable = new ListView<HeroType>("heroes", heroes.getHero()) {
            private static final long serialVersionUID = -2464746371997207895L;

            @Override
            protected void populateItem(ListItem<HeroType> item) {
                HeroType hero = item.getModelObject();

                PageParameters params = new PageParameters();
                params.put("name", hero.getShortName());
                Link<BasePage> heroLink = new BookmarkablePageLink<BasePage>("hero.link", Hero.class, params);
                heroLink.add(new Label("hero.name", hero.getName()));
                item.add(heroLink);
            }
        };
        add(heroesTable);
    }

}
