package com.qascript;

import java.util.Arrays;

public class ArreyMethods {

    public static void main(String[] args) {

        int arr[] = {2,4,25,14,10};
        int arr2[] = {4,5,6,7,1};
        Arrays.sort(arr);


        System.out.println("Length of the Array: "+ arr.length);
        System.out.println("Sort array: " + Arrays.toString(arr));

        if(arr.equals(arr2)) {
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }



    }
}
