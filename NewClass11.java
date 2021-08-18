//Temperature Converter-----Farhenhite to Celcius-----
package javaapplication;

import java.util.Scanner;

/**
 * @author Ariful Islam
 */
public class NewClass11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double farh,cels;
        
        System.out.print("Enter fahenite : ");
        farh = input.nextDouble();
        
        cels = 1.8 /farh +32;
        System.out.println("Celcius : "+cels);
                
    }
}
