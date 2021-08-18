//How to get user input-------
package javaapplication;

import java.util.Scanner;

/**
 * @author ARIFUL ISLAM
 */
public class NewClass4 {
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);        
        int number;
        System.out.println("Enter any number : "); 
        number = input.nextInt();
        System.out.println("number = "+number);
    }
}
