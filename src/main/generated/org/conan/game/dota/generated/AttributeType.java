

package org.conan.game.dota.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}basic"/>
 *         &lt;element ref="{}initShot"/>
 *         &lt;element ref="{}initAttack"/>
 *         &lt;element ref="{}initCooldown"/>
 *         &lt;element ref="{}initDefense"/>
 *         &lt;element ref="{}speed"/>
 *         &lt;element ref="{}intelligence"/>
 *         &lt;element ref="{}agility"/>
 *         &lt;element ref="{}strength"/>
 *         &lt;element ref="{}goupIntelligence"/>
 *         &lt;element ref="{}goupAgility"/>
 *         &lt;element ref="{}goupStrength"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attributeType", propOrder = {
    "basic",
    "initShot",
    "initAttack",
    "initCooldown",
    "initDefense",
    "speed",
    "intelligence",
    "agility",
    "strength",
    "goupIntelligence",
    "goupAgility",
    "goupStrength"
})
public class AttributeType {

    @XmlElement(required = true)
    protected String basic;
    protected int initShot;
    @XmlElement(required = true)
    protected String initAttack;
    protected float initCooldown;
    protected float initDefense;
    protected int speed;
    protected int intelligence;
    protected int agility;
    protected int strength;
    protected float goupIntelligence;
    protected float goupAgility;
    protected float goupStrength;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasic(String value) {
        this.basic = value;
    }

    /**
     * Gets the value of the initShot property.
     * 
     */
    public int getInitShot() {
        return initShot;
    }

    /**
     * Sets the value of the initShot property.
     * 
     */
    public void setInitShot(int value) {
        this.initShot = value;
    }

    /**
     * Gets the value of the initAttack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitAttack() {
        return initAttack;
    }

    /**
     * Sets the value of the initAttack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitAttack(String value) {
        this.initAttack = value;
    }

    /**
     * Gets the value of the initCooldown property.
     * 
     */
    public float getInitCooldown() {
        return initCooldown;
    }

    /**
     * Sets the value of the initCooldown property.
     * 
     */
    public void setInitCooldown(float value) {
        this.initCooldown = value;
    }

    /**
     * Gets the value of the initDefense property.
     * 
     */
    public float getInitDefense() {
        return initDefense;
    }

    /**
     * Sets the value of the initDefense property.
     * 
     */
    public void setInitDefense(float value) {
        this.initDefense = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

    /**
     * Gets the value of the intelligence property.
     * 
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Sets the value of the intelligence property.
     * 
     */
    public void setIntelligence(int value) {
        this.intelligence = value;
    }

    /**
     * Gets the value of the agility property.
     * 
     */
    public int getAgility() {
        return agility;
    }

    /**
     * Sets the value of the agility property.
     * 
     */
    public void setAgility(int value) {
        this.agility = value;
    }

    /**
     * Gets the value of the strength property.
     * 
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     * 
     */
    public void setStrength(int value) {
        this.strength = value;
    }

    /**
     * Gets the value of the goupIntelligence property.
     * 
     */
    public float getGoupIntelligence() {
        return goupIntelligence;
    }

    /**
     * Sets the value of the goupIntelligence property.
     * 
     */
    public void setGoupIntelligence(float value) {
        this.goupIntelligence = value;
    }

    /**
     * Gets the value of the goupAgility property.
     * 
     */
    public float getGoupAgility() {
        return goupAgility;
    }

    /**
     * Sets the value of the goupAgility property.
     * 
     */
    public void setGoupAgility(float value) {
        this.goupAgility = value;
    }

    /**
     * Gets the value of the goupStrength property.
     * 
     */
    public float getGoupStrength() {
        return goupStrength;
    }

    /**
     * Sets the value of the goupStrength property.
     * 
     */
    public void setGoupStrength(float value) {
        this.goupStrength = value;
    }

}
