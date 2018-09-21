package secuencias;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class potencia {
	/**
	 * 
	 * @param Find the power of a positive integer
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		short a,n;
		int p;
		
		try
		{	
			System.out.println("type the number: ");
			a=Short.parseShort(br.readLine());
			
			System.out.println("write the power number: ");
			n=Short.parseShort(br.readLine());
			
			p=(int)Math.pow((double)a, (double)n);
			
			System.out.println("  ");
			System.out.println("the power is: " + p);	
		}
		catch(Exception ex) 
		{
			
		}
	}
}