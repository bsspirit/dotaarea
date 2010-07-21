package org.conan.game.model;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author Conan Zhang <mailto:bsspirit@gmail.com>
*
*/
public class Skill {

    private String name;// 名称
    private String desc;// 描述
    private String area;// 作用范围
    private String distance;// 施法距离
    private String time;// 冷却时间
    private String mana;// 魔法消耗
    private char shortcut;// 快捷键
    private String special;// 特别说明

    private List<Grade> grades = new ArrayList<Grade>(4);// 技能等级

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getMana() {
        return mana;
    }

    public void setMana(String mana) {
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public char getShortcut() {
        return shortcut;
    }

    public void setShortcut(char shortcut) {
        this.shortcut = shortcut;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName() + "(" + this.getShortcut() + ")" + "\n");
        sb.append(this.getDesc() + "\n");

        if (this.getArea() != null) {
            sb.append("作用范围: " + this.getArea() + "\n");
        }
        if (this.getDistance() != null) {
            sb.append("施法距离: " + this.getDistance() + "\n");
        }
        if (this.getTime() != null) {
            sb.append("冷却时间: " + this.getTime() + "\n");
        }
        if (this.getMana() != null) {
            sb.append("魔法消耗: " + this.getMana() + "\n");
        }

        for (int j = 0; j < this.getGrades().size(); j++) {
            sb.append(this.getGrades().get(j) + "\n");
        }
        
        return sb.toString();
    }

}