package GMaps;

/**
 * Class used to extrapolates the information in a XML file
 * @author Nervino Matteo
 */
import MyLocation.Location;
import MyLocation.Coordinates;
import java.util.ArrayList;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class GMapsXPath {
    
    private static final javax.xml.xpath.XPathFactory xpathFactory = javax.xml.xpath.XPathFactory.newInstance();
    private Document XML;
    private ArrayList<Location> locations = new ArrayList();
    
    //XPath node request
    private final String GET_ADDRESS = "/GeocodeResponse/result/formatted_address/text()";
    private final String GET_LATITUDE = "/GeocodeResponse/result/geometry/location/lat/text()";
    private final String GET_LONGITUDE = "/GeocodeResponse/result/geometry/location/lng/text()";
    
    public GMapsXPath(Document importedXML){
        
        XML = importedXML; 
        XPath xpath = xpathFactory.newXPath();
        locations = new ArrayList();
        
        try {
            //Prepare XPath requests
            javax.xml.xpath.XPathExpression address = xpath.compile(GET_ADDRESS);
            javax.xml.xpath.XPathExpression latitude = xpath.compile(GET_LATITUDE);
            javax.xml.xpath.XPathExpression longitude = xpath.compile(GET_LONGITUDE);
            
            //Execute XPath requests
            NodeList addresses = (NodeList) address.evaluate(XML, XPathConstants.NODESET);
            NodeList latitudes = (NodeList) latitude.evaluate(XML, XPathConstants.NODESET);
            NodeList longitudes = (NodeList) longitude.evaluate(XML, XPathConstants.NODESET);
            
            System.out.println(addresses.getLength() + " locations founded");
            for(int i=0;i<addresses.getLength();i++){
                Coordinates coordinate = new Coordinates(latitudes.item(i).getNodeValue(), longitudes.item(i).getNodeValue());
                locations.add(new Location(addresses.item(i).getNodeValue(), coordinate));
            }
            
        } catch (XPathExpressionException ex) {
            System.out.println("ERROR: XPath error");
            locations = null;
        }   
    }
    
    public ArrayList<Location> getLocations(){
        return locations;
    }
}
