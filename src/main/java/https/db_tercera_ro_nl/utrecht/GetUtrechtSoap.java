
package https.db_tercera_ro_nl.utrecht;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.microsoft.schemas.sqlserver._2004.soap.types.sqlresultstream.SqlResultStream;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "GetUtrechtSoap", targetNamespace = "https://db.tercera-ro.nl/utrecht")
@XmlSeeAlso({
    https.db_tercera_ro_nl.utrecht.ObjectFactory.class,
    com.microsoft.schemas.sqlserver._2004.soap.options.ObjectFactory.class,
    com.microsoft.schemas.sqlserver._2004.soap.types.sqlresultstream.ObjectFactory.class,
    com.microsoft.schemas.sqlserver._2004.soap.types.sqlparameter.ObjectFactory.class,
    com.microsoft.schemas.sqlserver._2004.soap.types.sqlrowcount.ObjectFactory.class,
    com.microsoft.schemas.sqlserver._2004.soap.types.sqlmessage.ObjectFactory.class,
    com.microsoft.schemas.sqlserver._2004.soap.types.sqltransaction.ObjectFactory.class,
    com.microsoft.schemas.sqlserver._2004.sqltypes.ObjectFactory.class,
    com.microsoft.schemas.sqlserver._2004.soap.types.ObjectFactory.class
})
public interface GetUtrechtSoap {


    /**
     * 
     * @return
     *     returns com.microsoft.schemas.sqlserver._2004.soap.types.sqlresultstream.SqlResultStream
     */
    @WebMethod(operationName = "GetAllClientDec", action = "https://db.tercera-ro.nl/utrechtGetAllClientDec")
    @WebResult(name = "GetAllClientDecResult", targetNamespace = "https://db.tercera-ro.nl/utrecht")
    @RequestWrapper(localName = "GetAllClientDec", targetNamespace = "https://db.tercera-ro.nl/utrecht", className = "https.db_tercera_ro_nl.utrecht.GetAllClientDec")
    @ResponseWrapper(localName = "GetAllClientDecResponse", targetNamespace = "https://db.tercera-ro.nl/utrecht", className = "https.db_tercera_ro_nl.utrecht.GetAllClientDecResponse")
    public SqlResultStream getAllClientDec();

    /**
     * 
     * @param userName
     * @return
     *     returns com.microsoft.schemas.sqlserver._2004.soap.types.sqlresultstream.SqlResultStream
     */
    @WebMethod(operationName = "GetAllUserDec", action = "https://db.tercera-ro.nl/utrechtGetAllUserDec")
    @WebResult(name = "GetAllUserDecResult", targetNamespace = "https://db.tercera-ro.nl/utrecht")
    @RequestWrapper(localName = "GetAllUserDec", targetNamespace = "https://db.tercera-ro.nl/utrecht", className = "https.db_tercera_ro_nl.utrecht.GetAllUserDec")
    @ResponseWrapper(localName = "GetAllUserDecResponse", targetNamespace = "https://db.tercera-ro.nl/utrecht", className = "https.db_tercera_ro_nl.utrecht.GetAllUserDecResponse")
    public SqlResultStream getAllUserDec(
        @WebParam(name = "UserName", targetNamespace = "https://db.tercera-ro.nl/utrecht")
        String userName);

}
