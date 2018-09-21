package secuencias;
import java.io.*;

/**
 * 
 * @author Sebastian Beltran
 *
 */

public class iva {
	/**
	 * 
	 * @param given a value of a product find the sales price and the sales price
	 */
	
	public static void main(String[] args) 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		float vv,iva,pv;
		
		try
		{	
			System.out.println("type the price: ");
			vv=Integer.parseInt(br.readLine());
			
			iva = (float) (vv * 0.19);
			pv = vv + iva;
			
			System.out.println("  ");
			System.out.println("the iva is: " + iva);	
			System.out.println("The sale price is: " + pv);	
		}
		catch(Exception ex) 
		{
			
		}
	}
}