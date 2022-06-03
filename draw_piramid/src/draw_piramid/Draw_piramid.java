
package draw_piramid;

import java.util.Scanner;

/**
 *
 * @author Md. Hasibur Rahman
 */
public class Draw_piramid {
       
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);             
        System.out.println("Enter a number ");        
        int m = s.nextInt();
        
        int i, j;

        for(i=0; i<m; i++)
        {
            for(j=0; j<=i; j++)
            {
                
                System.out.print("* ");
            }
 
            
            System.out.println();
        }       
    }
}
