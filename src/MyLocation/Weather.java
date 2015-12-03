package MyLocation;
/**
 * Class that contains the weather information about one location
 * @author Matteo Nervino
 */
public class Weather {
    
    private String temperature;
    private String pressure;
    private String icon;
    private String humidity;
    private String description;

    /**
     *
     * @param temperature
     * @param pressure
     * @param icon
     * @param humidity
     * @param description
     */
    public Weather(String temperature, String pressure, String icon, String humidity, String description) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.icon = icon;
        this.humidity = humidity;
        this.description = description;
    }
    
    /**
     *
     * @param w
     */
    public Weather(Weather w) {
        this.temperature = w.temperature;
        this.pressure = w.pressure;
        this.icon = w.icon;
        this.humidity = w.humidity;
        this.description = w.description;
    }

    /**
     *
     * @return
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     *
     * @param temperature
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     *
     * @return
     */
    public String getPressure() {
        return pressure;
    }

    /**
     *
     * @param Pressure
     */
    public void setPressure(String Pressure) {
        this.pressure = Pressure;
    }

    /**
     *
     * @return
     */
    public String getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     *
     * @return
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     *
     * @param Humidity
     */
    public void setHumidity(String Humidity) {
        this.humidity = Humidity;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param Description
     */
    public void setDescription(String Description) {
        this.description = Description;
    }
    
    @Override
    public String toString(){
        return  "Temperature: " + temperature +
                "\nPressure: " + pressure +
                "\nHumidity: " + humidity +
                "\nWeather condition: " + description;
    }
}
