package my_frist_java;
/**
 * @author ARIFUL ISLAM
 */
import java.util.Scanner;

/**
 * @author ARIFUL ISLAM
 */
//import java.util.Scanner;
public class Vowel_Consonant {
    /*public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        char ch;
        System.out.print("Enter  any letter : ");
        ch = input.next().charAt(0);
        if(ch=='a'){
            System.out.println("Vowel");
        }
        else if(ch=='e')
        {
            System.out.println("Vowel");
        }
        else if(ch=='i')
        {
            System.out.println("Vowel");
        }
        else if(ch=='o')
        {
            System.out.println("Vowel");
        }
        else if(ch=='u')
        {
            System.out.println("Vowel");
        }
        else 
        {
            System.out.println("Consonnant");
        }
    }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Entter any letter : ");
        ch = input.next().charAt(0);
        if(ch=='a')
        {
            System.out.println("Vowel");
        }
        else if(ch=='e')
        {
            System.out.println("Vowel");
        }
        else if(ch=='i')
        {
            System.out.println("Vowel");
        }
        else if(ch=='o')
        {
            System.out.println("Vowel");
        }
        else if(ch=='u')
        {
            System.out.println("Vowel");
        }
        else 
        {
            System.out.println("Consonant");
        }
    }
}
