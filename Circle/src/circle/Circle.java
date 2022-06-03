
package circle;

/**
 *
 * @author Md. Hasibur Rahman
 */
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radious");
        double r = s.nextDouble();
        double area = (22*r*r)/7;
        System.out.println("The area of the circle is = " + area);
    }
    
}
