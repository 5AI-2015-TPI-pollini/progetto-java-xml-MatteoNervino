package MyLocation;

/**
 * Class that contains the geographical information about one location
 * @author Matteo Nervino
 */
public class Location {
    
    private String address;
    private Coordinates coordinates;
    private Weather weather;
    
    public Location(String address,Coordinates coordinates){
        this.address = address;
        this.coordinates = coordinates;
    }
    
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    
    public Coordinates getCoordinates() {
        return coordinates;
    }
    
    public String getAddress() {
        return address;
    }
    
    public Weather getWeather() {
        return weather;
    }
    
    @Override
    public String toString(){
        return address;
        
    }
    
}
