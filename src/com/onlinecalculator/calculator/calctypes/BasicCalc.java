package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

class Calc3
{
	int a, b, c,ch ,res ;
	
	public int menu()
	{
		System.out.println("****");
		System.out.println("1.addition");
		System.out.println("2.subtract");
		System.out.println("3.multiply");
		System.out.println("4.divide");
        System.out.println("*********");
        System.out.println("Enter your choice");
        Scanner s=new Scanner(System.in);
        ch=s.nextInt();
        return ch;
        
	}
	
    public void userInputs()
    {
    	 Scanner s=new Scanner(System.in);
    	   System.out.println("enter one number :");
    	   a=s.nextInt();
    	   System.out.println("enter second number");
    		b=s.nextInt();
    	
    }

    public void performOperation()
{
   switch(ch)
   {
   case 1:  res=add();
   			System.out.println(res);
   			 break;
   case 2:
    res=subtract();
		System.out.println(res);
			 break;
case 3: res=multiply();
	System.out.println(res);
		 break;
case 4: res=divide();
	System.out.println(res);
		 break;
    	
        }
       
    }
    
	int add()
	{
		c=a+b;
		return c;
	}
	
	int subtract()
	{ 
		c=a-b;
			return c;
		
	}
	
	int multiply()
	{
		c=a*b;
		return c;
	}
	
	int divide()
	{  c=a/b;
	return c;
	}
	
}
public class BasicCalc
{
public static void main(String args[])
{
	Calc3 B= new Calc3();
	B.userInputs();
			B.menu();
	
	B.performOperation();
}
	
}
	
