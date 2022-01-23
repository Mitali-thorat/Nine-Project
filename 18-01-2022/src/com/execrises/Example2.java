package com.execrises;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter amount");
		int amount = scanner.nextInt();
		
		
		for(int i=1; i<4; i++)
		
		{
			int lone = (amount*10)/100;
			
			amount = amount-lone;
		
		}

		System.out.println(amount);
		

		scanner.close();

	}

} 


