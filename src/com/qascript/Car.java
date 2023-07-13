package com.qascript;

import java.sql.SQLOutput;

public class Car {



      private String colour;
      private int size;
      private double weight;



      public static void start(){

          System.out.println("Press the start button");
        }

        public static void accelerate(){
            System.out.println("press the accelerator");

    }
        public void setColour(String colour){
          this.colour = colour;
        }
        public void setSize(int size){
          this.size =size;
        }
        public void setWeight(double weight){
          this.weight = weight;
        }
        public void displayCar(){
            System.out.println("Colour of the car is: "+ colour);
            System.out.println("Weight of the car is: "+ weight);
            System.out.println("Size of the car is: "+ size);
      }
}