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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */

           public static void main(String[] args) {
        // scanner created 
        Scanner input = new Scanner(System.in);
        
        // string array created to store 10 words 
        String[] words = new String[10];
        // double created to count words 
        int wordCount = 0;
        int numWords = 10;
        int resultCharacters = 0;
        
        
        
        
        //ask user to print out 10 words 
        System.out.println("Please print out 10 words seperately:");
        
        //for loop created for letter count 
        for (int i = 0; i < words.length; i++){
            words[i] = input.next();
            wordCount = words[i].length();
            resultCharacters = resultCharacters + wordCount;
        }
        
        // double created to calculate the average letter 
        double average = resultCharacters / numWords;
       
        // output the average letter 
        System.out.println("The averge letter within the words is " +average);
    }
    
}