package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, String year, String country, String color, String maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", year='" + super.getYear() + '\'' +
                ", country='" + super.getCountry() + '\'' +
                ", max speed=" + super.getMaxSpeed() +
                '}';
    }
}
