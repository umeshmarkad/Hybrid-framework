package TestLayer;

import org.testng.annotations.Test;

public class demo {
	
	@Test(priority=1)
	public void testb() {
		System.out.println("Test Case B");//1
	}
	
	@Test(priority=0)
	public void testa(){
		System.out.println("Test case A");
	}
	
	@Test(priority=-1)
	public void testg() {
		System.out.println("Test case G");
		
	}
}