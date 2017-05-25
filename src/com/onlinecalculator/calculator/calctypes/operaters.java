package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

 class optr2 {
	int a, b;
	
	void dinamicInputs()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter value for a:" +a);
	a=s.nextInt();
	System.out.println("enter value for b:" +b);
	b=s.nextInt();

	}
void performOperation(){
	System.out.println("a<b:" +(a<b));
	System.out.println("a>b:" +(a>b));
	System.out.println("a=b:" +(a=b));
	System.out.println("a>=b:" +(a>=b));
	System.out.println("a<=b:" +(a<=b));
	}
 }
	public class operaters
	{
		public static void main(String[] args){
			optr2 o=new optr2();
			o.dinamicInputs();
			o.performOperation();
		}
	}
