package com.qascript;

public class Addnumbers {

    public static void main(String[] args) {
        addNumbers(4,5);
        addNumbers(3,5);
        addNumbers(9,1);

        int result = addNumbers(6,5);
        int output = result + 5;
        System.out.println("Increment the output: " + output);
    }
    public static int addNumbers(int num1, int num2){
        int res = num1 + num2;
        System.out.println("Addition of two numbers: "+ res);


        return res;
    }
}
