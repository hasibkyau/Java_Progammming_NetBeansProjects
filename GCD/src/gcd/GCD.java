
package gcd;

/**
 *
 * @author Md. Hasibur Rahman
 */
import java.util.Scanner;
public class GCD {
            static int gcd(int a, int b){
            if(a == 0){return b;}
            if(b == 0){return a;}
            if(a == b){return a;}
            if(a > 0){return gcd(a - b, b);}
            
            return gcd(a, b-a);
        }

    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        
        a = s.nextInt();
        
        System.out.println("Enter another number :");
        b = s.nextInt();
        
        System.out.println("GCD is : "  + gcd(a, b));
    }
    
}
