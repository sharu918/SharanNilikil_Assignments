package assignment05;

import java.util.Scanner;
public class IncomeTax 
{
	public static void main(String[] args) 
	{
		double tax=0,IT;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income ");
		IT=sc.nextDouble();
		if(IT<=180000)
			tax=0;
		else if(IT>180000 && IT<=300000)
			tax=0.1*(IT);
		else if(IT>300000 && IT<=500000)
			tax=0.2*(IT);
		else if(IT>500000 && IT<=1000000)
			tax=0.3*(IT);
		System.out.println("Income tax amount is "+tax);
	}
}
