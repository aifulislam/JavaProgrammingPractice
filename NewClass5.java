//How to get user String input-------
package javaapplication;

import java.util.Scanner;

/**
 * @author ARIFUL ISLAM
 */
public class NewClass5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.println("Your name is : "+name);
    }
}

