package oops_inheritance;


class oop{
private String a="private data";
	
	public String get() {
		return a;
	}

	public void set(String b) {
		a=b;
	}
}
public class getandset extends oop{

	
	public static void main(String[] args) {
		getandset obj=new getandset();
		System.out.println(obj.get());
	}
}

