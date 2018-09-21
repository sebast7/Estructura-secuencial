package secuencias;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class cocienteyresiduo {
	/**
	 * 
	 * @param the program finds the remainder and the quotient of two numbers
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n1,n2,c,r;
		
		try
		{	
			System.out.println("type the number 1: ");
			n1=Integer.parseInt(br.readLine());
			
			System.out.println("type the number 2: ");
			n2=Integer.parseInt(br.readLine());

			c = n1 / n2;
			r = n1 % n2;
			
			System.out.println("  ");
			System.out.println("the quotient is: " + c);	
			System.out.println("the residue is: " + r);	
		}
		catch(Exception ex) 
		{
			
		}
	}
}