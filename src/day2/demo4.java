package day2;

public class demo4 extends demo3{

	@Override
	public void bank() {
		System.out.println("i am a HDFC bank");
	}

	@Override
	public void m1() {
		System.out.println("method 1");		
	}
	
	public static void main(String[] args) {
		demo3 d=new demo4(); 
		//ref  
		d.phone();
		d.bank();
		
	}

}
