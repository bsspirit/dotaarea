

package org.conan.game.dota.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for skillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="skillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}order"/>
 *         &lt;element ref="{}shortcut"/>
 *         &lt;element ref="{}desc"/>
 *         &lt;element ref="{}area" minOccurs="0"/>
 *         &lt;element ref="{}distance" minOccurs="0"/>
 *         &lt;element ref="{}time" minOccurs="0"/>
 *         &lt;element ref="{}mana" minOccurs="0"/>
 *         &lt;element ref="{}grades"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "skillType", propOrder = {
    "name",
    "order",
    "shortcut",
    "desc",
    "area",
    "distance",
    "time",
    "mana",
    "grades"
})
public class SkillType {

    @XmlElement(required = true)
    protected String name;
    protected int order;
    @XmlElement(required = true)
    protected String shortcut;
    @XmlElement(required = true)
    protected String desc;
    protected String area;
    protected String distance;
    protected String time;
    protected String mana;
    @XmlElement(required = true)
    protected GradesType grades;

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
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the shortcut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcut() {
        return shortcut;
    }

    /**
     * Sets the value of the shortcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcut(String value) {
        this.shortcut = value;
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
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the mana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMana() {
        return mana;
    }

    /**
     * Sets the value of the mana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMana(String value) {
        this.mana = value;
    }

    /**
     * Gets the value of the grades property.
     * 
     * @return
     *     possible object is
     *     {@link GradesType }
     *     
     */
    public GradesType getGrades() {
        return grades;
    }

    /**
     * Sets the value of the grades property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradesType }
     *     
     */
    public void setGrades(GradesType value) {
        this.grades = value;
    }

}
