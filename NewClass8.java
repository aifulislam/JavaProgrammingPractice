//Area of triangle and circle------------
package javaapplication;

import java.util.Scanner;

/**
 * @author ARIFUL ISLAM
 */
public class NewClass8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base,height,result;
        
        System.out.print("Enter your base : ");
        base = input.nextDouble();
        
        System.out.print("Enter your height : ");
        height = input.nextDouble();
        result = 0.5 * base * height;
        System.out.println("Area of triangle : "+result);
    }
}
