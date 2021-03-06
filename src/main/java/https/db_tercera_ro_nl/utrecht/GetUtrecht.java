
package https.db_tercera_ro_nl.utrecht;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "GetUtrecht", targetNamespace = "https://db.tercera-ro.nl/utrecht", wsdlLocation = "https://db.tercera-ro.nl/utrecht?wsdl")
public class GetUtrecht
    extends Service
{

    private final static URL GETUTRECHT_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(https.db_tercera_ro_nl.utrecht.GetUtrecht.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = https.db_tercera_ro_nl.utrecht.GetUtrecht.class.getResource(".");
            url = new URL(baseUrl, "https://db.tercera-ro.nl/utrecht?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://db.tercera-ro.nl/utrecht?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        GETUTRECHT_WSDL_LOCATION = url;
    }

    public GetUtrecht(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetUtrecht() {
        super(GETUTRECHT_WSDL_LOCATION, new QName("https://db.tercera-ro.nl/utrecht", "GetUtrecht"));
    }

    /**
     * 
     * @return
     *     returns GetUtrechtSoap
     */
    @WebEndpoint(name = "GetUtrecht")
    public GetUtrechtSoap getGetUtrecht() {
        return super.getPort(new QName("https://db.tercera-ro.nl/utrecht", "GetUtrecht"), GetUtrechtSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetUtrechtSoap
     */
    @WebEndpoint(name = "GetUtrecht")
    public GetUtrechtSoap getGetUtrecht(WebServiceFeature... features) {
        return super.getPort(new QName("https://db.tercera-ro.nl/utrecht", "GetUtrecht"), GetUtrechtSoap.class, features);
    }

}
