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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner created 
        Scanner input = new Scanner(System.in);
        String number;

        // ask user to enter in the prom food cost 
        System.out.println("How much does the food for prom cost?");
        double one = input.nextDouble();
        // ask user to enter in the cost of the DJ
        System.out.println("How much does the DJ cost?");
        double two = input.nextDouble();
        // ask user to enter in the cost of the hall rental 
        System.out.println("How much does it cost to rent the hall?");
        double three = input.nextDouble();
        // ask user to enter in the decoration cost 
        System.out.println("How much does the decorations cost?");
        double four = input.nextDouble();
        // ask user to enter in the cost of the staff 
        System.out.println("How much does it cost for the staff?");
        double five = input.nextDouble();
        // ask user to enter in the cost of the miscellanrous things
        System.out.println("How much for miscellanrous costs?");
        double six = input.nextDouble();

        // add all the cost togehter to calculate total expense for prom 
        double cost = (one + two + three + four + five + six);

        // divide by ticket price($35)
        double answer = (cost / 35);
        answer = Math.ceil(answer);

        //output the total cost and the number of tickets tht have to be sold 
        System.out.println(" The cost is " + cost + ". You will need to sell " + answer + " to break even. ");

    }

}
