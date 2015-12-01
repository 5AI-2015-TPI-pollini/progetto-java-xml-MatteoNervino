package MyWheater;

import GMaps.GMapsXPath;
import Utilities.XMLDownloader;
import GMaps.GMapsURLCreator;
import MyLocation.Location;
import OpenWeather.OpenWeatherURLCreator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

public class MyWeather {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        
        System.out.println("Inserisci luogo: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        
        GMapsURLCreator url = new GMapsURLCreator(input);
        XMLDownloader XML = new XMLDownloader(url.getURL());
        ArrayList<Location> locations = new ArrayList();
        GMapsXPath xpath = new GMapsXPath(XML.getXML());
        locations = xpath.getLocations();
        System.out.println(locations);
        OpenWeatherURLCreator weather = new OpenWeatherURLCreator(locations.get(0).getCoordinates(),1);
        XMLDownloader XMfgL = new XMLDownloader(weather.getURL());
        XMfgL.printXML();
    }
    
}
