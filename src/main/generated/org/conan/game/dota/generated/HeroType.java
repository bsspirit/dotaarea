

package org.conan.game.dota.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for heroType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="heroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}shortName"/>
 *         &lt;element ref="{}desc"/>
 *         &lt;element ref="{}attribute"/>
 *         &lt;element ref="{}skills"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heroType", propOrder = {
    "name",
    "shortName",
    "desc",
    "attribute",
    "skills"
})
public class HeroType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String shortName;
    @XmlElement(required = true)
    protected String desc;
    @XmlElement(required = true)
    protected AttributeType attribute;
    @XmlElement(required = true)
    protected SkillsType skills;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType }
     *     
     */
    public AttributeType getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType }
     *     
     */
    public void setAttribute(AttributeType value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the skills property.
     * 
     * @return
     *     possible object is
     *     {@link SkillsType }
     *     
     */
    public SkillsType getSkills() {
        return skills;
    }

    /**
     * Sets the value of the skills property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillsType }
     *     
     */
    public void setSkills(SkillsType value) {
        this.skills = value;
    }

}
