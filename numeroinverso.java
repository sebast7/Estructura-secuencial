package secuencias;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class numeroinverso {
	/**
	 * 
	 * @param given a number returns the number in reverse order
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n,ni = 0,r;
		
		try
		{	
			System.out.println("type the number you want to find the inverse: ");
			n=Short.parseShort(br.readLine());
			
			while(n>0)
			{
				r = n % 10;
				ni = ni *10 + r;
				n /=10;	
			}
			
			System.out.println("  ");
			System.out.println("the inverse number is: " + ni);	
		}
		catch(Exception ex) 
		{
			
		}
	}
}