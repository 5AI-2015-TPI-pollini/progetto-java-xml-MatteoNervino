package myweather;

public class Coordinates {
    
    private String longitude;
    private String latitude;
    
    public Coordinates (String latitude, String longitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    public String getLatitude() {
        return latitude;
    }
    
    public String getLongitude() {
       return longitude;
    }
}
