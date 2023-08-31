package testngs;

import org.testng.annotations.Test;

public class Test1 {

	@Test (priority = 1,description = "Login Functionality completed")
	
	public void login() {
		
		System.out.println("Functionality login is working ");
		
	}
	@Test (priority = 2,description = "cart Functionality completed")
	public void cart() {
		System.out.println(" cart Functionality is working ");
	}
	@Test (priority = 3,description = "payment Functionality completed")
	public void payment() {
		System.out.println("payment Functionality  is working");
	}
	


	

}
