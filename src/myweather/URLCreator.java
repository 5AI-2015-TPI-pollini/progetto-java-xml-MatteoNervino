package myweather;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class URLCreator {
    
    private final String URL_ADDRESS = "https://maps.googleapis.com/maps/api/geocode/";
    private final String DOCUMENT_TYPE = "xml";
    private URL URL;
    
    public URLCreator (Location location) {
        StringBuilder URLBuilder = new StringBuilder(URL_ADDRESS);
        URLBuilder.append(DOCUMENT_TYPE+"?address=");
        try {
            URLBuilder.append(URLEncoder.encode(location.getAddress(), "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            System.out.println("ERROR: Impossible append location\n");
        }
        
        try {
            URL = new URL(URLBuilder.toString());
        } catch (MalformedURLException ex) {
            System.out.println("ERROR: Impossible create URL");
        }
    }
    
    public URL getURL(){
        return URL;
    }
}
