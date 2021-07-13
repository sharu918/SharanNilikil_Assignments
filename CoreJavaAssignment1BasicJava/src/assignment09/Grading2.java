package assignment09;

import java.util.Scanner;
public class Grading2 
{
	public static void main (String[]args)
	  {
	    Scanner sc = new Scanner (System.in);
	    int a[] = new int[3], b[] = new int[3], c[] = new int[3], tot[]=new int[3], total[] =new int[3];
	    float avg[] = new float[3], average[] = new float[3];
	    for (int i = 0; i < 3; i++)
	    {   
	        System.out.println("Marks scored by Student"+(i+1)+" in subject A: ");
		    a[i] = sc.nextInt ();
		    System.out.println("Marks scored by Student"+(i+1)+" in subject B: ");
		    b[i] = sc.nextInt ();
		    System.out.println("Marks scored by Student"+(i+1)+" in subject C: ");
		    c[i] = sc.nextInt ();
		    tot[0] = tot[0] + a[i];
		    tot[1] = tot[1] + b[i];
		    tot[2] = tot[2] + c[i];
		    total[i]=a[i]+b[i]+c[i];
		    avg[i] = (a[i] + b[i] + c[i]) / 3;
	    }
	    for (int i = 0; i < 3; i++)
	    {
		average[i] = tot[i] / 3;
	    }
	    System.out.println ("Total scored in subject A: " + tot[0]);
	    System.out.println ("Total scored in subject B: " + tot[1]);
	    System.out.println ("Total scored in subject C: " + tot[2]);
	    System.out.println ("\nAverage in subject A: " + average[0]);
	    System.out.println ("\nAverage in subject B: " + average[1]);
	    System.out.println ("\nAverage in subject C: " + average[2]);
	    for (int i = 0; i < 3; i++)
	    {
		    System.out.println ("\nTotal marks by student" +(i+1)+" : " +total[i]);
		    System.out.println ("\nAverage marks scored by student"+(i+1)+" : "+avg[i]);
	    }
	  }
}
