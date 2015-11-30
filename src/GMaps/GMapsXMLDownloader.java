package GMaps;

import GMaps.GMapsURLCreator;
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

public class GMapsXMLDownloader {
    
    private org.w3c.dom.Document XML;
    private URL address;
    
    public GMapsXMLDownloader(GMapsURLCreator URL) throws  SAXException, ParserConfigurationException {
        
        address = URL.getURL();
        
        try {       
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.168.0.1", 8080));
            URLConnection connection = address.openConnection();
            XML = builderFactory.newDocumentBuilder().parse(connection.getInputStream());     
        } catch (IOException ex) {
            System.out.println("ERROR: cannot connect to Proxy");
        }
    }
    
    public void printXML() throws TransformerException {
        TransformerFactory factory2 = TransformerFactory.newInstance();
        Transformer xform = factory2.newTransformer();
        xform.transform(new DOMSource((Node) XML), new StreamResult(System.out));        
    }
    
    public Document getXML(){
        return XML;
    }
}
