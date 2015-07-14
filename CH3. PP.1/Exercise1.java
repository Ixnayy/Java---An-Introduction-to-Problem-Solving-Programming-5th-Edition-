/**
 * A number x is divisible by y if the remainder after the division is zero. Write a program that tests whether one number is divisible by anohter number. 
 * Read both numbers from the keyboard. 
 * 
 * Name: Sam Fragapane III
 * Version: 1.0.0
 */
import java.util.Scanner;
public class Exercise1
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
            System.out.println("Please enter a integer for x and y");
            Scanner keyboard = new Scanner(System.in);
            int x = keyboard.nextInt();
            int y = keyboard.nextInt();
            int z = x % y;
            if (z == 0)
            System.out.println("X is divisble by Y");
            else 
            System.out.println("X is not divisible by Y");
    }
}
