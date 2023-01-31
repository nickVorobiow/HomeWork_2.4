package transport;

public class Cargo extends Transport {

    public Cargo(String brand, String model, String engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Cargo car starts moving...");
    }
    @Override
    public void stopMove() {
        System.out.println("Cargo car stops moving...");
    }

    @Override
    public String toString() {
        return "Cargo{" +
                super.toString() +
                '}';
    }
}
