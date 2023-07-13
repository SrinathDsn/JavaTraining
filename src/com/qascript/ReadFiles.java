package com.qascript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Selenium");
           int s = fis.read();

            System.out.println((char) s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}