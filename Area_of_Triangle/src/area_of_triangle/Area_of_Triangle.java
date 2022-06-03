package area_of_triangle;
import java.util.Scanner;

/**
 * @author Md. Hasibur Rahman
 */
public class Area_of_Triangle {
    
    public static void main(String[] args) {
        
             Scanner s = new Scanner(System.in);
             
        System.out.println("Enter the value of Ground and Height");
        
        double base = s.nextDouble();
        double height = s.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of Triangle is = " + area);
    
    }
    
}
