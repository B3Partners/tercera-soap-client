
package https.db_tercera_ro_nl.utrecht;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.sqlserver._2004.soap.types.sqlresultstream.SqlResultStream;


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
 *         &lt;element name="GetAllClientDecResult" type="{http://schemas.microsoft.com/sqlserver/2004/SOAP/types/SqlResultStream}SqlResultStream"/>
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
    "getAllClientDecResult"
})
@XmlRootElement(name = "GetAllClientDecResponse")
public class GetAllClientDecResponse {

    @XmlElement(name = "GetAllClientDecResult", required = true)
    protected SqlResultStream getAllClientDecResult;

    /**
     * Gets the value of the getAllClientDecResult property.
     * 
     * @return
     *     possible object is
     *     {@link SqlResultStream }
     *     
     */
    public SqlResultStream getGetAllClientDecResult() {
        return getAllClientDecResult;
    }

    /**
     * Sets the value of the getAllClientDecResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlResultStream }
     *     
     */
    public void setGetAllClientDecResult(SqlResultStream value) {
        this.getAllClientDecResult = value;
    }

}
