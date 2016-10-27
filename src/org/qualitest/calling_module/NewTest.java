package org.qualitest.calling_module;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeTest
	public void Intro(){
		System.out.println("Starting Qualitest Website Tests....");
	}
	
	
	@AfterTest
	public void Outro(){
		System.out.println("Stopping Qualitest Website Tests....");
		
	}
	
  @Test
  public void f() throws InterruptedException {
	  Main test = new Main();
	  test.MainSiteTest();
  }
}
