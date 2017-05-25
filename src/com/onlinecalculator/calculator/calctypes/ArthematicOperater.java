package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class ArthematicOperater 
{
		 static int a ,b;
		static void userInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter value for a:" );
		a=s.nextInt();
		System.out.println("enter value for b:" );
		b=s.nextInt();
		}
		public static void main(String[] args)
		{
			ArthematicOperater A=new ArthematicOperater();
			A.userInput();
	        System.out.println(" addition a=a+b:" +(a=a+b));	
			System.out.println("subtraction a=a-b:" +(a=a-b));	
			System.out.println("multiplication a=a*b:" +(a=a*b));	
			System.out.println("division a=a/b:" +(a=a/b));
			System.out.println("modulus operter"+(a=a%b));
		
}
}