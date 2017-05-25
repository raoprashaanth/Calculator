package com.onlinecalculator.calculator.calctypes;

public class primeNo {

	public static void main(String[] args) {
		int i,j,n=100,count=0;
		for(i=0;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println("prime numbers in between 1 to 100:"+i);
			count=0;
		}
		

	}

}
