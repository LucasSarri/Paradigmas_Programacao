package Teste;

import java.util.Scanner;

public class Condicionais 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>0) 
		{
			System.out.println("Maior que 0");
		}
		
		if (num <= 10) 
		{
			System.out.println("menor igual a 10");
		}
		else 
		{
			System.out.println("maior que 10");
		}
		
		if (num <= 10) 
		{
			System.out.println("AAAA");
		}
		else if(num > 10 && num <= 20) 
		{
			System.out.println("BBBBB");
		}
		sc.close();
	}
}
