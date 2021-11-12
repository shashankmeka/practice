package day5;

import java.util.ArrayList;

import java.util.LinkedList;

public class list {
	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<>();
		
		LinkedList<String> b=new LinkedList<>();
		
		b.add("1");
		b.add("2");
		b.add("2");
		b.add("3");
		b.add(null);
		b.add(null);
		
		
		System.out.println(b.get(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//arraylist
		a.add("ONE");
		a.add("two");
		a.add("three");
		
		System.out.println(a);
		
		a.add(1, "Umesh");
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		a.add("ohhhhhhh");
		System.out.println(a);
		
		
	}

}
