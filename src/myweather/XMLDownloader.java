package myweather;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class XMLDownloader {
    
    private Document XML;
    private URL address;
    
    public XMLDownloader(URLCreator URL) throws SAXException, ParserConfigurationException {
        
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("192.168.0.1", 8080));
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        
        try {
            URLConnection connection = URL.getURL().openConnection(proxy);
            XML = (Document) builder.parse(connection.getInputStream());
        } catch (IOException ex) {
            System.out.println("ERROR: impossible connect to the Proxy");
        }
        
        /*
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer xform = factory.newTransformer();

        // that’s the default xform; use a stylesheet to get a real one
            xform.transform(new DOMSource(doc), new StreamResult(System.out));*/
    }
}
