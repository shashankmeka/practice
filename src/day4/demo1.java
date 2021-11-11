package day4;

public class demo1 {
	
	
	public static void main(String[] args) {
		
		try {
			
			
//			System.out.println(10/0);		//1
			System.out.println("hello");	//2
			System.out.println("Boy");		//3
		}
		
		
		
		catch(Exception e) {
			System.out.println(e);			//4
//			System.out.println(10/0);
		}
		
		
		
		
		finally {
			
//			System.out.println("Finally block");	//5
			System.out.println(10/0);
		}
		
		
		
		
		
		System.out.println("Successfully End.....");	//6
		
	}
		

}
