package transport;

import javax.swing.*;

public class Car extends Transport{

    public Car(String brand, String model, String engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Car starts moving...");
    }
    @Override
    public void stopMove() {
        System.out.println("Car stops moving...");
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
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
