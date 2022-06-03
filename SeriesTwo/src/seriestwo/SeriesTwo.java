package seriestwo;

/**
 *
 * @author Md. Hasibur Rahman
 */
import java.util.Scanner;
public class SeriesTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N, result = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the border : ");
        N = s.nextInt();
        
        for(int i = 1; i <= N; i++)
        {
            result = result + (i * i);
        }
        System.out.println("The sumation is : " + result);
    }
    
}
