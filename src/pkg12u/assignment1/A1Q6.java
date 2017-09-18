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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner created 
        Scanner input = new Scanner(System.in);

        int maximum = 100;

        //ask user to enter a number between 50 and 100 
        System.out.println("Pleas enter a number between 50 and 100:");
        int number = input.nextInt();

        while (maximum > number && number > 50) {
            System.out.println(maximum);
            maximum = maximum - 5;
        }

        if (number > 100 || number < 50) {
            System.out.println("You have inputed an invalid number! The number must be between 50 and 100!");
        }
    }

}
