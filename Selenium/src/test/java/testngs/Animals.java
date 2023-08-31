package testngs;

import org.testng.annotations.Test;

public class Animals{
	
	
	@Test (groups = "Animals",timeOut= 1000 )
	
	public void test1 () throws Throwable {
		
		Thread.sleep(800);
		
		System.out.println("dog");
		
						
	}
	@Test (groups = "Animals")
	public void test2() {
		System.out.println("Lion");
	}
	@Test
	
	public void test3() {
		System.out.println("Birds");
	}
}