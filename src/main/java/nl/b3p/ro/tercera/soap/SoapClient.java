/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.ro.tercera.soap;

import com.microsoft.schemas.sql.sqlrowset1.SqlRowSet1;
import com.microsoft.schemas.sql.sqlrowset1.SqlRowSet1.Row;
import com.microsoft.schemas.sqlserver._2004.soap.types.SqlRowSet;
import com.microsoft.schemas.sqlserver._2004.soap.types.sqlresultstream.SqlResultStream;
import https.db_tercera_ro_nl.utrecht.GetUtrecht;
import https.db_tercera_ro_nl.utrecht.GetUtrechtSoap;
import java.io.StringWriter;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.BindingProvider;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Node;

/**
 *
 * @author Roy Braam
 */
public class SoapClient {    

    private static final Log log = LogFactory.getLog(SoapClient.class);
    private GetUtrechtSoap gus;
    
    public SoapClient(final String username, final String password) {
        //set authenticator
        Authenticator.setDefault(new Authenticator() {
                @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username, password.toCharArray());
            }
        });
        GetUtrecht gu = new GetUtrecht();
        gus = gu.getGetUtrecht();
        //remove again
        Authenticator.setDefault(null);
        
        Map<String, Object> requestContext = ((BindingProvider) gus).getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, username);
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);
    }

    /**
     * Function for getting the user plans.
     *
     * @param username the user name for the search
     * @return a list of Row elements or null if nothing is found.
     */
    public List<Row> getUserPlannen(String username) throws JAXBException, TransformerConfigurationException, TransformerException {
        log.debug("tercera SOAP getAllUserDec with username: "+username);
        SqlResultStream r = gus.getAllUserDec(username);
        return getRows(r);
    }

    /**
     * Function for getting the user plans.
     *
     * @param username the user name for the search
     * @return a list of Row elements or null if nothing is found.
     */
    public List<Row> getPlannen() throws JAXBException, TransformerConfigurationException, TransformerException {
        log.debug("tercera SOAP getAllClientDec");
        SqlResultStream r = gus.getAllClientDec();
        return getRows(r);
    }

    public List<Row> getRows(SqlResultStream r) throws JAXBException, TransformerConfigurationException {
        List result = r.getSqlRowSetOrSqlXmlOrSqlMessage();
        List rowSet = null;
        for (Object o : result) {
            if (o instanceof SqlRowSet) {
                rowSet = ((SqlRowSet) o).getAny();
            }
        }
        if (rowSet != null) {
            for (Object o : rowSet) {
                if (o instanceof Node) {
                    Node node = (Node) o;
                    /*if (log.isDebugEnabled()) {
                        try {
                            String s = node2String(node);
                            log.debug("Tercera response: " + s);
                        } catch (Exception e) {
                            log.error("", e);
                        }
                    }*/
                    if (node.getLocalName().equals("diffgram") && node.getFirstChild()!=null) {
                        JAXBContext jc = JAXBContext.newInstance("com.microsoft.schemas.sql.sqlrowset1");
                        Unmarshaller unmarshaller = jc.createUnmarshaller();
                        SqlRowSet1 srs = (SqlRowSet1) unmarshaller.unmarshal(((Node) o).getFirstChild());
                        return srs.getRow();
                    }
                }
            }
        }
        return null;
    }

    public String node2String(Node node) throws TransformerConfigurationException, TransformerException {
        TransformerFactory transFactory = TransformerFactory.newInstance();
        Transformer transformer = transFactory.newTransformer();
        StringWriter buffer = new StringWriter();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.transform(new DOMSource(node),
                new StreamResult(buffer));
        return buffer.toString();
    }
}
