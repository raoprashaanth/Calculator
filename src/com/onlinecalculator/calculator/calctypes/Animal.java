package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class Animal {
	String name;
	int lifespan;
	String shelter;
	void userInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter animal name=:");
		name=s.nextLine();
		System.out.println("enter life span=:");
		lifespan=s.nextInt();
		Scanner s1=new Scanner(System.in);
		System.out.println("enter shelter:");
		shelter=s1.nextLine();
	}
void speak()
{
	System.out.println("barking");
	}
	void move()
	{
		System.out.println("run");
	}
	
	public static void main(String[] args)
	{
		Animal s=new Animal();
		s.userInput();
		s.speak();
		s.move();
	}

}
