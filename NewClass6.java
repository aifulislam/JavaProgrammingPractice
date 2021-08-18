//How to get user Double data input-------
package javaapplication;

import java.util.Scanner;

/**
 * @author ARIFUL ISLAM
 */
public class NewClass6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        System.out.print("Enter any double type data : ");
        num1 = input.nextDouble();
        System.out.println(num1);
    }
}
