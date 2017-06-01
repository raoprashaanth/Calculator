package com.onlinecalculator.calculator.maincalc;
import com.onlinecalculator.calculator.calctypes.*;
import java.util.Scanner;
public class MainPgm {
 static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		char type;
		type=getType();
		if (type=='a')
		{
			BasicCalc B= new BasicCalc();
			B.menu();
			B.userInputs();
			B.performOperation();
		}
		if(type=='b')
		{
			ScientificCalc sc=new ScientificCalc();
			sc.menu();
			sc.userInputs();
			sc.performOperation();
		}
		if(type=='c')
		{
			StatisticCalc st=new StatisticCalc();
			st.menu();
			st.userInputs();
			st.performOperation();
		}
	}
static char getType()
		
		{
			System.out.println("....********......");
			System.out.println("1 for basic calc");
			System.out.println("2 for scientific calc");
			System.out.println("3 for statistic calc");
			System.out.println("..........");
			System.out.println("enter ur choice");
			int ch=s.nextInt();
			if(ch==1)
				return 'a';
			else if(ch==2)
				return 'b';
			else if(ch==3)
				return 'c';
			else
				System.out.println("wrong selection");
			
			return 'd';
		}
		
	}


