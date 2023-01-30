package overriding2;

public class Demo2 {
	
	public double myMethod(int num1, int num2)
	   {
	      System.out.println("First myMethod of class Demo");
	      return 100+200;
	   }
	   public int myMethod(int var1, int var2, int var3)
	   {
	      System.out.println("Second myMethod of class Demo");
	      return 10-20+30;
	   }
	}
	



