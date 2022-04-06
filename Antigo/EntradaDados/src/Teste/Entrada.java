package Teste;

import java.util.Locale;
import java.util.Scanner;

public class Entrada 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		System.out.println(num);
		sc.nextLine();
		String text = sc.nextLine();
		System.out.println(text);
		
		sc.close();
	}
}
