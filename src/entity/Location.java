package entity;

public class Location {
    private String cityName;

    private double longitude;
    private double latitude;

    public Location(String city) {
        this.cityName = city;
    }

    public Location(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getCityName() {
        return cityName;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
