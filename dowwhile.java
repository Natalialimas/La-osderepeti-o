package pacoteTeste;

import java.util.Scanner;

public class dowwhile {
	public static void main(String [] args)
	{
		Scanner teclado=new Scanner(System.in);
		int num, soma=0,cont=0;
		float media;
		
		
		System.out.println("Para sair digite 0 (ZERO)");
		do
		{
			
			System.out.println("Digite um número: ");
			num=teclado.nextInt();
			
			if (num%3==0 && num!=0) 
			{
				soma=soma+num;
				cont++;
				
			}
			
		}
		while(num!=0);
		media=soma/cont;
		System.out.println("A média dos números múltiplos de 3 é: "+media);
	}

}