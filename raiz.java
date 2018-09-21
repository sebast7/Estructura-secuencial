package secuencias;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class raiz {
	/**
	 * 
	 * @param find the root of positive integers
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		short r,n;
		int a;
		
		try
		{	
			System.out.println("type the number: ");
			a=Short.parseShort(br.readLine());
			
			System.out.println("write the root number: ");
			n=Short.parseShort(br.readLine());
			
			r=(short)Math.pow((double)a,(1/(double)n));
			
			System.out.println("  ");
			System.out.println("the root is: " + r);	
		}
		catch(Exception ex) 
		{
			
		}
	}
}