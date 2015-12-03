package Utilities;

/**
 * Class used for download a XML file
 * 
 * @author Nervino Matteo
 */
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 *
 * @author Matteo Nervino
 */
public class XMLDownloader {
    
    private org.w3c.dom.Document XML;
    
    /**
     * This methods download a XML from the URL gived as parameter
     * @param URL
     * @throws SAXException
     * @throws ParserConfigurationException 
     */
    public XMLDownloader(URL URL) throws  SAXException, ParserConfigurationException {
        
        
        try {
            //Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.168.0.1", 8080));
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            URLConnection connection = URL.openConnection();
            XML = builderFactory.newDocumentBuilder().parse(connection.getInputStream());     
        } catch (IOException ex) {
            System.out.println("ERROR: cannot connect to Proxy");
        }
    }
    
    /**
     *
     * @throws TransformerException
     */
    public void printXML() throws TransformerException {
        TransformerFactory factory2 = TransformerFactory.newInstance();
        Transformer xform = factory2.newTransformer();
        xform.transform(new DOMSource((Node) XML), new StreamResult(System.out));        
    }
    
    /**
     *
     * @return
     */
    public Document getXML(){
        return XML;
    }
}
