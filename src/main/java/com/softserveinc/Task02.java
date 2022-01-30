package com.softserveinc;

import java.util.Locale;
import java.util.Scanner;

/*
    Write a program that displays a table of temperature correspondence in degrees Celsius and Fahrenheit (F°=9/5·C° + 32).
    The user should input the temperature range in degrees Celsius and the step.

    The example below shows how your output might look. The symbol >>> represents the user input.
    Notice that it's not the part of the input.

    t1 >>> 0
    t2 >>> 10
    dt >>> 1
    -----------------
    C       F
    -----------------
    0.00    32.00
    1.00    33.80
    2.00    35.60
    3.00    37.40
    4.00    39.20
    5.00    41.00
    6.00    42.80
    7.00    44.60
    8.00    46.40
    9.00    48.20
    10.00    50.00
    -----------------
 */
public class Task02 {
    public static void main(String[] args) {

        System.out.print("t1 >>> ");
        Scanner scannerT1 = new Scanner(System.in);
        double t1 = scannerT1.nextDouble();

        System.out.print("t2 >>> ");
        Scanner scannerT2 = new Scanner(System.in);
        double t2 = scannerT2.nextDouble();

        System.out.print("dt >>> ");
        Scanner scannerDt = new Scanner(System.in);
        double dt = scannerDt.nextDouble();

        System.out.println("---------------------------");
        System.out.println("|   C             F        ");
        System.out.println("---------------------------");

        double tempT = t1;
        while (tempT <= t2){
            double tempF = 1.8 * tempT + 32;
            System.out.printf("|  %.2f     %.2f\n", tempT, tempF);
            tempT = tempT + dt;
        }
        System.out.println("---------------------------");
    }
}
