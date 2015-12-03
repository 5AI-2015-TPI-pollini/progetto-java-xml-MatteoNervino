package MyLocation;

/**
 * Class that contains the geographical information about one location
 * @author Matteo Nervino
 */
public class Location {
    
    private String address;
    private Coordinates coordinates;
    private Weather weather;
    
    /**
     *
     * @param address
     * @param coordinates
     */
    public Location(String address,Coordinates coordinates){
        this.address = address;
        this.coordinates = coordinates;
    }
    
    /**
     *
     * @param coordinates
     */
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    
    /**
     *
     * @return
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }
    
    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }
    
    /**
     *
     * @return
     */
    public Weather getWeather() {
        return weather;
    }
    
    @Override
    public String toString(){
        return address;
        
    }
    
}
