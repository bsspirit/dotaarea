package org.conan.game.model.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Conan Zhang <mailto:bsspirit@gmail.com>
 * 
 */
public class Hero {

    private String name;// 名字
    private String shortName;// 简称
    private String desc;// 描述
    private List<Skill> skills = new ArrayList<Skill>();// 技能

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName() + "(" + this.getShortName() + ")" + "\n");
        sb.append(this.getDesc() + "\n\n");
        for (int i = 0; i < this.getSkills().size(); i++) {
            sb.append("技能" + (i + 1) + ": " + this.getSkills().get(i) + "\n");
        }
        return sb.toString();
    }

}