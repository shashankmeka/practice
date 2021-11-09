package oops_inheritance;

class classA {
	
	public void m1() {
		System.out.println("m1 method is calling");
	}
	public void m2() {
		System.out.println("m2 method is calling");
	}
	public void m3() {
		System.out.println("m3 method is calling");
	}
	public void m4() {
		System.out.println("m4 method is calling");}
		
	}

class classB {
	public void m5() {
		System.out.println("m5 from B class");
	}
	public static void main(String[] args) {
		classA d=new classA();
		
		d.m4();
		
	
}}