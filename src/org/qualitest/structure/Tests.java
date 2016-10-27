/* Generic Test class to add basic functions to higher level test cases (for reusability)
 * Written by: Daniel Malakiman
 * 10/26/2016
 * Qualitest Group
 * 
 */

package org.qualitest.structure;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Tests {
	
	// local variables
	private WebDriver driver;
	
	
	
	/* Method that will set up the webdriver. This will be called by the generic structure 1 level higher.
	 * 
	 */
	protected void InitializeSite(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.get(URL);	
	}
	
	
	
	/* Method that closes the website. Used after a test is finished.
	 * 
	 */
	public void CloseSite(){
		driver.close();
	}
	
	
	
	/* Getter for the webdriver
	 * 
	 */
	public WebDriver getDriver() {
		return driver;
	}
}
