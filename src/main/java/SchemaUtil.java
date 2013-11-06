
import com.microsoft.schemas.sqlserver._2004.soap.types.SqlRowSet;
import com.microsoft.schemas.sqlserver._2004.soap.types.sqlresultstream.SqlResultStream;
import https.db_tercera_ro_nl.utrecht.GetUtrecht;
import https.db_tercera_ro_nl.utrecht.GetUtrechtSoap;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.List;
import java.util.Map;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.BindingProvider;
import org.w3c.dom.Node;

/**
 * Help Class to generate the schema's
 * @author Roy Braam
 */
public class SchemaUtil {
    private static final String PASSWORD = "password";
    private static final String USERNAME = "user";
    
    public static final void main(String... args) throws TransformerConfigurationException, TransformerException, IOException {
        Authenticator.setDefault(new Authenticator() {
                @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(USERNAME, PASSWORD.toCharArray());
            }
        });
        GetUtrecht gu = new GetUtrecht();
        GetUtrechtSoap gus = gu.getGetUtrecht();
        //remove again
        Authenticator.setDefault(null);
        //set correct request context auth.
        Map<String, Object> requestContext = ((BindingProvider) gus).getRequestContext();
        requestContext.put(BindingProvider.USERNAME_PROPERTY, USERNAME);
        requestContext.put(BindingProvider.PASSWORD_PROPERTY, PASSWORD);

        SqlResultStream r = gus.getAllUserDec("Amersfoort");
        List result = r.getSqlRowSetOrSqlXmlOrSqlMessage();
        List rowSet=null;
        for (Object o: result){
            if (o instanceof SqlRowSet){
                rowSet=((SqlRowSet)o).getAny();
            }
        }
        if (rowSet!=null){
            for (Object o :rowSet) {
                if (o instanceof Node) {
                    TransformerFactory transFactory = TransformerFactory.newInstance();
                    Transformer transformer = transFactory.newTransformer();                    
                    StringWriter buffer = new StringWriter();
                    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
                    transformer.transform(new DOMSource((Node) o),
                            new StreamResult(buffer));
                    String str = buffer.toString();
                    if (str.indexOf("targetNamespace=\"http://schemas.microsoft.com/sqlserver/2004/sqltypes\"")>0){
                        File f=new File("schemas"+File.separator+"SqlTypes.xsd");
                        System.out.println(f.getAbsolutePath());                        
                        FileWriter fw = new FileWriter(f);                                              
                        fw.write(str);
                        fw.close();
                    }else if (str.indexOf("targetNamespace=\"urn:schemas-microsoft-com:sql:SqlRowSet1\"")>0){
                        File f=new File("schemas"+File.separator+"PlanSchema.xsd");
                        System.out.println(f.getAbsolutePath());
                        FileWriter fw = new FileWriter(f);
                        //correct the import
                        String newString ="";
                        String xsdImport="xsd:import namespace=\"http://schemas.microsoft.com/sqlserver/2004/sqltypes\"";
                        String locImport=" schemaLocation=\"SqlTypes.xsd\"";   
                        int index=str.indexOf(xsdImport);
                        newString=str.substring(0,index+xsdImport.length());
                        newString+=locImport;
                        newString+=str.substring(index+xsdImport.length());  
                        
                        fw.write(newString);
                        fw.close();
                    }
                }
            }
        }


    }
}
