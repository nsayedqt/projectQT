/* Generic Test class to add basic functions to higher level test cases (for reusability)
 * Written by: Daniel Malakiman
 * 10/26/2016
 * Qualitest Group
 * 
 */

package org.qualitest.structure;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class GenericTestFunctions {
	
	// local variables
	private WebDriver driver;
	
	
	
	/* Method that will set up the webdriver. This will be called by the generic structure 1 level higher.
	 * 
	 */
	protected void InitializeSite(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qualitest\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
	
	
	
	
	/* Method that gathers all anchor and image tags into a list of webelements (For checking broken links across website)
	 * @param WebDriver driver
	 * @return List finalList
	 */
	public List<WebElement> findAllLinks(WebDriver driver)
	 
	  {
		  //create unfiltered list
		  List<WebElement> elementList = new ArrayList<WebElement>();
	 
		  //add elements to list
		  elementList = driver.findElements(By.tagName("a"));
		  elementList.addAll(driver.findElements(By.tagName("img")));
	 
		  //create filtered list
		  List<WebElement> finalList = new ArrayList<WebElement>(); ;
	 
		  //loop unfiltered list to filter out elements that are not links to the final list
		  for (WebElement element : elementList)
		  {
			  if(element.getAttribute("href") != null)
			  {
				  finalList.add(element);
			  }		  
		  }	
	 
		  //return the filtered list of links
		  return finalList;
	 
	  }
	
	
	
	
	/* Method that takes a URl and checks the response it gets from the server
	 * @param URL url
	 * @return String response
	 */
	public static String isLinkBroken(URL url) throws Exception
	 
	{
 
		// create URL connection
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
 
		try
 
		{
			//connect to the webserver
		    connection.connect();
		    
		    //record the response (determines whether link is broken or valid
		    String response = connection.getResponseMessage();	 
		    
		    //exit connection and return the response
		    connection.disconnect();
		    return response;
 
		}
 
		catch(Exception exp)
 
		{
 
			return exp.getMessage();
 
		}				
 
	}
}
