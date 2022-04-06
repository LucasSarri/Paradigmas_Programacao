package Teste;

import java.util.Scanner;
public class FuncoesStrings 
{
	public static void main(String[] args) 
	{
		String s = "abcdefgh";
		
		String sub1 = s.substring(3); //s.substring(inicio,fim)
		System.out.println(sub1);
		String sub2 = s.substring(3,5);
		System.out.println(sub2);
		
		Scanner sc = new Scanner(System.in);
		String text;
		text = sc.nextLine();
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		System.out.println(text.trim());
		System.out.println(text.replace("a","x"));
		System.out.println(text.indexOf("a"));
		System.out.println(text.lastIndexOf("a"));
		sc.close();
	}
}
