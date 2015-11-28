package myweather;

public class Location {
    
    private String address;
    private Coordinates coordinates;
    private Wheather wheather;
    
    public Location(String address){
        this.address = address;
    }
    
    public void setCoordinates(double latitude, double longitude) {
        coordinates = new Coordinates(latitude,longitude);
    }
    
    public Coordinates getCoordinates() {
        return coordinates;
    }
    
    public String getAddress() {
        return address;
    }
    
}
