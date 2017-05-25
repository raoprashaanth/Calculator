package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class FactorialOfNumber {
	 static int i,n,fact=1;
	static void usrInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:"+n);
		n=sc.nextInt();
	
	
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial of given no=:"+ fact);
	}
public static void main(String[] args)
{
	FactorialOfNumber f=new FactorialOfNumber();
			f.usrInput();
}
}