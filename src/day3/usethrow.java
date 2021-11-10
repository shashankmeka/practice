package day3;

public class usethrow {
	
	
public static void main(String[] args) {
	
	try {
		
		for (int i = 0; i < 11; i++) {
			
			Thread.sleep(1000); //Interrupted exception
			System.out.println(i);
			
		}
	}
	
	catch(Exception h) {
		h.printStackTrace();
	}
	
		}}

