/*
*HomeWork : Find the factorial
*@author Md. Hasibur Rahman
 */
package factorial;

import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        //take the input from input
        int fact = 1;
        
        System.out.println("Enter the Number ");
        Scanner a = new Scanner(System.in); //System.in is a standard input stream.
        int n = a.nextInt();
        
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " = " + fact);
    }

}
