package day2;

public class demo1 extends demo2{
	public void m1() {
		System.out.println("0 arg");
		super.m1("iosdnf");
	}
	public void m1(int a) {
		
		System.out.println("int arg is :"+a);
	}
	public void m1(String a) {
		this.m1(10);
		System.out.println("String arg :"+a);
	}
	
	 public static void main(String[] args) {
		 demo1 d=new demo1();
		d.m1();
		d.m1(10);
		d.m1("kalu");
		
	}
	
	

}
