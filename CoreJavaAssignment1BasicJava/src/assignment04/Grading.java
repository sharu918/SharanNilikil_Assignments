package assignment04;

import java.util.Scanner;
public class Grading 
{
	public static void main(String[] args) 
	{
		int subject1, subject2, subject3;
		Scanner sc = new Scanner(System.in);
		subject1 = sc.nextInt();
		subject2 = sc.nextInt();
		subject3 = sc.nextInt();
        System.out.println("The student Grade is: ");
        if(subject1 > 60 && subject2 > 60 && subject3 > 60)
            System.out.println("Passed");
        else if((subject1 > 60 && subject2 > 60) || (subject2 > 60 && subject3 > 60) || (subject1 > 60 && subject3 > 60))
           System.out.println("Promoted");
        else
            System.out.println("Failed");
	}
}
