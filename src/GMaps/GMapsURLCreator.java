package GMaps;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class GMapsURLCreator {
    
    private final String URL_ADDRESS = "https://maps.googleapis.com/maps/api/geocode/";
    private final String DOCUMENT_TYPE = "xml";
    private URL URL;
    
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
            System.out.println(URLBuilder.toString());
        } catch (MalformedURLException ex) {
            System.out.println("ERROR: Impossible create URL");
        }
    }
    
    public URL getURL(){
        return URL;
    }
}
