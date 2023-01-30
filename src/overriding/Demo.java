package overriding;

public class Demo {
	
	
	public int myMethod(int num1, int num2)
	   { 
	       System.out.println("myMethod");
	       return 10+20;
	   }
	   public int myMethod(int var1, int var2, int var3)
	   {
	       System.out.println("Second myMethod of class Demo");
	       return 20+12+34;

}
	   
}
