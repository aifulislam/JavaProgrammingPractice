package my_frist_java;
/**
 * @author ARIFUL ISLAM
 */
import java.util.Scanner;
public class CapitalSmallDemo {
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter : ");
        ch =input.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("Small Letter");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("Capital Letter");
        }
         else if(ch>='0' && ch<='9')
        {
            System.out.println("Digit");
        }
        else 
        {
            System.out.println("It is not a letter");
        }
    }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter : ");
        ch = input.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("Small Letter");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("Capial Letter");
        }
        else if (ch>='0' && ch<='9')
        {
            System.out.println("Digit");
        }
        else 
        {
            System.out.println("It's Not a Letter");
        }
    }
}
