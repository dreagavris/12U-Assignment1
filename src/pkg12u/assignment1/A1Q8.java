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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // Scanner created 
        Scanner input = new Scanner(System.in);
        
        // ask user to enter in initial amount
        System.out.println("Please enter the initial amount in you bank account:");
        double initial = input.nextDouble();
        
        // ask user to enter in the interest rate 
        System.out.println("Please enter in the interest rate:");
        double interest = input.nextDouble();
        
        // integer created for the amount of years till double 
        int yearsD = 0;
        // integer created for amount of years till 1M
        int yearsM = 0;
        
        // for loop created to calculate when the money will double 
        for (double i = initial; i < initial *2; i+= (i * interest)) {
            // add one to yearsD 
            yearsD++;   
        }
        
        // for loop created to calculate when user will reach 1M
        for (double i = initial; i < 1e6; i += (i * interest)) {
            //add 1 to yearsM
            yearsM++;
        } 
        
        // print out the number of years till double  
        System.out.println("Your bank account will double in " + yearsD + "years.");
        // print out number of years till 1M
        System.out.println("You back account will reach $1M in " + yearsM+ "years.");
    }
    
}