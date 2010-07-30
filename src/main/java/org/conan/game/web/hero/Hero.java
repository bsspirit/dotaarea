package org.conan.game.web.hero;

import org.apache.wicket.PageParameters;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.conan.game.base.BasePage;
import org.conan.game.dota.generated.AttributeType;
import org.conan.game.dota.generated.GradeType;
import org.conan.game.dota.generated.HeroType;
import org.conan.game.dota.generated.HeroesType;
import org.conan.game.dota.generated.SkillType;
import org.conan.game.model.SingletonData;

public class Hero extends BasePage {

    private HeroesType heroes = SingletonData.getInstance();

    public Hero(PageParameters param) {
        String name = param.getString("name");
        HeroType hero = heroes.getHero().get(0);
        for (HeroType h : heroes.getHero()) {
            if (h.getShortName().equalsIgnoreCase(name)) {
                hero = h;
            }
        }

        add(new Label("name", hero.getName()));
        add(new Label("shortName", hero.getShortName()));
        add(new Label("desc", hero.getDesc()));

        AttributeType attr = hero.getAttribute();
        add(new Label("initShot", String.valueOf(attr.getInitShot())));
        add(new Label("initCooldown", String.valueOf(attr.getInitCooldown())));
        add(new Label("initDefense", String.valueOf(attr.getInitDefense())));
        add(new Label("initAttack", String.valueOf(attr.getInitAttack())));
        add(new Label("intelligence", String.valueOf(attr.getIntelligence())));
        add(new Label("agility", String.valueOf(attr.getAgility())));
        add(new Label("strength", String.valueOf(attr.getStrength())));
        add(new Label("speed", String.valueOf(attr.getSpeed())));
        add(new Label("basic", String.valueOf(attr.getBasic())));
        add(new Label("goupStrength", String.valueOf(attr.getGoupStrength())));
        add(new Label("goupAgility", String.valueOf(attr.getGoupAgility())));
        add(new Label("goupIntelligence", String.valueOf(attr.getGoupIntelligence())));

        ListView<SkillType> skills = new ListView<SkillType>("skills", hero.getSkills().getSkill()) {
            private static final long serialVersionUID = -2464746371677207895L;

            @Override
            protected void populateItem(ListItem<SkillType> item) {
                SkillType skill = item.getModelObject();
                item.add(new Label("skill.order", String.valueOf(skill.getOrder())));
                item.add(new Label("skill.desc", skill.getDesc()));
                item.add(new Label("skill.shortcut", skill.getShortcut()));
                item.add(new Label("skill.area", skill.getArea()));
                item.add(new Label("skill.distance", skill.getDistance()));
                item.add(new Label("skill.castTime", skill.getCastTime()));
                item.add(new Label("skill.duration", skill.getDuration()));
                item.add(new Label("skill.mana", skill.getMana()));
                item.add(new Label("skill.special", skill.getSpecial()));

                AjaxLink<String> skillLink = new AjaxLink<String>("skill.name.link") {
                    private static final long serialVersionUID = 2155801439608474969L;

                    @Override
                    public void onClick(AjaxRequestTarget target) {
                        System.out.println("click");
                    }
                };
                skillLink.add(new Label("skill.name", skill.getName()));
                item.add(skillLink);

                ListView<GradeType> grades = new ListView<GradeType>("grades", skill.getGrades().getGrade()) {
                    private static final long serialVersionUID = 1539951415915092578L;

                    @Override
                    protected void populateItem(ListItem<GradeType> item) {
                        GradeType grade = item.getModelObject();
                        item.add(new Label("skill.grade.level", String.valueOf(grade.getLevel())));
                        item.add(new Label("skill.grade.desc", grade.getDesc()));
                    }
                };
                item.add(grades);
            }
        };
        add(skills);
    }
}
