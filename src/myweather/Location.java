package myweather;

public class Location {
    
    private String address;
    private Coordinates coordinates;
    private Wheather wheather;
    
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
    
    @Override
    public String toString(){
        return "Address: "+address+"\nLatitude: "+coordinates.getLatitude()+"\nLongitude: "+coordinates.getLongitude();
        
    }
    
}
