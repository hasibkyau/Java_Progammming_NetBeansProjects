package seiesone;

import java.util.Scanner;

/**
 *
 * @author Md. Hasibur Rahman
 */
public class SeiesOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, result = 0;
        Scanner s = new Scanner(System.in);             
        System.out.println("Enter the Range: ");
         n = s.nextInt();
         for(int i = 1; i <= n; i++)
         {
             result = result + i;
         }        
    }
}
