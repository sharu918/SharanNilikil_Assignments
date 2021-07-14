package assignment07;

public abstract class DessertItem 
{
	public abstract int getCost(int numberOfQuantities);
}

class Candy extends DessertItem
{
	@Override
	public int getCost(int numberOfQuantities) 
	{
		return numberOfQuantities*60;
	}	
}

class Cookie extends DessertItem
{
	@Override
	public int getCost(int numberOfQuantities) 
	{
		return numberOfQuantities*70;
	}
}

class IceCream extends DessertItem
{
	@Override
	public int getCost(int numberOfQuantities) 
	{
		return numberOfQuantities*50;
	}
}
