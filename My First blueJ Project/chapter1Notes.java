/**
 * Luke Olsen
 * 8/23/22
 * Notes for Ch. 1
 * These are notes for coding
 * Who helped me: "name"
 */

import java.util.Scanner;
import java.util.Random;

public class chapter1Notes
{
    //Main method
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        //Basic data types
        int x = 9, y, z;
        double num = 5, num1 = 23.45, num2;
        char letter = 'd';
        boolean choice = false; 
        float anum = 7;
        long a = 9;
        short b = 5;
        
        //These are objects
        String word = new String("Luke Olsen");
        Integer number = new Integer(47);
        Double number2 = new Double(43.5);
        
        // Difference
        System.out.println("5+4 = " + (5 + 4)); //this one prints out 9
        System.out.println("5+4 = " + 5 + 4); //this one prints out 45
    }
}
