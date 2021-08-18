//Area of triangle and circle------------
package javaapplication;

import java.util.Scanner;

/**
 * @author Ariful Islam
 */
public class NewClass9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius,result;
        
        System.out.print("Enter your radius : ");
        radius = input.nextDouble();
        
        result = 3.1416 * radius * radius;
        System.out.println("Area of Circle : "+result);
    }
}
