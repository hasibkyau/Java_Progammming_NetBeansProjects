package area_of_reactangle;

import java.util.Scanner;

/**
 *
 * @author Md. Hasibur Rahman
 */
public class Area_of_Reactangle {

    public static void main(String[] args) {
                     Scanner s = new Scanner(System.in);
             
        System.out.println("Enter the value of Length and width");
        
        double length = s.nextDouble();
        double width = s.nextDouble();
        double area = length * width;
        System.out.println("The area of Triangle is = " + area);
    
    }
    
}
