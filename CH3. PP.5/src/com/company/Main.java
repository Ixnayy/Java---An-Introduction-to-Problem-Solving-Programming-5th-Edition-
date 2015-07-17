
/**
 * Write a program that allows the user to convert a temperature given in degrees from either
 * Celsius to Fahrenheit or Fahrenheit to Celsius. Prompt the user to enter a temperature and either
 * a C or c for Celsius or an F or F for Fahrenheit. Convert the temperature to the opposite one.
 * Display the result in a readable format. If anything other than C,c,F, or f is entered,
 * print an error message and stop.
 *
 * Name: Sam Fragapane III
 * Version: 1.0.0
 */
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in) ;
        System.out.println("Please enter a temperature in Celsius or Fahrenheit.");

        String input = keyboard.next(); // receive input from the user
        int lastIndex = input.length(); // find the length of the input
        String lastString = input.substring(lastIndex - 1); // find the last character of input, storing it as a string
        int numInput = Integer.parseInt(input.substring(0, lastIndex - 1)); // convert the string up to the final character into an integer
        boolean isCelsius = lastString.compareToIgnoreCase("c") == 0;
        boolean isFahrenheit = lastString.compareToIgnoreCase("f") == 0;
        double finalConversion;

        if (isCelsius) {
            finalConversion = (9 * (numInput) / 5) + 32;
            System.out.println("Your Fahrenheit conversion is: " + finalConversion);
        }
        else if (isFahrenheit) {
            finalConversion =(5 * (numInput - 32)) / 9;
            System.out.println("Your Celsius conversion is: " + finalConversion);
        }
        else
        System.out.println("This is incorrect, please enter a temperature in degrees or celsius.");

    }
}
