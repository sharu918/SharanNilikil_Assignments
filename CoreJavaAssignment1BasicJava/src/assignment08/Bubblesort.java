package assignment08;

import java.util.Scanner;
public class Bubblesort 
{
	public static void main(String args[])
	{
		int n, i, j, temp=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for(i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
		}
		 for(i=0; i < n; i++)
		 {  
             for(j=1; j < (n-i); j++)
             {  
            	 if(a[j-1] > a[j])
            	 { 
            		 temp = a[j-1];  
                     a[j-1] = a[j];  
                     a[j] = temp;  
            	 }
             }  
         }  
		  System.out.println("Array After Bubble Sort");  
          for(i=0; i < n; i++)
          {  
                  System.out.print(a[i] + " "); 
          }
	}
}
