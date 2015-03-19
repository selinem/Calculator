/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author UnicornKitty
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userinput = new Scanner(System.in);
        
        System.out.print("Enter an operation: ");
        String operator = userinput.next();
        
        System.out.print("Enter interger1: ");
        int integer1 = userinput.nextInt();
        
        System.out.print("Enter integer2: ");
        int integer2 = userinput.nextInt();
        
        
        int operator1 = integer1 + integer2;
        int operator2 = integer1 - integer2;
        int operator3 = integer1 * integer2;
        int operator4 = integer1 / integer2;
        
        if (operator.equals("+"))
            System.out.println("The answer is: " + operator1);
        else if (operator.equals("-"))
            System.out.println("The answer is: " + operator2);
        else if (operator.equals("*"))
            System.out.println("The answer is: " + operator3);
        else if (operator.equals("/"))
            System.out.println("The answer is: " + operator4);
        
            
        
        
        
        
        
        
        
        
    }
    
}
