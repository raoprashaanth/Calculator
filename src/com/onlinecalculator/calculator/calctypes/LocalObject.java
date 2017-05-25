package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class LocalObject {
	void userInput()
    {
	int a, b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number a=:");
	a=sc.nextInt();
	System.out.println("enter a number b=:");
	b=sc.nextInt();
    }

	public static void main(String[] args)
	   {
		   LocalObject l=new LocalObject();
         l.userInput();

}
}