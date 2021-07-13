package assignement01;

public class Singleton 
{
	private static Singleton single_instance = null;
    public String s;
    private Singleton()
    {
        s = "Hello";
    }
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}
  
class Main
{
    public static void main(String args[])
    {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        x.s = (x.s).toUpperCase();
  
        System.out.println("Amit says " + x.s);
        System.out.println("\n");
        
        z.s = (z.s).toLowerCase();
  
        System.out.println("Sharan says " + x.s);

    }
}
