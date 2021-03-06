//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.30 at 12:11:03 PM CEST 
//


package com.microsoft.schemas.sql.sqlrowset1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="row" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrimeId" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bigint" minOccurs="0"/>
 *                   &lt;element name="beleidsmVerantwOverheid" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="besluitnummer" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="datum" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}datetime" minOccurs="0"/>
 *                   &lt;element name="historisch" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
 *                   &lt;element name="identificatie" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="naam" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="naamOverheid" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="overheidscode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="planstatus" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="typePlan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="versieIMRO" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="verwijzingNorm" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="startDatum" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}datetime" minOccurs="0"/>
 *                   &lt;element name="eindDatum" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}datetime" minOccurs="0"/>
 *                   &lt;element name="processed" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
 *                   &lt;element name="ziplocation" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IsZipOk" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
 *                   &lt;element name="active_P1" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
 *                   &lt;element name="active_P3" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
 *                   &lt;element name="IsPB" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
 *                   &lt;element name="IDN_dotless" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}varchar">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="wmsrequest" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
 *                         &lt;maxLength value="4000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="bbox" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}varchar">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="verwijzingnaartekst" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}varchar">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
@XmlType(name = "", propOrder = {
    "row"
})
@XmlRootElement(name = "SqlRowSet1")
public class SqlRowSet1 {

    protected List<SqlRowSet1 .Row> row;

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SqlRowSet1 .Row }
     * 
     * 
     */
    public List<SqlRowSet1 .Row> getRow() {
        if (row == null) {
            row = new ArrayList<SqlRowSet1 .Row>();
        }
        return this.row;
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
     *         &lt;element name="PrimeId" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bigint" minOccurs="0"/>
     *         &lt;element name="beleidsmVerantwOverheid" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="besluitnummer" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="datum" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}datetime" minOccurs="0"/>
     *         &lt;element name="historisch" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
     *         &lt;element name="identificatie" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="naam" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="naamOverheid" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="overheidscode" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="planstatus" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="typePlan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="versieIMRO" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="verwijzingNorm" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="startDatum" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}datetime" minOccurs="0"/>
     *         &lt;element name="eindDatum" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}datetime" minOccurs="0"/>
     *         &lt;element name="processed" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
     *         &lt;element name="ziplocation" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IsZipOk" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
     *         &lt;element name="active_P1" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
     *         &lt;element name="active_P3" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
     *         &lt;element name="IsPB" type="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}bit" minOccurs="0"/>
     *         &lt;element name="IDN_dotless" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}varchar">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="wmsrequest" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}nvarchar">
     *               &lt;maxLength value="4000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="bbox" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}varchar">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="verwijzingnaartekst" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://schemas.microsoft.com/sqlserver/2004/sqltypes}varchar">
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
    @XmlType(name = "", propOrder = {
        "primeId",
        "beleidsmVerantwOverheid",
        "besluitnummer",
        "datum",
        "historisch",
        "identificatie",
        "naam",
        "naamOverheid",
        "overheidscode",
        "planstatus",
        "typePlan",
        "versieIMRO",
        "verwijzingNorm",
        "startDatum",
        "eindDatum",
        "processed",
        "ziplocation",
        "isZipOk",
        "activeP1",
        "activeP3",
        "isPB",
        "idnDotless",
        "wmsrequest",
        "bbox",
        "verwijzingnaartekst"
    })
    public static class Row {

        @XmlElement(name = "PrimeId")
        protected Long primeId;
        protected String beleidsmVerantwOverheid;
        protected String besluitnummer;
        protected XMLGregorianCalendar datum;
        protected Boolean historisch;
        protected String identificatie;
        protected String naam;
        protected String naamOverheid;
        protected String overheidscode;
        protected String planstatus;
        protected String typePlan;
        protected String versieIMRO;
        protected String verwijzingNorm;
        protected XMLGregorianCalendar startDatum;
        protected XMLGregorianCalendar eindDatum;
        protected Boolean processed;
        protected String ziplocation;
        @XmlElement(name = "IsZipOk")
        protected Boolean isZipOk;
        @XmlElement(name = "active_P1")
        protected Boolean activeP1;
        @XmlElement(name = "active_P3")
        protected Boolean activeP3;
        @XmlElement(name = "IsPB")
        protected Boolean isPB;
        @XmlElement(name = "IDN_dotless")
        protected String idnDotless;
        protected String wmsrequest;
        protected String bbox;
        protected String verwijzingnaartekst;

        /**
         * Gets the value of the primeId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPrimeId() {
            return primeId;
        }

        /**
         * Sets the value of the primeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPrimeId(Long value) {
            this.primeId = value;
        }

        /**
         * Gets the value of the beleidsmVerantwOverheid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeleidsmVerantwOverheid() {
            return beleidsmVerantwOverheid;
        }

        /**
         * Sets the value of the beleidsmVerantwOverheid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeleidsmVerantwOverheid(String value) {
            this.beleidsmVerantwOverheid = value;
        }

        /**
         * Gets the value of the besluitnummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBesluitnummer() {
            return besluitnummer;
        }

        /**
         * Sets the value of the besluitnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBesluitnummer(String value) {
            this.besluitnummer = value;
        }

        /**
         * Gets the value of the datum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatum() {
            return datum;
        }

        /**
         * Sets the value of the datum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatum(XMLGregorianCalendar value) {
            this.datum = value;
        }

        /**
         * Gets the value of the historisch property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHistorisch() {
            return historisch;
        }

        /**
         * Sets the value of the historisch property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHistorisch(Boolean value) {
            this.historisch = value;
        }

        /**
         * Gets the value of the identificatie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentificatie() {
            return identificatie;
        }

        /**
         * Sets the value of the identificatie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentificatie(String value) {
            this.identificatie = value;
        }

        /**
         * Gets the value of the naam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaam() {
            return naam;
        }

        /**
         * Sets the value of the naam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaam(String value) {
            this.naam = value;
        }

        /**
         * Gets the value of the naamOverheid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaamOverheid() {
            return naamOverheid;
        }

        /**
         * Sets the value of the naamOverheid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaamOverheid(String value) {
            this.naamOverheid = value;
        }

        /**
         * Gets the value of the overheidscode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverheidscode() {
            return overheidscode;
        }

        /**
         * Sets the value of the overheidscode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverheidscode(String value) {
            this.overheidscode = value;
        }

        /**
         * Gets the value of the planstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlanstatus() {
            return planstatus;
        }

        /**
         * Sets the value of the planstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlanstatus(String value) {
            this.planstatus = value;
        }

        /**
         * Gets the value of the typePlan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypePlan() {
            return typePlan;
        }

        /**
         * Sets the value of the typePlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypePlan(String value) {
            this.typePlan = value;
        }

        /**
         * Gets the value of the versieIMRO property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersieIMRO() {
            return versieIMRO;
        }

        /**
         * Sets the value of the versieIMRO property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersieIMRO(String value) {
            this.versieIMRO = value;
        }

        /**
         * Gets the value of the verwijzingNorm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerwijzingNorm() {
            return verwijzingNorm;
        }

        /**
         * Sets the value of the verwijzingNorm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerwijzingNorm(String value) {
            this.verwijzingNorm = value;
        }

        /**
         * Gets the value of the startDatum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDatum() {
            return startDatum;
        }

        /**
         * Sets the value of the startDatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDatum(XMLGregorianCalendar value) {
            this.startDatum = value;
        }

        /**
         * Gets the value of the eindDatum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEindDatum() {
            return eindDatum;
        }

        /**
         * Sets the value of the eindDatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEindDatum(XMLGregorianCalendar value) {
            this.eindDatum = value;
        }

        /**
         * Gets the value of the processed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isProcessed() {
            return processed;
        }

        /**
         * Sets the value of the processed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setProcessed(Boolean value) {
            this.processed = value;
        }

        /**
         * Gets the value of the ziplocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZiplocation() {
            return ziplocation;
        }

        /**
         * Sets the value of the ziplocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZiplocation(String value) {
            this.ziplocation = value;
        }

        /**
         * Gets the value of the isZipOk property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsZipOk() {
            return isZipOk;
        }

        /**
         * Sets the value of the isZipOk property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsZipOk(Boolean value) {
            this.isZipOk = value;
        }

        /**
         * Gets the value of the activeP1 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isActiveP1() {
            return activeP1;
        }

        /**
         * Sets the value of the activeP1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setActiveP1(Boolean value) {
            this.activeP1 = value;
        }

        /**
         * Gets the value of the activeP3 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isActiveP3() {
            return activeP3;
        }

        /**
         * Sets the value of the activeP3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setActiveP3(Boolean value) {
            this.activeP3 = value;
        }

        /**
         * Gets the value of the isPB property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsPB() {
            return isPB;
        }

        /**
         * Sets the value of the isPB property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsPB(Boolean value) {
            this.isPB = value;
        }

        /**
         * Gets the value of the idnDotless property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDNDotless() {
            return idnDotless;
        }

        /**
         * Sets the value of the idnDotless property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDNDotless(String value) {
            this.idnDotless = value;
        }

        /**
         * Gets the value of the wmsrequest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWmsrequest() {
            return wmsrequest;
        }

        /**
         * Sets the value of the wmsrequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWmsrequest(String value) {
            this.wmsrequest = value;
        }

        /**
         * Gets the value of the bbox property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBbox() {
            return bbox;
        }

        /**
         * Sets the value of the bbox property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBbox(String value) {
            this.bbox = value;
        }

        /**
         * Gets the value of the verwijzingnaartekst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerwijzingnaartekst() {
            return verwijzingnaartekst;
        }

        /**
         * Sets the value of the verwijzingnaartekst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerwijzingnaartekst(String value) {
            this.verwijzingnaartekst = value;
        }

    }

}
