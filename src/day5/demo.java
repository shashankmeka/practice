package day5;

public class demo {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Umesh");
		
		System.out.println(s.length());
		System.out.println(s.capacity());
		
		s.append(" markad");
		
		System.out.println(s);
		System.out.println(s.capacity());
		
		
		s.insert(5, " babasaheb");
		
		System.out.println(s);
		
		System.out.println(s.reverse());
		
		
		
	}
}
