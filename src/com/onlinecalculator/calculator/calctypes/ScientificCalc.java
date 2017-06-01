package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;


import java.lang.Math;

public class ScientificCalc extends BasicCalc{
	public int menu(){
		System.out.println("****");
		System.out.println("1.addition");
		System.out.println("2.subtract");
		System.out.println("3.multiplication");
		System.out.println("4.divide");
		System.out.println("5.pwrof");
		System.out.println("6.sqrtof");
		System.out.println("7.sineof");
		//System.out.println("8.");

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
	   if(ch!=6 && ch!=7){
	   System.out.println("enter second number");
		b=s.nextInt();
	   }
  }

  public void performOperation(){
  		switch(ch)
  		{
  		
  		case 1:
  		case 2:
  		case 3:
  		case 4:
  			super.performOperation();
  		break;
  		case 5:
  			System.out.println("result:"+(pwrof()));
  		break;
  			case 6:
  			System.out.println("result:"+(sqrtof()));
  		break;
  		case 7:
  			System.out.println("result:"+(sineof()));
  		break;
  		case 8:
  			System.out.println("bye");
  			System.exit(0);
  			break;
  			default:System.out.println("wrong choice");
  			break;
  	}
      
  }
  
	double pwrof()
	{
		System.out.println("power");
		return(Math.pow(a,b));
	}
	
	double sqrtof()
	{
		System.out.println("sqrt");
		return(Math.sqrt(a));
	}

	double sineof()
	{
		System.out.println("sineof");
		double rad=Math.toRadians(a);
		return(Math.sin(rad));
	}
}

