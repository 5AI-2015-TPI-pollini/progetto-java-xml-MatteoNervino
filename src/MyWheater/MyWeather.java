package MyWheater;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyWeather {

    public static void main(String[] args) {
        
        
        /*
        System.out.print("Insert the location: ");
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
        OpenWeatherXPath xpWeather = new OpenWeatherXPath(XMfgL.getXML());
        System.out.println(xpWeather.getWeather());*/
    }
    
}
