package day2;

class demo6{
	private int a=982255;
	private String b="I am Ironman..!";
	private char c='g';
	
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public String getb() {
		return b;
	}
	public int geta() {
		return a;
	}
	
	
	public void seta(int a) {
		this.a=a;
	}
	
	public void setb(String b) {
		this.b=b;
	}
		
}



public class demo5 extends demo6 {
public static void main(String[] args) {
	
	demo5 d=new demo5();
	
	
	int no=d.geta();
	String name=d.getb();
	
	System.out.println(no);
	System.out.println(name);
	System.out.println(d.getC());
	
	
	
	
//	System.out.println(a);
}


}
