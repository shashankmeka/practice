package day1;

public class demo2 {
	//cons.
	
	public demo2(){
		System.out.println("default cons. calling");
	}
	
	public demo2(int a){
//		this();
		System.out.println("int para cons. calling");
	}
	
	public demo2(String a){
		this();
		System.out.println("string para cons. calling");
	}
	
	
	
	public static void main(String[] args) {
		
		demo2 b=new demo2("java");
		System.out.println("===========");
		demo2 c=new demo2();
		
		
		
	}
}
