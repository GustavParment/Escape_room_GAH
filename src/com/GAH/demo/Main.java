package com.GAH.demo;

public class Main {
    public static void main(String[] args) {


        int a = 0;

        int b = 1;

        int sum = 0;

        int result = 0;

        for (int i = 0; sum < 2_000000; i++) {

            sum = a +b ;
            a = b;
            b = sum;

            if (sum % 2 == 0){

                result += sum;
            }

        }
        System.out.println(result);


    }
    }

