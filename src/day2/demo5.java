package day2;

class demo6{
	private int a=982255;
	private String b="I am Ironman..!";
	private String p="Private data";
	
	public String getp(){
		return p;
	}
	
	public void setp(String p){
		this.p=p;
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
	System.out.println(d.getp());
	
	
	
//	System.out.println(a);
}


}
