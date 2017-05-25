package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class inc {

	public static void main(String[] args) {
	int a, b;
	Scanner s=new Scanner(System.in);
	System.out.println("enter value of a");
	a=s.nextInt();
	System.out.println("enter value of b");
	b=s.nextInt();
	System.out.println("pre increment:"+ (++a));
	System.out.println("post increment:"+(a++));
	System.out.println("pre dec:"+(--a)); 
	System.out.println("post dec:"+(a--));
	System.out.println("add:"+(a+b));
	System.out.println("sub:"+(a-b));
	System.out.println(2*3+5);
	
	}

}
