package arraylist;

import java.util.ArrayList;

public class ArrayList2 {
	
	public static void main(String[] args) {
		
		ArrayList <String> twoItems = new ArrayList<String>();
		
		twoItems.add("city");  
		twoItems.add("state");
		System.out.println(twoItems);
		
		for ( int a = 0; a< twoItems.size(); a++)
		{
			System.out.println(twoItems.get(a));
		}
}
}  