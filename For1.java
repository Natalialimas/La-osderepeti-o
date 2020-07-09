package pacoteTeste;

import java.util.Scanner;

public class For1
{

	public static void main (String arg[])
	
	{
		
		Scanner ler = new Scanner (System.in);
		int x=0;
		
	
		for (x=1000;x<=1999; x++) 
		{
			
			if (x%11==5)
			{
				System.out.println("\nO número "+x+" É divisivel por 11 e resta, 5.");
			}
		}
	}
	
 }
