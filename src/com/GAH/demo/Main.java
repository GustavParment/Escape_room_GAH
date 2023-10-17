package com.GAH.demo;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int a;
        int b;
        int c;


        for (a = 0; a <= 950; a++) {

            for (b = a + 1; b <= 950; b++) {

                for (c = b + 1; c <= 950; c++) {

                    if (a + b + c == 950 && a*a + b*b == c*c) {
                        System.out.println("a: " + a + " b: " + b + " C: " + c + " Result: " + a * b * c);
                    }

                }


                for (int a = 1; a <= 950; a++) {

                    for (int b = a + 1; b <= 950; b++) {

                        int c = 950 - a - b;

                        if (a * a + b * b == c * c) {

                            System.out.println("Produkt abc = " + (a * b * c));

                        }
                    }
                }
            }
        }
    }
}


