
/**
 * Write a program that reads three strings from the keyboard. Although the strings are in no particular order, display the string 
 * that would be second if they were arranged lexicographically.
 * 
 * Name: Sam Fragapane III
 * Version: 1.0.0
 */
import java.util.Scanner;
public class Exercise3
{
   public static void main(String[] args)
   {
       System.out.println("Please enter three strings, one per each line");
       Scanner keyboard = new Scanner(System.in);
       String x = keyboard.nextLine();
       String y = keyboard.nextLine();
       String z = keyboard.nextLine();
       String min = x;
       String max = x;
       String middle = "";
       
      if (min.compareTo(y) > 0)
       min = y;
      if (min.compareTo(z) > 0)
       min = z;
      if (max.compareTo(y) < 0)
       max = y;
      if (max.compareTo(z) < 0)
      max = z;
      if (!x.equals(min) && !x.equals(max))
      middle = x;
      if (!y.equals(min) && !y.equals(max))
      middle = y;
      if (!z.equals(min) && !z.equals(max))
      middle = z;
      
      System.out.println(middle);
    }
}
