package org.conan.game.web.hero;

import org.apache.wicket.markup.html.basic.Label;
import org.conan.game.base.BasePage;
import org.conan.game.dota.generated.HeroType;
import org.conan.game.dota.generated.HeroesType;
import org.conan.game.model.client.DotaClient;
import org.conan.game.system.DotaConstants;

public class Hero extends BasePage {

    public Hero() {
        HeroesType heroes = DotaClient.unmarshaller(DotaConstants.DOTA6_67);
        System.out.println(heroes.getName() + "  " + heroes.getVersion());
        HeroType hero = heroes.getHero().get(0);

        add(new Label("name", hero.getName()));
        add(new Label("shortName", hero.getShortName()));
    }

}
