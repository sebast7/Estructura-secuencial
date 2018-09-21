package secuencias;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class sumaenteros {
	/**
	 * 
	 * @param This program solves the sum of two integers
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n1,n2,s;
		
		try
		{	
			System.out.println("type the number 1: ");
			n1=Integer.parseInt(br.readLine());
			
			System.out.println("type the number 2: ");
			n2=Integer.parseInt(br.readLine());

			s=n1 + n2;
			
			System.out.println("  ");
			System.out.println("the sum is: " + s);	
		}
		catch(Exception ex) 
		{
			
		}
	}
}