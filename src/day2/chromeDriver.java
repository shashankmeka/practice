package day2;

public class chromeDriver extends demo3 implements WebDriver,newclassinterface{

	@Override
	public void getTitle() {
	System.out.println("get page title");
	}
	@Override
	public void getisDisplayed() {
	}
	@Override
	public void getisEnabled() {
		
	}
	@Override
	public void getAtribute() {
		
	}

	@Override
	public void manage() {
		
	}
	@Override
	public void quit() {
		
	}
	public static void main(String[] args) {
		WebDriver driver=new chromeDriver(); //upcating 
		driver.getTitle();
		
		chromeDriver d= new chromeDriver();
		//If we make object of child class then we can access all method other than interface class
		
				
	}
	
	@Override
	public void bank() {
		
		
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
