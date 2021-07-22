package assignment;

import java.util.LinkedList;
import java.util.List;

public class Assignment_Questions 
{
	public static void main(String[] args) 
	{
		List<Fruit> fruitList=new LinkedList<>();
		fruitList.add(new Fruit("Apple", 50, 150, "Red"));
		fruitList.add(new Fruit("Mango", 60, 200, "Yellow"));
		fruitList.add(new Fruit("Banana", 90, 60, "Yellow"));
		fruitList.add(new Fruit("Strawberry", 30, 170, "Red"));
		fruitList.add(new Fruit("Orange", 50, 90, "Orange"));
		fruitList.add(new Fruit("Guava", 70, 70, "Green"));
		
		
		List<News> newsList=new LinkedList<News>();
		newsList.add(new News(1, "Sharan", "I got selected", "Congratulations!!"));
		newsList.add(new News(2, "Swetha", "I love dogs", "Me too.."));
		newsList.add(new News(3, "Vamsi", "Let's go for a ride", "Not now"));
		newsList.add(new News(4, "Rajesh", "What's my budget", "100crs is your budget"));
		newsList.add(new News(5, "Yogitha", "!!", "Poor report"));
		newsList.add(new News(6, "Sohail", "The budget of the series is 40cr", "Fantabulous"));
		newsList.add(new News(7, "Sivaram", "I created a website", "Super creativity"));
		
		
		List<Trader> traderList=new LinkedList<Trader>();
		
		traderList.add(new Trader("Sharan", "Hyderabad"));
		traderList.add(new Trader("Swetha", "Vijayawada"));
		traderList.add(new Trader("Vamsi", "Bangalore"));
		traderList.add(new Trader("Yogitha", "Khammam"));
		traderList.add(new Trader("Rajesh", "Pune"));
		traderList.add(new Trader("Sohail", "Indore"));
		traderList.add(new Trader("Sivaram", "Delhi"));
		
		
		List<Transaction> transList=new LinkedList<Transaction>();
		
		transList.add(new Transaction(new Trader("Sharan", "Hyderabad"), 2020, 20000));
		transList.add(new Transaction(new Trader("Swetha", "Vijayawada"), 2021, 48000));
		transList.add(new Transaction(new Trader("Vamsi", "Bangalore"), 2019, 28000));
		transList.add(new Transaction(new Trader("Yogitha", "Khammam"), 2011, 30000));
		transList.add(new Transaction(new Trader("Rajesh", "Pune"), 2019, 22000));
		transList.add(new Transaction(new Trader("Sohail", "Guntur"), 2020, 35000));
		transList.add(new Transaction(new Trader("Sivaram", "Delhi"), 2011, 30000));
		
		
		System.out.println("Fruit List : \n");
		
		fruitList.forEach(System.out::println);
		
		System.out.println("\n-------------------------------\n");

		System.out.println("Print low calory fruit names (calories < 100) in descending order of calories :\n");
		
		fruitList.stream()
		.filter(a->a.getCalories()<100)
		.sorted((o1,o2)->o2.getCalories()-o1.getCalories())
		.forEach(a->System.out.println(a.getName()));
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("Print color wise list of fruit names :\n");
		
		fruitList.stream()
		.sorted((o1,o2)->o1.getColor().compareTo(o2.getColor()))
		.forEach(a->System.out.println(a.getName()+"\t"+a.getColor()));
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("Print RED color fruits sorted by ascending order of price :\n");
		
		fruitList.stream()
		.filter(a->a.getColor().equalsIgnoreCase("red"))
		.sorted((o1,o2)->o1.getPrice()-o2.getPrice())
		.forEach(System.out::println);
		
		System.out.println("\n----------------------------------------------------");
		
		System.out.println("News List : \n");
		
		newsList.forEach(System.out::println);
		
		System.out.println("\n-------------------------------\n");
		System.out.println("newsId which has received maximum comments \n");
		
		News i = newsList.stream()
		.max((n1,n2)->n1.getComment().length()-n2.getComment().length())
		        .get();
		System.out.println(i.newsId);
			       
		System.out.println("\n----------------------------------------------------");
		
        System.out.println("No.of times the word budget has been mentioned in comments :\n");
		newsList.stream()
		.filter(n->n.getComment().contains("budget"))
		.forEach(n->System.out.println(n.getCommentByUser()));
		       
		System.out.println("\n----------------------------------------------------");
		       
		System.out.println("User that has posted maximum comments :\n");
		       
		News c= newsList.stream()
		.max((n1,n2)->n1.getCommentByUser().length()-n2.getCommentByUser().length())
        .get();
        System.out.println(c.getCommentByUser()+"\t"+c.getNewsId());
		        
		System.out.println("\n----------------------------------------------------");
		
		System.out.println("Display commentbyuser wise number of comments :\n");
		       
		newsList.stream().map(n->n.getCommentByUser())
		.distinct()
		.forEach(n->System.out.println(n+" "+newsList.stream().filter(n1->n1.getCommentByUser().equals(n)).count()));
		       
		System.out.println("\n----------------------------------------------------");
		
		System.out.println("Transaction List : \n");
		
		transList.forEach(System.out::println);
		
		System.out.println("\n--------------------------\n");
		
		System.out.println("Transactions  in  the  year  2011  and  sort  them  by  value  (small  to high) : \n");
		
		transList.stream()
		.filter(a->a.getYear()==2011)
		.sorted((o1,o2)->o1.getValue()-o2.getValue())
		.forEach(System.out::println);
		
		System.out.println("\n--------------------------\n");
		
		System.out.println("Print all transactions’ values from the traders living in Delhi : \n");
		
		transList.stream()
		.filter(a->a.getTrader().getCity().equalsIgnoreCase("delhi"))
		.forEach(a->System.out.println(a.getValue()));
		
		System.out.println("\n--------------------------\n");
		
		System.out.println("Highest value of all transactions : \n");
		
		Transaction transaction = transList.stream()
				.max((o1,o2)->o1.getValue()-o2.getValue())
				.get();
		
		System.out.println(transaction.getValue());
		
		System.out.println("\n--------------------------\n");
		
		System.out.println("Minimum value of all transactions : \n");
		
		transaction = transList.stream()
				.min((o1,o2)->o1.getValue()-o2.getValue())
				.get();
				
		System.out.println(transaction.getValue());
			
		System.out.println("\n----------------------------------------------------");
		
		System.out.println("Traders List : \n");
		
		traderList.forEach(System.out::println);
		
		System.out.println("\n----------------------------------------------------");
		
		System.out.println("What are all the unique cities where the traders work?\n");
		
		traderList.stream()
		.distinct()
		.forEach(m->System.out.println(m.getCity()));
		
		System.out.println("\n----------------------------------------------------");
		
		System.out.println("Find all traders from Puneand sort them by name\n");
		
		traderList.stream()
		.filter(n->n.getCity().equalsIgnoreCase("pune"))
		.sorted((o1,o2)->o1.getName().compareToIgnoreCase(o2.getName()))
		.forEach(m->System.out.println(m.getName()+"\t"+m.getCity()));
		
		System.out.println("\n----------------------------------------------------");
		
		System.out.println("Return a string of all traders’ names sorted alphabetically \n");
		
		traderList.stream()
		.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.forEach(m->System.out.println(m.getName()));
		
		System.out.println("\n----------------------------------------------------");
		
		System.out.println("Traders based in Indore \n");
		traderList.stream()
		.filter(n->n.getCity().equalsIgnoreCase("indore"))
		.forEach(m->System.out.println(m.getCity()+"\t"+m.getName()));
		System.out.println("\n----------------------------------------------------");
	}
}
