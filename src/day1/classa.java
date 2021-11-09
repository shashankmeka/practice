package day1;


public class classa{	
	int a=10;	
	public void m1() {
		int a=20;
		System.out.println(a);
		
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		classa b=new classa();
		b.m1();
	}
}

//===============================================================================


