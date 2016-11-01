/* Main Class that will call the tests cases
 * Written by: Daniel Malakiman
 * 10/26/2016
 * Qualitest Group
 * 
 */

package org.qualitest.calling_module;
import org.qualitest.data.MainSiteData;
import org.qualitest.tests.MainSiteTests;

public class Main {

	public void MainSiteTest() throws InterruptedException{
		// Create test object
		MainSiteTests mainsitetest = new MainSiteTests();
		MainSiteData data = new MainSiteData();
		
		// Run comparison test case 1
		data.setAboutUsdata();
		mainsitetest.compareLinks(data.getElement1(), data.getElement2(), data.getHeader(), data.getConfirm());
		
		// Run comparison test case 2
		data.setOurServicesdata();
		mainsitetest.compareLinks(data.getElement1(), data.getElement2(), data.getHeader(), data.getConfirm());
		
		
		// Run broken links test case 1
		mainsitetest.brokenLinks();
		
		
		mainsitetest.CloseSite();
	}
}
