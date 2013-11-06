
package com.microsoft.schemas.sqlserver._2004.sqltypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sqlCompareOptionsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sqlCompareOptionsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="IgnoreCase"/>
 *     &lt;enumeration value="IgnoreNonSpace"/>
 *     &lt;enumeration value="IgnoreKanaType"/>
 *     &lt;enumeration value="IgnoreWidth"/>
 *     &lt;enumeration value="BinarySort"/>
 *     &lt;enumeration value="BinarySort2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sqlCompareOptionsEnum")
@XmlEnum
public enum SqlCompareOptionsEnum {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("IgnoreCase")
    IGNORE_CASE("IgnoreCase"),
    @XmlEnumValue("IgnoreNonSpace")
    IGNORE_NON_SPACE("IgnoreNonSpace"),
    @XmlEnumValue("IgnoreKanaType")
    IGNORE_KANA_TYPE("IgnoreKanaType"),
    @XmlEnumValue("IgnoreWidth")
    IGNORE_WIDTH("IgnoreWidth"),
    @XmlEnumValue("BinarySort")
    BINARY_SORT("BinarySort"),
    @XmlEnumValue("BinarySort2")
    BINARY_SORT_2("BinarySort2");
    private final String value;

    SqlCompareOptionsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SqlCompareOptionsEnum fromValue(String v) {
        for (SqlCompareOptionsEnum c: SqlCompareOptionsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
