package assignment06;

import java.util.Scanner;

public class CUI 
{
	public static void main(String[] args) 
	{
		int counter=0;
		while(counter<3) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter username ");
			String username = sc.nextLine();
			System.out.println("Enter Password");
			String password = sc.nextLine();
			if(username.equals("sharan")) 
			{
				if(password.equals("password")) 
				{
					System.out.println("Welcome "+ username);
					System.exit(0);
				}
			}
			counter++;
		}
		System.out.println("Contact Admin");
	}

}
