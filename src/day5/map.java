package day5;

import java.util.HashMap;

public class map {
	
	public static void main(String[] args) {
		
	HashMap<Integer,String> map=new HashMap<>();
	
	map.put(1, "umesh");
	map.put(2, "om");
	map.put(3, "yash");
	
	System.out.println(map);
	map.remove(2);
	System.out.println(map);
	
	}

}
