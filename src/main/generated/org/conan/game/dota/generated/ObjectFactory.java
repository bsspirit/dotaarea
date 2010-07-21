


package org.conan.game.dota.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.conan.game.dota.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Skills_QNAME = new QName("", "skills");
    private final static QName _Heroes_QNAME = new QName("", "heroes");
    private final static QName _Desc_QNAME = new QName("", "desc");
    private final static QName _InitDefense_QNAME = new QName("", "initDefense");
    private final static QName _Attribute_QNAME = new QName("", "attribute");
    private final static QName _Agility_QNAME = new QName("", "agility");
    private final static QName _Version_QNAME = new QName("", "version");
    private final static QName _Shortcut_QNAME = new QName("", "shortcut");
    private final static QName _Distance_QNAME = new QName("", "distance");
    private final static QName _Time_QNAME = new QName("", "time");
    private final static QName _Level_QNAME = new QName("", "level");
    private final static QName _Area_QNAME = new QName("", "area");
    private final static QName _Order_QNAME = new QName("", "order");
    private final static QName _Basic_QNAME = new QName("", "basic");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Grade_QNAME = new QName("", "grade");
    private final static QName _InitCooldown_QNAME = new QName("", "initCooldown");
    private final static QName _Intelligence_QNAME = new QName("", "intelligence");
    private final static QName _Hero_QNAME = new QName("", "hero");
    private final static QName _Speed_QNAME = new QName("", "speed");
    private final static QName _GoupStrength_QNAME = new QName("", "goupStrength");
    private final static QName _Strength_QNAME = new QName("", "strength");
    private final static QName _Mana_QNAME = new QName("", "mana");
    private final static QName _InitAttack_QNAME = new QName("", "initAttack");
    private final static QName _Skill_QNAME = new QName("", "skill");
    private final static QName _GoupAgility_QNAME = new QName("", "goupAgility");
    private final static QName _InitShot_QNAME = new QName("", "initShot");
    private final static QName _GoupIntelligence_QNAME = new QName("", "goupIntelligence");
    private final static QName _ShortName_QNAME = new QName("", "shortName");
    private final static QName _Grades_QNAME = new QName("", "grades");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.conan.game.dota.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GradesType }
     * 
     */
    public GradesType createGradesType() {
        return new GradesType();
    }

    /**
     * Create an instance of {@link SkillsType }
     * 
     */
    public SkillsType createSkillsType() {
        return new SkillsType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link HeroType }
     * 
     */
    public HeroType createHeroType() {
        return new HeroType();
    }

    /**
     * Create an instance of {@link GradeType }
     * 
     */
    public GradeType createGradeType() {
        return new GradeType();
    }

    /**
     * Create an instance of {@link SkillType }
     * 
     */
    public SkillType createSkillType() {
        return new SkillType();
    }

    /**
     * Create an instance of {@link HeroesType }
     * 
     */
    public HeroesType createHeroesType() {
        return new HeroesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SkillsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "skills")
    public JAXBElement<SkillsType> createSkills(SkillsType value) {
        return new JAXBElement<SkillsType>(_Skills_QNAME, SkillsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeroesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "heroes")
    public JAXBElement<HeroesType> createHeroes(HeroesType value) {
        return new JAXBElement<HeroesType>(_Heroes_QNAME, HeroesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "desc")
    public JAXBElement<String> createDesc(String value) {
        return new JAXBElement<String>(_Desc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "initDefense")
    public JAXBElement<Float> createInitDefense(Float value) {
        return new JAXBElement<Float>(_InitDefense_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "attribute")
    public JAXBElement<AttributeType> createAttribute(AttributeType value) {
        return new JAXBElement<AttributeType>(_Attribute_QNAME, AttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "agility")
    public JAXBElement<Integer> createAgility(Integer value) {
        return new JAXBElement<Integer>(_Agility_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "version")
    public JAXBElement<Float> createVersion(Float value) {
        return new JAXBElement<Float>(_Version_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "shortcut")
    public JAXBElement<String> createShortcut(String value) {
        return new JAXBElement<String>(_Shortcut_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "distance")
    public JAXBElement<String> createDistance(String value) {
        return new JAXBElement<String>(_Distance_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time")
    public JAXBElement<String> createTime(String value) {
        return new JAXBElement<String>(_Time_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "level")
    public JAXBElement<Integer> createLevel(Integer value) {
        return new JAXBElement<Integer>(_Level_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "area")
    public JAXBElement<String> createArea(String value) {
        return new JAXBElement<String>(_Area_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "order")
    public JAXBElement<Integer> createOrder(Integer value) {
        return new JAXBElement<Integer>(_Order_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "basic")
    public JAXBElement<String> createBasic(String value) {
        return new JAXBElement<String>(_Basic_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "grade")
    public JAXBElement<GradeType> createGrade(GradeType value) {
        return new JAXBElement<GradeType>(_Grade_QNAME, GradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "initCooldown")
    public JAXBElement<Float> createInitCooldown(Float value) {
        return new JAXBElement<Float>(_InitCooldown_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "intelligence")
    public JAXBElement<Integer> createIntelligence(Integer value) {
        return new JAXBElement<Integer>(_Intelligence_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeroType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hero")
    public JAXBElement<HeroType> createHero(HeroType value) {
        return new JAXBElement<HeroType>(_Hero_QNAME, HeroType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "speed")
    public JAXBElement<Integer> createSpeed(Integer value) {
        return new JAXBElement<Integer>(_Speed_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "goupStrength")
    public JAXBElement<Float> createGoupStrength(Float value) {
        return new JAXBElement<Float>(_GoupStrength_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "strength")
    public JAXBElement<Integer> createStrength(Integer value) {
        return new JAXBElement<Integer>(_Strength_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mana")
    public JAXBElement<String> createMana(String value) {
        return new JAXBElement<String>(_Mana_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "initAttack")
    public JAXBElement<String> createInitAttack(String value) {
        return new JAXBElement<String>(_InitAttack_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SkillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "skill")
    public JAXBElement<SkillType> createSkill(SkillType value) {
        return new JAXBElement<SkillType>(_Skill_QNAME, SkillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "goupAgility")
    public JAXBElement<Float> createGoupAgility(Float value) {
        return new JAXBElement<Float>(_GoupAgility_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "initShot")
    public JAXBElement<Integer> createInitShot(Integer value) {
        return new JAXBElement<Integer>(_InitShot_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "goupIntelligence")
    public JAXBElement<Float> createGoupIntelligence(Float value) {
        return new JAXBElement<Float>(_GoupIntelligence_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "shortName")
    public JAXBElement<String> createShortName(String value) {
        return new JAXBElement<String>(_ShortName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GradesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "grades")
    public JAXBElement<GradesType> createGrades(GradesType value) {
        return new JAXBElement<GradesType>(_Grades_QNAME, GradesType.class, null, value);
    }

}
