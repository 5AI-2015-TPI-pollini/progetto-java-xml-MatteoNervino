package MyLocation;

public class Weather {
    
    private String temperature, tempMin, tempMax;
    private String Pressure;
    private String date;
    private String icon;
    private String Humidity;
    private String Description;

    public Weather(String temperature, String tempMin, String tempMax, String Pressure, String date, String icon, String Humidity, String Description) {
        this.temperature = temperature;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.Pressure = Pressure;
        this.date = date;
        this.icon = icon;
        this.Humidity = Humidity;
        this.Description = Description;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTempMin() {
        return tempMin;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public String getTempMax() {
        return tempMax;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    public String getPressure() {
        return Pressure;
    }

    public void setPressure(String Pressure) {
        this.Pressure = Pressure;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHumidity() {
        return Humidity;
    }

    public void setHumidity(String Humidity) {
        this.Humidity = Humidity;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
}
