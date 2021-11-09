package oops_inheritance;

public class demo extends getandset{
	static int a=100;
	static int b=50;

	static void m1(){
	   
	    a=1000;
	    b=5000;
	}

		public static void main(String[] args) {
			
			System.out.println(a);
			System.out.println(b);
			
		    m1();
			System.out.println(a);
			System.out.println(b);
				demo af=new demo();
				String dog=af.get();
				System.out.println(dog);
			}
			
		

}
