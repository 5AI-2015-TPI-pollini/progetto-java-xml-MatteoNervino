package OpenWeather;

/**
 * Class used for creat the URL where download the XML OpenWeather file
 * 
 * @author Nervino Matteo
 */

import MyLocation.Coordinates;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Matteo Nervino
 */
public class OpenWeatherURLCreator {
    
    private final String URL_ADDRESS = "http://api.openweathermap.org/data/2.5/weather?";
    private final String DOCUMENT_TYPE = "&mode=xml";
    private final String METRIC_UNIT = "&units=metric";
    private final String IMPERIAL_UNIT = "&units=imperial";
    private final String OPEN_WEATHER_ID = "&appid=2de143494c0b295cca9337e1e96b00e0";
    private URL URL;

    /**
     * @author Nervino Matteo
     * @param coordinates
     * @param metricType (1 = Celsius, 2 = Fahrenheit)
     */
    public OpenWeatherURLCreator (Coordinates coordinates, int metricType) {
        
        String latitude = "lat="+coordinates.getLatitude();
        String longitude = "&lon="+coordinates.getLongitude();
        StringBuilder URLBuilder = new StringBuilder(URL_ADDRESS);
        URLBuilder.append(latitude);
        URLBuilder.append(longitude);
        URLBuilder.append(DOCUMENT_TYPE);
        URLBuilder.append(OPEN_WEATHER_ID);
        if(metricType==0)
            URLBuilder.append(IMPERIAL_UNIT);
        else
            URLBuilder.append(METRIC_UNIT);
        
        try {
            URL = new URL(URLBuilder.toString());
            System.out.println(URLBuilder.toString());
        } catch (MalformedURLException ex) {
            System.out.println("ERROR: Impossible create Open Weather URL");
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
