package GMaps;

/**
 * Class used for creat the URL where download the XML Geocoding file
 * 
 * @author Nervino Matteo
 */

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 *
 * @author Matteo Nervino
 */
public class GMapsURLCreator {

    private final String URL_ADDRESS = "https://maps.googleapis.com/maps/api/geocode/";
    private final String DOCUMENT_TYPE = "xml";
    private URL URL;
    
    /**
     * Gived a String with the location it creats the URL
     * 
     * @author Nervino Matteo
     * @param location 
     */
    public GMapsURLCreator (String location) {
        StringBuilder URLBuilder = new StringBuilder(URL_ADDRESS);
        URLBuilder.append(DOCUMENT_TYPE);
        URLBuilder.append("?address=");
        try {
            URLBuilder.append(URLEncoder.encode(location, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            System.out.println("ERROR: Impossible append location\n");
        }
        
        try {
            URL = new URL(URLBuilder.toString());
            System.out.println("GMaps URL created: "+ URLBuilder.toString());
        } catch (MalformedURLException ex) {
            System.out.println("ERROR: Impossible create GoogleMaps URL");
        }
    }
    
    /**
     *
     * @return
     */
    public URL getURL(){
        return URL;
    }
}
