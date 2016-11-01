/* Test Case Class for testing navigation on the site by comparing two different ways to reach one location
 * Written by: Daniel Malakiman
 * 10/26/2016
 * Qualitest Group
 * 
 */

package org.qualitest.tests;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.qualitest.data.MainSiteData;
import org.qualitest.structure.MainSiteStructure;
import org.testng.Assert;

public class MainSiteTests extends MainSiteStructure {
	
	// driver specific to the main site
	private WebDriver driver; 
	
	
	// constructor to assign driver to MainSiteTest driver
	public MainSiteTests(){ 
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
		
		// goto first link
		site = driver.findElement(webelement1);
		site.click();
		
		// save title in string from first link
		site = driver.findElement(header);
		title1 = site.getText().toString();
		
		// go back to home page to then navigate to the second link
		driver.navigate().back();
		site = driver.findElement(webelement2);
		site.click();
		
		// save title in string from second link
		site = driver.findElement(header);
		title2 = site.getText();
		
		
		Assert.assertTrue(site.getText().toString().contains(confirm));
		System.out.println("Testing pages: \n" + title1 + " == " + title2);
		//Assert.assertTrue(title1.equals(title2));
	}
	
	/* Method that will get all the links on the page, and output whether the link is clickable or broken
	 *  @params void
	 *  @return void
	 */
	public void brokenLinks(){
		driver.get(super.getURL());
		
		
		 List<WebElement> allImages = findAllLinks(driver);    
		 
		    System.out.println("Total number of elements found " + allImages.size());

		    for( WebElement element : allImages){

		    	try

		    	{

			        System.out.println("Testing URL: " + element.getAttribute("href")+ " | return status: " + isLinkBroken(new java.net.URL(element.getAttribute("href"))));

		    		//System.out.println("URL: " + element.getAttribute("outerhtml")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));

		    	}

		    	catch(Exception exp)

		    	{

		    		System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + exp.getMessage());	    		

		    	}

		    }
	}
}
