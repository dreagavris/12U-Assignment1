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
public class A1Q1 {

    public static void main(String[] args) {

        // When ever a user wants to input information for the program to use create a "SCANNER"  
        Scanner input = new Scanner(System.in);

        // In this case what the program needs to store are letter thus we create a "STRING" 
        String name;

        // Use the shortcut key sout(Tab) in order to display a sentance to the viewer; To ask user to enter in the name 
        System.out.println("Enter in you name:");

        // Then to allow the user to input  a name into next line 
        name = input.nextLine();

        //Output the final line in response to the user's input
        System.out.println("HELLO " + name + ".");

    }

}
