/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpacalculation;

/**
 *
 * @author Md. Hasibur Rahman
 */
import java.util.Scanner;
public class CgpaCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        double val = 0;
			double tot=0, d=0;
                        
			Scanner s = new Scanner(System.in);
			System.out.print("enter the number of subjects :");
                        
			int n = s.nextInt();
                        
			for(int i=1;i<=n;i++)
			{
				System.out.print("mark of subject " + i + " : ");
                                
				float mark = s.nextFloat();
				
                                if(mark > 75)
				{
					val = 4;
				}
				
                                if(mark >= 75 && mark < 80 )
				{
					val = 3.75;
				}
				
                                 if(mark >= 70 && mark < 75 )
				{
					val = 3.5;
				}
                                 
                                 if(mark >= 65 && mark < 70 )
				{
					val = 3;
				}
                                 
                                 if(mark >= 60 && mark < 65 )
				{
					val = 2.5;
				}
				
                                  if(mark >= 40 && mark < 60 )
				{
					val = 2;
				}
                                
				System.out.print("enter ur credit of that subject : ");
                                
				int c = s.nextInt();
                                
				tot = tot+(c*val);
				d = d+c;
                                
                                System.out.println("");
			}
			
			double r;
			r = tot/d;
			System.out.println(+r);
    }
    
}
