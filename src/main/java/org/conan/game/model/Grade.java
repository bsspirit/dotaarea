package org.conan.game.model;

/**
 * 
 * @author Conan Zhang <mailto:bsspirit@gmail.com>
 * 
 */
public class Grade {

    private int level;// 等级
    private String desc;// 描述

    public Grade(int level, String desc) {
        this.level = level;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "第" + this.getLevel() + "级" + ": " + this.getDesc();
    }

}