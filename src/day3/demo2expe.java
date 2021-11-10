package day3;

public class demo2expe {
	
	static void m1() {
		
		try {
			System.out.println(10/0);
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	static void m2() {
		
		int [] a= {10,20,30,40};
		
		try {
			System.out.println(a[50]);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		int a=1;
		// we use throws 
		// in throw we create our own exception
		
		while(a<6) {
			System.out.println(a);
			Thread.sleep(1000);
			a++;	
		}
		
		m1();
		m2();
		
		System.out.println("imp code is below...........!");
		
	}

}
