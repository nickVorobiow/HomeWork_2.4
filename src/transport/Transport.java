package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final String year;
    private final String country;
    private String color;
    private String maxSpeed;

    public Transport(String brand, String model, String year,
                     String country, String color, String maxSpeed) {
        if(brand == null) {this.brand = "set brand";}
        else {this.brand = brand;}
        if(model == null) {this.model = "set model";}
        else {this.model = model;}
        if(year == null) {this.year = "set year";}
        else {this.year = year;}
        if(country == null) {this.country = "set country";}
        else {this.country = country;}
        if (color == null) {this.color = "set color";}
        else {this.color = color;}
        if(maxSpeed == null) {this.maxSpeed = "set max speed";}
        else {this.maxSpeed = maxSpeed;}
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {this.color = "set color";}
        else {this.color = color;}
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        if(maxSpeed == null) {this.maxSpeed = "set max speed";}
        else {this.maxSpeed = maxSpeed;}
    }
}

