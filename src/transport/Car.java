package transport;

import javax.swing.*;

public class Car {
    private final String brand;
    private final String model;
    private String engineVolume;
    private String color;
    private final String year;
    private final String country;
    private String gear;
    private final String carBodyType;
    private String number;
    private final String seats;
    private boolean hasSpikes;

    public Car(String brand, String model, String engineVolume, String color, String year, String country,
               String gear, String carBodyType, String number, String seats, boolean hasSpikes) {
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

        if (!(Integer.parseInt(gear) >= 1 && Integer.parseInt(gear) <= 8)) {this.gear = "default";}
        else {this.gear = gear;}

        if (carBodyType == "") {this.carBodyType = "default";}
        else {this.carBodyType = carBodyType;}

        if (number == "" || number == "0") {this.number = "default";}
        else {this.number = number;}

        if (Integer.parseInt(seats) < 2) {this.seats = "5";}
        else {this.seats = seats;}

        this.hasSpikes = hasSpikes;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public String getCountry() {
        return country;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSeats() {
        return seats;
    }

    public boolean isWithSpikes() {
        return hasSpikes;
    }

    public void setSeasonTyres(int monthNumber) {
        if (CarService.hasSpikes(monthNumber)) {
            hasSpikes = true;
        }
        else {hasSpikes = false;}
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                ", gear='" + gear + '\'' +
                ", carBodyType='" + carBodyType + '\'' +
                ", number='" + number + '\'' +
                ", seats='" + seats + '\'' +
                ", hasSpikes=" + hasSpikes +
                '}';
    }

    public class Key {
        private final boolean distantEnginePower;
        private final boolean withoutKeyAccess;

        public Key(boolean distantEnginePower, boolean withoutKeyAccess) {
            if (new Boolean(distantEnginePower) == null) {this.distantEnginePower = false;}
            else {this.distantEnginePower = distantEnginePower;}

            if (new Boolean(withoutKeyAccess) == null) {this.withoutKeyAccess = false;}
            else {this.withoutKeyAccess = withoutKeyAccess;}
        }
    }
}
