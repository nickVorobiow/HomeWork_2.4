package transport;

import javax.swing.*;

public class Car extends Transport{

    private String engineVolume;
    private String gear;
    private final String carBodyType;
    private String number;
    private final String seats;
    private boolean hasSpikes;

    public Car(String brand, String model, String engineVolume,
               String color, String year, String country,
               String gear, String carBodyType, String number, String seats,
               boolean hasSpikes, String maxSpeed) {

        super(brand, model, year, country, color, maxSpeed);

        if (Double.parseDouble(engineVolume) <= 0) {this.engineVolume = "1.5";}
        else {this.engineVolume = engineVolume;}

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

    public String getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(String engineVolume) {
        if (Double.parseDouble(engineVolume) <= 0) {this.engineVolume = "1.5";}
        else {this.engineVolume = engineVolume;}
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if (!(Integer.parseInt(gear) >= 1 && Integer.parseInt(gear) <= 8)) {this.gear = "default";}
        else {this.gear = gear;}
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number == "" || number == "0") {this.number = "default";}
        else {this.number = number;}
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
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", Engine volume='" + engineVolume + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", year='" + super.getYear() + '\'' +
                ", country='" + super.getCountry() + '\'' +
                ", gear='" + gear + '\'' +
                ", carBodyType='" + carBodyType + '\'' +
                ", number='" + number + '\'' +
                ", seats='" + seats + '\'' +
                ", has spikes=" + hasSpikes +
                ", max speed=" + super.getMaxSpeed() +
                '}';
    }

    public class Key {
        private final boolean distantEnginePower;
        private final boolean withoutKeyAccess;

        public Key(boolean distantEnginePower, boolean withoutKeyAccess) {
            if (new Boolean(distantEnginePower) ==  null) {this.distantEnginePower = false;}
            else {this.distantEnginePower = distantEnginePower;}

            if (new Boolean(withoutKeyAccess) == null) {this.withoutKeyAccess = false;}
            else {this.withoutKeyAccess = withoutKeyAccess;}
        }

        @Override
        public String toString() {
            return "distantEnginePower=" + distantEnginePower +
                    ", withoutKeyAccess=" + withoutKeyAccess;
        }
    }
}
