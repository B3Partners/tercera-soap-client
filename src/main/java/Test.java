
import com.microsoft.schemas.sql.sqlrowset1.SqlRowSet1.Row;
import java.io.IOException;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.*;
import nl.b3p.ro.tercera.soap.SoapClient;
import org.w3c.dom.Node;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roy Braam
 */
public class Test {
    public static final void main(String... args) throws TransformerConfigurationException, TransformerException, IOException, JAXBException {
        
        SoapClient sc = new SoapClient("user","password");
        List<Row> l = sc.getPlannen();
        System.out.println("Found plannen: "+l.size());

    }
    public static JAXBElement unMarshall(Node xmlDocument, Class clazz) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("com.microsoft.schemas.sql.sqlrowset1");
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setSchema(null);
        return unmarshaller.unmarshal(xmlDocument, clazz);
    }
    
     
}
