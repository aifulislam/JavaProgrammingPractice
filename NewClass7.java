//Arithmatic Operator and type castting-------
package javaapplication;

import java.util.Scanner;

/**
 * @author ARIFUL ISLAM
 */
public class NewClass7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 10 ,num2 = 20 , result;
      
        System.out.print("Enter Frist number : ");
        num1 = input.nextInt();
        System.out.print("Enter Secound number : ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum : "+result);
        
        result = num1 - num2;
        System.out.println("Sum : "+result);
        
        result = num1 * num2;
        System.out.println("Sum : "+result);
        
        double result2 = (double)num1 / num2;
        System.out.println("Sum : "+result2);
        
        result = num1 % num2;
        System.out.println("Sum : "+result);
    }
}
