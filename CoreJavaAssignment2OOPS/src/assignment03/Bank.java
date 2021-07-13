package assignment03;


public class Bank 
{
	public static void main(String args[]) 
	{
		double balance = 100000;
		double fixed_deposit = 50000;
		double credit = 20000;
		System.out.println(getsaving(balance, fixed_deposit));
		System.out.println(getcurrent(balance, credit));
	}
	
	public static double getsaving(double balance, double fixed_deposit)
	{
		System.out.println("Saving account");
		return balance+fixed_deposit;
	}
	
	public static double getcurrent(double balance, double credit)
	{
		System.out.println("Current account");
		return balance+credit;
	}

}
