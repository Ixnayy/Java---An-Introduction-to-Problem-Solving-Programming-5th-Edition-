
/**
 * Repeat CH3. PP.4, but use a loop that reads and processes sentences until
 * the user says to end the program.
 *
 * Name: Sam Fragapane III
 * Version: 1.0.0
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        do {
            System.out.println("Please enter a one-line sentence.");
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();
            int lastIndex = input.length() - 1;
            char lastChar = input.charAt(lastIndex);
            boolean isEven = (input.length() % 2) == 0;
            boolean isOdd = (input.length() % 2) == 1;
            boolean isEnd = (input.compareToIgnoreCase("End") == 0);

            if (lastChar == '?' && isEven)
                System.out.println("Yes.");
            else if (lastChar == '?' && isOdd)
                System.out.println("No.");
            else if (lastChar == '!')
                System.out.println("Wow.");
            else
                System.out.println("You always say \"" + input + "\".");

            if (isEnd)
                x = -1;
            else x =1;

        }while (x>0);
    }}