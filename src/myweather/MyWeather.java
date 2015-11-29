package myweather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

public class MyWeather {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        
        System.out.println("Inserisci luogo: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        
        Location location = new Location(input);
        URLCreator url = new URLCreator(location);
        XMLDownloader XML = new XMLDownloader(url);
    }
    
}
