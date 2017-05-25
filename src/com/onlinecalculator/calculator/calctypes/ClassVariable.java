package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class ClassVariable {
	 static int a,b;
	void userInput()
	    {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number a=:");
		a=sc.nextInt();
		System.out.println("enter a number b=:");
		b=sc.nextInt();
	    }
	   void m1()
	   {
		   System.out.println("a value is:"+a);
	   }
	   void m2()
	   {
		   System.out.println("b value is:"+b);
	   }
	   public static void main(String[] args)
	   {
		   ClassVariable l=new ClassVariable();
		   l.userInput();
		   l.m1();
		   l.m2();
		  
	   }

}
