package com.qascript;

public class Audi {

    public static void main(String[] args) {

        Car audi = new Car();
        audi.setColour("red");
        audi.setSize(60);
        audi.setWeight(25.35);
        audi.displayCar();


        Car.accelerate();
        Car.start();

      displayLogo();
    }

    private static void displayLogo() {
    }

    public static void displayLogo(String s1){
        System.out.println("Logo is: "+ s1);
    }
    public static void displayLogo(int s){
        System.out.println("Logo is: "+ s);
    }
}
