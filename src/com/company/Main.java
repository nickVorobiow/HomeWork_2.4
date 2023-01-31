package com.company;


import transport.Bus;
import transport.Car;
import transport.Cargo;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A5", "3.0");
        Car car2 = new Car("Maseratti", "Granturismo", "4.4");
        Car car3 = new Car("Mitsubishi", "Evolution", "2.0");
        Car car4 = new Car("Nissan", "r32", "2.6");

        Bus bus1 = new Bus("Mercedes", "merin", "7.0");
        Bus bus2 = new Bus("VW", "wag", "6.0");
        Bus bus3 = new Bus("LiAZ", "2023", "8.0");
        Bus bus4 = new Bus("Great Wall", "modelX", "10.0");

        Cargo cargo1 = new Cargo("KamAz", "KamAZ_2023", "5.0");
        Cargo cargo2 = new Cargo("Tatra", "model_X", "3.5");
        Cargo cargo3 = new Cargo("Skoda", "Racing cargo model", "4.0");
        Cargo cargo4 = new Cargo("Mitsubishi", "L200", "3.0");

        System.out.println(car1);
        System.out.println(bus1);
        System.out.println(cargo1 + "\n");

        bus2.startMove();
        bus2.stopMove();
    }
}
