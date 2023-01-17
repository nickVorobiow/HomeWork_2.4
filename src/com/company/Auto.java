package com.company;

public class Auto {
    private String brand;
    private String model;
    private String engineVolume;
    private String color;
    private String year;
    private String country;

    public Auto(String brand, String model, String engineVolume, String color, String year, String country) {
        if (model == "") {this.model = "default";}
        else {this.model = model;}

        if (brand == "") {this.brand = "default";}
        else {this.brand = brand;}

        if (country == "") {this.country = "default";}
        else {this.country = country;}

        if (Double.parseDouble(engineVolume) <= 0) {this.engineVolume = "1.5";}
        else {this.engineVolume = engineVolume;}

        if (color == "") {this.color = "white";}
        else {this.color = color;}

        if (Integer.parseInt(year) <= 0) {this.year = "2000";}
        else {this.year = year;}
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
