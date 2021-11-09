package day1;

public class getterandsetter {
	
private static int a=115486;
private static String x="Java Oops";
private static String p="Taran";
public static int i=50;


public static String umesh() {
	return p;
}

public static void jay(String q) {
	p=q;
}

public static int getA() {
	return a;
}

public static void setA(int b) {
	getterandsetter.a = b;
}

public static String getter() { // in getter return a value of perticular variable
	return x;
}

public static void setter(String y) { // In setter we assign private value to other variable 
	x=y;
}

public static void main(String[] args) {
	System.out.println(a);
}
}
