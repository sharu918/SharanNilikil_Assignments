package assignment02;


public class Armstrong2 
{
	public static void main(String[] args) 
	{
		int k, j = 0, i;
		System.out.println("Armstrong numbers from 100 to 999 are: ");
		for(i = 100; i <= 1000; i++)
		{
			int a = i;
			j = 0;
			while(a > 0)
			{
				k = a%10;
				j = j + (k * k * k);
				a=a/10;
			}
			if(j==i)
			{
				System.out.println(i+" ");
			}
		}
	}
}
