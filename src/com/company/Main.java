package com.company;

import transport.Car;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", "1.6", "yellow",
                "0", "Russia", "6", "sedan", "", "5", true, "180");
        Car.Key key1 = car1.new Key(false, false);

        Car car2 = new Car("Audi", "A8 50 L TDI quattro", "3.0", "black",
                "2020", "Germany", "7", "sedan", "777", "4", false , "250");
        Car.Key key2 = car2.new Key(false, false);

        Car car3 = new Car("BMW", "Z8", "3.0", "black",
                "0", "Germany", "8", "sedan", "555", "5", false, "270");
        Car.Key key3 = car3.new Key(false, false);

        Car car4 = new Car("Kia", "Sportage 4th generation", "2.4", "red",
                "2018", "Southern Korea", "6", "suv", "161", "5", true, "200");
        Car.Key key4 = car4.new Key(false, false);

        Car car5 = new Car("Huyndai", "Avante", "0", "orange",
                "2016", "Southern Korea", "4", "bus", "164", "15", false, "160");
        Car.Key key5 = car5.new Key(false, false);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5 + "\n");

        car1.setSeasonTyres(6);
        car2.setSeasonTyres(6);
        car3.setSeasonTyres(6);
        car4.setSeasonTyres(6);
        car5.setSeasonTyres(6);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
