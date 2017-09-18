/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.assignment1;

import java.util.Scanner;

/**
 *
 * @author andreeagavris
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // When ever a user wants to input information for the program to use create a "SCANNER"  
        Scanner input = new Scanner(System.in);

        //array created to store the 3 numbers and called it numbers
        int[] numbers = new int[3];

        // Use the shortcut key sout(Tab) in order to display a sentance to the viewer; To ask user to input 3 numbers 
        System.out.println("Enter in 3 integers, in different lines.");

        // create a loop that has an interger beggining with a value of 0 and its label as i; this loop is created to go through the 3 numbers 
        for (int i = 0; i < 3; i++) {
            numbers[i] = input.nextInt();
        }
        //multiply all the numbers together to find the product and print it out 
        int product = 1;
        for (int i = 0; i < 3; i++) {
            product = product * numbers[i];
        }
        // Print out the results
        System.out.println("The product is:" + product);

        //square the product and print it out
        int squareResult = product * product;
        System.out.println("The squared product is: " + squareResult);

        //square root the squared number and print it out
        int squareroot = (int) Math.sqrt(squareResult);
        System.out.println("The square root is: " + squareroot);

    }

}
