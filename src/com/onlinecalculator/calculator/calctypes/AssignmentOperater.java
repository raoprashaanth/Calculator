package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class AssignmentOperater {
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
		AssignmentOperater A=new AssignmentOperater();
		A.userInput();
        System.out.println("a=a+b:" +(a+=b));	
		System.out.println("a=a-b:" +(a-=b));	
		System.out.println("a=a*b:" +(a*=b));	
		System.out.println("a=a/b:" +(a/=b));	
	
	}

}
