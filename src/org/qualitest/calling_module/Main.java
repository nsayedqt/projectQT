/* Main Class that will call the tests cases
 * Written by: Daniel Malakiman
 * 10/26/2016
 * Qualitest Group
 * 
 */

package org.qualitest.calling_module;
import org.qualitest.data.MainSiteData;
import org.qualitest.tests.BlogSiteTests;
import org.qualitest.tests.MainSiteTests;

public class Main {

	public void MainSiteTest() throws InterruptedException{
		// Create test object for MainSite
		MainSiteTests mainsitetest = new MainSiteTests();
		MainSiteData data = new MainSiteData();
		
		// Run comparison test case n/a
		data.setAboutUsdata();
		mainsitetest.compareLinks(data.getElement1(), data.getElement2(), data.getHeader(), data.getConfirm());
		
		// Run comparison test case n/a
		data.setOurServicesdata();
		mainsitetest.compareLinks(data.getElement1(), data.getElement2(), data.getHeader(), data.getConfirm());
		
		
		// Run broken links test case 2
		mainsitetest.brokenLinks();
		
		mainsitetest.CloseSite();
		
		//Create test object for BlogSite
		BlogSiteTests blogtest = new BlogSiteTests();
		
		//run broken links test case 3
		blogtest.brokenLinks();
		blogtest.CloseSite();
	}
}
