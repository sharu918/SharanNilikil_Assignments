package assignment06;

import java.util.Random;

abstract class Persistence
{	
	abstract void Main();
}

class FilePersistence extends Persistence
{
	@Override
	void Main() 
	{
		System.out.println("Data saved in File");
	}
}

class DatabasePersistence extends Persistence
{
	@Override
	void Main() 
	{
		System.out.println("Data saved in database");
	}
}

public class Main
{
	public static void main(String args[]) 
	{
		Persistence p;
		int random=0;
		Random obj = new Random();
		do 
		{
			random=obj.nextInt(3);
		}
		while(random<=0);
		if(random==1) 
		{
			p=new FilePersistence();
			p.Main();
		}
		else if(random==2) 
		{
			p=new DatabasePersistence();
			p.Main();
		}
		else 
		{
			System.out.println("Random error");
		}
	}
}
