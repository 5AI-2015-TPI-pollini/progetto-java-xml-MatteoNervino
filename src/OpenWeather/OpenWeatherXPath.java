package OpenWeather;

import MyLocation.Coordinates;
import MyLocation.Location;
import MyLocation.Weather;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class OpenWeatherXPath {
    
    private static final javax.xml.xpath.XPathFactory xpathFactory = javax.xml.xpath.XPathFactory.newInstance();
    private final Document XML;
    private Weather weather;
    
    //XPath node request
    private final String GET_TEMPERATURE = "/current/temperature/@value";
    private final String GET_TEMPERATURE_UNIT = "/current/temperature/@unit";
    private final String GET_PRESSURE = "/current/pressure/@value";
    private final String GET_PRESSURE_UNIT = "/current/pressure/@unit";
    private final String GET_HUMIDITY = "/current/humidity/@value";
    private final String GET_HUMIDITY_UNIT = "/current/humidity/@unit";
    private final String GET_WEATHER = "/current/weather/@value";
    private final String GET_ICON = "/current/weather/@icon";
    
    public OpenWeatherXPath(Document importedXML){
        
        XML = importedXML; 
        XPath xpath = xpathFactory.newXPath();   
        
        try {
            //Prepare XPath requests
            javax.xml.xpath.XPathExpression temperature = xpath.compile(GET_TEMPERATURE);
            javax.xml.xpath.XPathExpression temperatureUnit = xpath.compile(GET_TEMPERATURE_UNIT);
            javax.xml.xpath.XPathExpression pressure = xpath.compile(GET_PRESSURE);
            javax.xml.xpath.XPathExpression pressureUnit = xpath.compile(GET_PRESSURE_UNIT);
            javax.xml.xpath.XPathExpression humidity = xpath.compile(GET_HUMIDITY);
            javax.xml.xpath.XPathExpression humidityUnit = xpath.compile(GET_HUMIDITY_UNIT);
            javax.xml.xpath.XPathExpression condition = xpath.compile(GET_WEATHER);
            javax.xml.xpath.XPathExpression icon = xpath.compile(GET_ICON);
            
            //Execute XPath requests
            String temperatureN = (String) temperature.evaluate(XML, XPathConstants.STRING);
            String temperatureUnitN = (String) temperatureUnit.evaluate(XML, XPathConstants.STRING);
            if(temperatureUnitN.equalsIgnoreCase("metric"))
                temperatureN += "°C";
            else if(temperatureUnitN.equalsIgnoreCase("imperial"))
                temperatureN += "°F";
            else
                temperatureN += "°K";
                
            String pressureN = (String) pressure.evaluate(XML, XPathConstants.STRING);
            pressureN += " " + (String) pressureUnit.evaluate(XML, XPathConstants.STRING);
            String humidityN = (String) humidity.evaluate(XML, XPathConstants.STRING);
            humidityN += " " + (String) humidityUnit.evaluate(XML, XPathConstants.STRING);
            String conditionN = (String) condition.evaluate(XML, XPathConstants.STRING);
            String iconN = (String) icon.evaluate(XML, XPathConstants.STRING);
            
            System.out.println(pressureN);
            
            weather = new Weather(temperatureN,pressureN,iconN,humidityN,conditionN);
            
        } catch (XPathExpressionException ex) {
            System.out.println("ERROR: XPath error");
            weather = null;
        }
    }
    
    public Weather getWeather() {
            return weather;
        }
}
