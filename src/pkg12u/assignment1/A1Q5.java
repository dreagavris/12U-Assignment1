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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // scanner created 
        Scanner input = new Scanner(System.in);

        // ask user to enter in a number 
        System.out.println("Please enter in a number between 1-10:");
        int number = input.nextInt();

        // for loop created to replace number with stars 
        for (int i = 0; i < number; i++) {
            //for loop created to make a box of stars 
            for (int x = 0; x < number; x++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}