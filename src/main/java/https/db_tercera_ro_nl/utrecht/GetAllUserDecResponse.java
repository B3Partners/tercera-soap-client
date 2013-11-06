
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
 *         &lt;element name="GetAllUserDecResult" type="{http://schemas.microsoft.com/sqlserver/2004/SOAP/types/SqlResultStream}SqlResultStream"/>
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
    "getAllUserDecResult"
})
@XmlRootElement(name = "GetAllUserDecResponse")
public class GetAllUserDecResponse {

    @XmlElement(name = "GetAllUserDecResult", required = true)
    protected SqlResultStream getAllUserDecResult;

    /**
     * Gets the value of the getAllUserDecResult property.
     * 
     * @return
     *     possible object is
     *     {@link SqlResultStream }
     *     
     */
    public SqlResultStream getGetAllUserDecResult() {
        return getAllUserDecResult;
    }

    /**
     * Sets the value of the getAllUserDecResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlResultStream }
     *     
     */
    public void setGetAllUserDecResult(SqlResultStream value) {
        this.getAllUserDecResult = value;
    }

}
