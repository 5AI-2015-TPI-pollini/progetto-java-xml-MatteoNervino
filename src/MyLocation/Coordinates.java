package MyLocation;
/**
 * Class used to save the latitude and longitude
 * @author Matteo Nervino
 */
public class Coordinates {
    
    private String longitude;
    private String latitude;
    
    /**
     *
     * @param latitude
     * @param longitude
     */
    public Coordinates (String latitude, String longitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    /**
     *
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    
    /**
     *
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    /**
     *
     * @return
     */
    public String getLatitude() {
        return latitude;
    }
    
    /**
     *
     * @return
     */
    public String getLongitude() {
       return longitude;
    }
}
