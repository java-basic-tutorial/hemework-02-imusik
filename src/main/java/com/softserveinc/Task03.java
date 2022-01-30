package com.softserveinc;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Write a program that determines the minimum of a sequence positive numbers (the length of the sequence is not limited).

    The user should input the numbers until enter a zero or negative number.

    The example below shows how your output might look. The symbol >>> represents the user input.
    Notice that it's not the part of the input.

    Enter the number after symbol >>>. To exit enter a zero.
    >>> 12
    >>> 75
    >>> 10
    >>> 9
    >>> 23
    >>> 0
    Minimum number is 9
 */
public class Task03 {
    public static void main(String[] args) {
        int value;
        int[] newValues= new int[10];
        int j = 0;
        do {
            System.out.print(">>> ");
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();
            if (value>0) {
                newValues[j]=value;
                j++;
            }
        } while (value>0);
        int min = newValues[0];
        for (int i = 0; i < j; i++) {
            int tempValue = newValues[i];
            if (tempValue>0&&tempValue<min) {
                min = tempValue;
            }
        }
        System.out.println("Minimum number is " + min);

        // TODO: Write your code here

    }
}
