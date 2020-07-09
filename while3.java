package pacoteTeste;

import java.util.Scanner;

public class while3
{

	public static void main (String arg[])
	{
		Scanner ler = new Scanner (System.in); //declara a entrada de dados
		
		int num, contadorpar=0, contadorimpar=0,x;
	
		
		for (x=1;x<=10;x++)
		{
			System.out.println("Entre com um valor: ");
			num = ler.nextInt();
		
			if(num%2==0)
			{
				contadorpar++;
			}
			else
			{
				contadorimpar++;
			}
		}
		System.out.println("\nTotal de número pares: "+ contadorpar);
		System.out.println("\nTotal de número impares: "+ contadorimpar);
	}
}
