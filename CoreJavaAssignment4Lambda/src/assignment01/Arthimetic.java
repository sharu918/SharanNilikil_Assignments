package assignment01;

public class Arthimetic 
{
	public static void main(String[] args) 
	{
		arthimetic_operations add = (int a, int b) -> System.out.println(a + b);
		arthimetic_operations sub = (int a, int b) -> System.out.println(a - b);
		arthimetic_operations multiply = (int a, int b) -> System.out.println(a * b);
		arthimetic_operations divide = (int a, int b) -> 
		{
			if(b==0)
				System.out.println(0);
			else
				System.out.println(a/b);
		};
		
		add.AO(2,3);
		sub.AO(10,5);
		multiply.AO(2,3);
		divide.AO(10,0);
		divide.AO(10,5);
	}

}

@FunctionalInterface
interface arthimetic_operations
{
	void AO(int a, int b);
}