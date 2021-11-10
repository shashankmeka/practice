package day3;

public class exception {
	public static void main(String[] args) {

	int a=50;
	int b=0;
	int c;
	
	try {
		c=a/b;
		System.out.println(c);
	}
	
//	catch(Exception e) {
//		System.out.println("Not possible divided by zero ");
//		System.out.println(e);
////		e.printStackTrace();
//	}
	
	finally {
		System.out.println("finally block is here");
	}
	
	
	System.out.println("Important code is below ");
	

}
}