package day1;

public class classc extends classa {
	int a=40;
	
	public void m3() {
		int a=50;
		System.out.println(a); //50
		System.out.println(this.a); //40
		System.out.println(super.a); // 10
	}
	
	
	public static void main(String[] args) {
		classc ob=new classc();
		ob.m3();
	}
}
