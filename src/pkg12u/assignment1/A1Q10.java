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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner created 
        Scanner input = new Scanner(System.in);

        // Ask the user to type in any given amount of words and to stop type "exit"
        System.out.println("Enter as many words as you like in seperate lines, and then type 'exit' to get your total word count.");

        // intger created to Store the words 
        int wordCount = 0;

        //while loop created 
        while (true) {
            // Create a string for words
            String word = input.nextLine();
            // if statement break when exit is typed
            if (word.equals("exit")) {
                break;
            }           
            // one added to wordCount
            wordCount = wordCount + 1;
        }
        
        // output by printing out the answer
        System.out.println("You've entered " + wordCount + " words.");
    }
}

