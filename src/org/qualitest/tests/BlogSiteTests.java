package org.qualitest.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.qualitest.structure.BlogSiteStructure;

public class BlogSiteTests extends BlogSiteStructure {

	// driver specific to the main site
		private WebDriver driver; 
		
		
		// constructor to assign driver to MainSiteTest driver
		public BlogSiteTests(){ 
			super.InitializeSite();
			driver = super.getDriver();
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
