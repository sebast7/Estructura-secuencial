package secuencias;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class interes {
	/**
	 * 
	 * @param calculates the interest of a capital deposited during a certain time at an interest rate
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		float c,ti,t,i,m;
		
		try
		{	
			System.out.println("type capital: ");
			c=Integer.parseInt(br.readLine());
			
			System.out.println("type the interest rate: ");
			ti=Integer.parseInt(br.readLine());
			
			System.out.println("type the time: ");
			t=Integer.parseInt(br.readLine());
			
			m = (float) (Math.pow((double)(1 + ti / 100), (double) t)) * c ;
			i = m - c;
			
			System.out.println("  ");
			System.out.println("The interest is " + i);	
			System.out.println("the amount to pay is: " + m);			
		}
		catch(Exception ex) 
		{
			
		}
	}
}