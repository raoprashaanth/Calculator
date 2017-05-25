package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class InstanceVariable {
	int a,b;
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
		   InstanceVariable l=new InstanceVariable();
		   l.userInput();
		   l.m1();
		   l.m2();
		  
	   }

}
