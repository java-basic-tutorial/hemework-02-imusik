package com.softserveinc;

import java.util.Arrays;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
                              //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = { -1.7, -1.0, 2.6,  9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9,  1.4 };

        int count = temperature.length;
        double average = Arrays.stream(temperature).sum()/ count;
        System.out.println("Average annual temperature: " + average);

        double minTemp = temperature[0];
        double maxTemp =temperature[0];
        int minMonth = 1;
        int maxMonth = 1;

        for (int i = 0; i < count; i++) {
            double value = temperature[i];
            if (value<minTemp) {
                minTemp = value;
                minMonth = i +1;
            }
            else if (value>maxTemp) {
                maxTemp = value;
                maxMonth = i +1;
            }
        }

        System.out.println("Month with the lowest temperature in a year: " + convertToRome(minMonth));
        System.out.println("The month with the highest temperatures in a year: " + convertToRome(maxMonth));
    }

    private static String convertToRome(int month){
        String stringMonth;
        switch (month){
            case 1:
                stringMonth = "I";
                break;
            case 2:
                stringMonth = "II";
                break;
            case 3:
                stringMonth = "III";
                break;
            case 4:
                stringMonth = "IV";
                break;
            case 5:
                stringMonth = "V";
                break;
            case 6:
                stringMonth = "VI";
                break;
            case 7:
                stringMonth = "VII";
                break;
            case 8:
                stringMonth = "VIII";
                break;
            case 9:
                stringMonth = "IX";
                break;
            case 10:
                stringMonth = "X";
                break;
            case 11:
                stringMonth = "XI";
                break;
            case 12:
                stringMonth = "XII";
                break;
            default:
                stringMonth = "NoMonth";
                break;
        }
        return stringMonth;
    }
}