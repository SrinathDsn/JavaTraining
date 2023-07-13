package com.qascript;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListExamples {


    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));



    }

}
