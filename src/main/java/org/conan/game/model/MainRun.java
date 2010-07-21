package org.conan.game.model;

public class MainRun {

    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setName("普罗德摩尔将军");
        hero1.setShortName("Kunkka");
        hero1.setDesc("在近卫的所有盟军中，只有一个人，在许多大陆上都有着不同但又令人生畏的名字。他的追随者们叫他COCO船长，有的人叫他杰克·斯帕罗，还有的人叫他传说中");

        Skill skill1 = new Skill();
        skill1.setName("洪流");
        skill1.setDesc("通过运用他无与伦比的海洋方面的知识，普罗德摩尔将军有能力在指定的区域召唤一阵水流，2秒之后，水流变成一股汹涌的洪流，冲出地面，将范围内的敌方单位抛至空中，造成伤害并在接下来数秒内降低30%的移动速度");
        skill1.setArea("255");
        skill1.setDistance("1500");
        skill1.setTime("12");
        skill1.setMana("120");
        skill1.setShortcut('E');

        skill1.getGrades().add(new Grade(1, "120点伤害，1秒减速"));
        skill1.getGrades().add(new Grade(2, "180点伤害，2秒减速"));
        skill1.getGrades().add(new Grade(3, "240点伤害，3秒减速"));
        skill1.getGrades().add(new Grade(4, "300点伤害，4秒减速"));
        hero1.getSkills().add(skill1);

        Skill skill2 = new Skill();
        skill2.setName("潮汐使者");
        skill2.setDesc("普罗德摩尔将军传奇般的宝剑潮汐使者，被大海灌入了不可思议的力量，类似于涨潮和退潮，，每过一定的时间，潮汐使者便被动地给予普罗德摩尔将军额外的力量（增加攻击力和380/420/460/500范围的溅射伤害，仅限一次攻击）");
        skill2.setShortcut('D');
        skill2.getGrades().add(new Grade(1, "增加攻击力为15点，间隔16秒"));
        skill2.getGrades().add(new Grade(2, "增加攻击力为30点，间隔12秒"));
        skill2.getGrades().add(new Grade(3, "增加攻击力为45点，间隔8秒"));
        skill2.getGrades().add(new Grade(4, "增加攻击力为60点，间隔4秒"));
        hero1.getSkills().add(skill2);

        Skill skill3 = new Skill();
        skill3.setName("地图地标");
        skill3.setDesc("为了能使他的军队迅速集合，普罗德摩尔将军为一个英雄在地上标记其当前的位置，数秒之后，被标记的英雄会立刻返回标记位置");
        skill3.setShortcut('X');
        skill3.setTime("30");
        skill3.setMana("80/90/100/110");
        skill3.getGrades().add(new Grade(1, "1秒之后返回标记地点，500施法距离"));
        skill3.getGrades().add(new Grade(2, "2秒之后返回标记地点，650施法距离"));
        skill3.getGrades().add(new Grade(3, "3秒之后返回标记地点，800施法距离"));
        skill3.getGrades().add(new Grade(4, "4秒之后返回标记地点，950施法距离"));
        hero1.getSkills().add(skill3);

        Skill skill4 = new Skill();
        skill4.setName("幽灵船");
        skill4.setDesc("普罗德摩尔将军召唤出神秘的幽灵船CoCo号，横越战场。CoCo号经过友军时，会为友军灌下CoCo船长的朗姆酒，使其在接下来数秒内提升10%的移动速度，减少所受伤害的一半（酒劲消退时会承受累积的那一半伤害）。幽灵船撞毁后，会对425范围内的敌方单位造成伤害和1秒晕眩");
        skill4.setShortcut('T');
        skill4.setTime("100");
        skill4.setArea("1000");
        skill4.setMana("150/200/250");
        skill4.getGrades().add(new Grade(1, "CoCo船长的朗姆酒持续5秒，300点伤害"));
        skill4.getGrades().add(new Grade(2, "CoCo船长的朗姆酒持续6秒，400点伤害"));
        skill4.getGrades().add(new Grade(3, "CoCo船长的朗姆酒持续7秒，500点伤害"));
        hero1.getSkills().add(skill4);

        display(hero1);
    }

    public static void display(Hero hero) {
        System.out.println(hero.toString());
    }
}