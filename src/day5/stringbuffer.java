package day5;

public class stringbuffer {

	public static void main(String[] args) {
		/*
		 normal string is immutable (not changeable)
		 
		 string buffer is predefined class present in java.
		 it is same like string but it have some more features than normal string like.
		 when we assign a value to string buffer it take more memory or extra space than total value.
		 
		 insert(at perticular index), reverse, delete(from perticular index), replace, findcapacity. 
		
		*/
		
		StringBuffer sb=new StringBuffer("Shashank");
		
		sb.append("meka.");			//insert from last index.
		
		System.out.println("capacity of string "+sb.capacity());
		System.out.println("length of string "+sb.length());
		
		System.out.println(sb);
		
		System.out.println(sb.insert(8, " sanjay "));
		
		sb.insert(0, "Name : ");
		System.out.println("capacity of string "+sb.capacity());
		System.out.println("length of string "+sb.length());
		
		System.out.println(sb);
		System.out.println(sb.reverse());
		
	}
}
