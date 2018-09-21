package secuencias;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class segundos {
	/**
	 * 
	 * @param converts a number of seconds into hours minutes and seconds
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int hora = 3600,min = 60, t,h,m,s;

		try
		{	
			System.out.println("type the time in seconds: ");
			t=Integer.parseInt(br.readLine());
			
			h = t / hora;
			t = t % hora;
			m = t / min;
			s = t % min;
	
			System.out.println("  ");
			System.out.println("the hours are: " + h);	
			System.out.println("the minutes are: " + m);
			System.out.println("the seconds are: " + s);
		}
		catch(Exception ex) 
		{
			
		}
	}
}