
package area_of_square;

import java.util.Scanner;

/**
 *
 * @author User Md. Hasibur Rahman
 */
public class Area_of_Square {


    public static void main(String[] args) {
                          Scanner s = new Scanner(System.in);
             
        System.out.println("Enter the Length or width of the square ");
        
        double length = s.nextDouble();
        double area = length * length;
      System.out.print("the are of square is : " + area);
    }
    
}
