package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;


public class logicalOptr {
	public static void main(String[] args){
	boolean a, b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter value for a:" );
		a=s.nextBoolean();
		System.out.println("enter value for b:" );
		b=s.nextBoolean();
		System.out.println("a&&b :**" +(a&&b) );
		System.out.println("a||b: **" +(a||b));
		System.out.println("!(a&&b):" +!(a&&b));
		System.out.println("a^b" +(a^b));
	}
	
}