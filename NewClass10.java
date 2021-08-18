//Temperature Converter-----Celcius to Farhenhite-----
package javaapplication;

import java.util.Scanner;

/**
 * @author Ariful Islam
 */
public class NewClass10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celci,farh;
        
        System.out.print("Enter your celcius : ");
        celci = input.nextDouble();
        
        farh = 1.8 * celci +32;
        System.out.println("Farhenhite : "+farh);
    }
}
