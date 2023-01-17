package com.company;

public class Main {

    public static void main(String[] args) {
        Auto auto1 = new Auto("Lada", "Granta", "1.6", "yellow",
                "0", "Russia");
        Auto auto2 = new Auto("Audi", "A8 50 L TDI quattro", "3.0", "black",
                "2020", "Germany");
        Auto auto3 = new Auto("BMW", "Z8", "3.0", "black",
                "0", "Germany");
        Auto auto4 = new Auto("Kia", "Sportage 4th generation", "2.4", "red",
                "2018", "Southern Korea");
        Auto auto5 = new Auto("Huyndai", "Avante", "0", "orange",
                "2016", "Southern Korea");
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
        System.out.println(auto5);
    }
}
