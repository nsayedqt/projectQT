/* Test Case Class for testing navigation on the site by comparing two different ways to reach one location
 * Written by: Daniel Malakiman
 * 10/26/2016
 * Qualitest Group
 * 
 */

package org.qualitest.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.qualitest.data.MainSiteData;
import org.qualitest.structure.MainSiteStructure;
import org.testng.Assert;

public class MainSiteCompareTest extends MainSiteStructure {
	
	// driver specific to the main site
	private WebDriver driver; 
	
	
	// constructor to assign driver to MainSiteTest driver
	public MainSiteCompareTest(){ 
		super.InitializeSite();
		driver = super.getDriver();
	}

	
	
	/* Test method that will take 2 web elements and see if they go to the same location
	 * @param webelement1, webelement2, header, confirm
	 * @return void
	 */
	public void compareLinks(By webelement1, By webelement2, By header, String confirm) throws InterruptedException{ 
		driver.get(super.getURL());
		
		//local variables
		WebElement site;
		String title1, title2;

		site = driver.findElement(webelement1);
		site.click();
		title1 = site.getText();
		driver.navigate().back();
		site = driver.findElement(webelement2);
		site.click();
		site = driver.findElement(header);
		Assert.assertTrue(site.getText().toString().contains(confirm));
	}
}
