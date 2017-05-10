//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.18 at 05:11:56 PM EDT 
//


package org.voltdb.compiler.projectfile;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proceduresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proceduresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedure" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="partitioninfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="users" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="groups" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="prefetchable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="deferrable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proceduresType", propOrder = {
    "procedure"
})
public class ProceduresType {

    protected List<ProceduresType.Procedure> procedure;

    /**
     * Gets the value of the procedure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProceduresType.Procedure }
     * 
     * 
     */
    public List<ProceduresType.Procedure> getProcedure() {
        if (procedure == null) {
            procedure = new ArrayList<ProceduresType.Procedure>();
        }
        return this.procedure;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="partitioninfo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="users" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="groups" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="prefetchable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="deferrable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sql"
    })
    public static class Procedure {

        protected String sql;
        @XmlAttribute(name = "class", required = true)
        protected String clazz;
        @XmlAttribute
        protected String partitioninfo;
        @XmlAttribute
        protected String users;
        @XmlAttribute
        protected String groups;
        @XmlAttribute
        protected String prefetchable;
        @XmlAttribute
        protected String deferrable;

        /**
         * Gets the value of the sql property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSql() {
            return sql;
        }

        /**
         * Sets the value of the sql property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSql(String value) {
            this.sql = value;
        }

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClazz(String value) {
            this.clazz = value;
        }

        /**
         * Gets the value of the partitioninfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartitioninfo() {
            return partitioninfo;
        }

        /**
         * Sets the value of the partitioninfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartitioninfo(String value) {
            this.partitioninfo = value;
        }

        /**
         * Gets the value of the users property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsers() {
            return users;
        }

        /**
         * Sets the value of the users property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsers(String value) {
            this.users = value;
        }

        /**
         * Gets the value of the groups property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroups() {
            return groups;
        }

        /**
         * Sets the value of the groups property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroups(String value) {
            this.groups = value;
        }

        /**
         * Gets the value of the prefetchable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrefetchable() {
            return prefetchable;
        }

        /**
         * Sets the value of the prefetchable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrefetchable(String value) {
            this.prefetchable = value;
        }

        /**
         * Gets the value of the deferrable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeferrable() {
            return deferrable;
        }

        /**
         * Sets the value of the deferrable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeferrable(String value) {
            this.deferrable = value;
        }

    }

}
