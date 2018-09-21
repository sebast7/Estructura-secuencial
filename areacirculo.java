package secuencias;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class areacirculo {
	/**
	 * 
	 * @param calculates area of ​​a circle
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		float pi = (float) 3.14159;
		float a,r;
		
		try
		{	
			System.out.println("type the radius of the circle: ");
			r=Integer.parseInt(br.readLine());
			
			a = (float) (pi * Math.pow((double)r, 2.0));
	
			System.out.println("  ");
			System.out.println("the area is: " + a);	
		}
		catch(Exception ex) 
		{
			
		}
	}
}