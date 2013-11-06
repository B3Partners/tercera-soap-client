
package com.microsoft.schemas.sqlserver._2004.soap.types.sqlresultstream;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.sqlserver._2004.soap.types.SqlRowSet;
import com.microsoft.schemas.sqlserver._2004.soap.types.SqlXml;
import com.microsoft.schemas.sqlserver._2004.soap.types.sqlmessage.SqlMessage;
import com.microsoft.schemas.sqlserver._2004.soap.types.sqlrowcount.SqlRowCount;
import com.microsoft.schemas.sqlserver._2004.soap.types.sqltransaction.SqlTransaction;


/**
 * <p>Java class for SqlResultStream complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqlResultStream">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="SqlRowSet" type="{http://schemas.microsoft.com/sqlserver/2004/SOAP/types}SqlRowSet"/>
 *         &lt;element name="SqlXml" type="{http://schemas.microsoft.com/sqlserver/2004/SOAP/types}SqlXml"/>
 *         &lt;element name="SqlMessage" type="{http://schemas.microsoft.com/sqlserver/2004/SOAP/types/SqlMessage}SqlMessage"/>
 *         &lt;element name="SqlRowCount" type="{http://schemas.microsoft.com/sqlserver/2004/SOAP/types/SqlRowCount}SqlRowCount"/>
 *         &lt;element name="SqlResultCode" type="{http://schemas.microsoft.com/sqlserver/2004/SOAP/types}SqlResultCode"/>
 *         &lt;element name="SqlTransaction" type="{http://schemas.microsoft.com/sqlserver/2004/SOAP/types/SqlTransaction}SqlTransaction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SqlResultStream", propOrder = {
    "sqlRowSetOrSqlXmlOrSqlMessage"
})
public class SqlResultStream {

    @XmlElements({
        @XmlElement(name = "SqlTransaction", type = SqlTransaction.class),
        @XmlElement(name = "SqlRowSet", type = SqlRowSet.class),
        @XmlElement(name = "SqlResultCode", type = Integer.class),
        @XmlElement(name = "SqlXml", type = SqlXml.class),
        @XmlElement(name = "SqlRowCount", type = SqlRowCount.class),
        @XmlElement(name = "SqlMessage", type = SqlMessage.class)
    })
    protected List<Object> sqlRowSetOrSqlXmlOrSqlMessage;

    /**
     * Gets the value of the sqlRowSetOrSqlXmlOrSqlMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sqlRowSetOrSqlXmlOrSqlMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSqlRowSetOrSqlXmlOrSqlMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SqlTransaction }
     * {@link SqlRowSet }
     * {@link Integer }
     * {@link SqlXml }
     * {@link SqlRowCount }
     * {@link SqlMessage }
     * 
     * 
     */
    public List<Object> getSqlRowSetOrSqlXmlOrSqlMessage() {
        if (sqlRowSetOrSqlXmlOrSqlMessage == null) {
            sqlRowSetOrSqlXmlOrSqlMessage = new ArrayList<Object>();
        }
        return this.sqlRowSetOrSqlXmlOrSqlMessage;
    }

}
