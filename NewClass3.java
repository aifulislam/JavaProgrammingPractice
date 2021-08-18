//Format specifier type---------
//psvm + tab = public static void main(String[] args) {} 
//sout + tab = System.out.println("");
package javaapplication;
/**
 * @author ARIFUL ISLAM
 */
public class NewClass3 {
    public static void main(String[] args) {
        boolean b = true;//dinamic inisialayzation
        char c = 'c';
        short s = 567;
        int i = 42354;
        float f = 56.21f;
        double d = 45.52;
        
        System.out.printf("Boolean = %b \n",b);
        System.out.printf("Char = %c \n",c);
        System.out.printf("Short = %d \n",s);
        System.out.printf("Int = %d \n",i);
        System.out.printf("Float = %.1f \n",f);
        System.out.printf("Double = %.3f \n",d);
        
    }
}
