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

    public Weather(String temperature, String pressure, String icon, String humidity, String description) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.icon = icon;
        this.humidity = humidity;
        this.description = description;
    }
    
    public Weather(Weather w) {
        this.temperature = w.temperature;
        this.pressure = w.pressure;
        this.icon = w.icon;
        this.humidity = w.humidity;
        this.description = w.description;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String Pressure) {
        this.pressure = Pressure;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String Humidity) {
        this.humidity = Humidity;
    }

    public String getDescription() {
        return description;
    }

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
