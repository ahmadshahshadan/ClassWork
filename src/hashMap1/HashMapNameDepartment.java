package hashMap1;

import java.util.HashMap;

public class HashMapNameDepartment {
	
	public static void main(String[] args) {
		 
	
	
	
	HashMap <String, String> a = new HashMap<>();
	a.put("Name"," Math");
	a.put("name1"," Bio");

	a.put("name2","Geograph");
	System.out.println(a);
	
	System.out.println(a.get("Name"));
}
}