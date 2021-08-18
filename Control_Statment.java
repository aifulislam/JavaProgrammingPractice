package my_frist_java;

import java.util.Scanner;

public class Control_Statment {
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num =input.nextInt();
        if(num>0)
        {
             System.out.println("Possitive");
        }
        else if(num<0) {
            System.out.println("Negative");
        }
        else{
        System.out.println("Zero");
        }
    }*/
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter your number : ");
        num = input.nextInt();
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if(num<0)
        {
            System.out.println("Nagative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
