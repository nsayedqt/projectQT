/* Main Class that will call the tests cases
 * Written by: Daniel Malakiman
 * 10/26/2016
 * Qualitest Group
 * 
 */

package org.qualitest.calling_module;
import org.qualitest.data.MainSiteData;
import org.qualitest.tests.MainSiteCompareTest;

public class Main {

	public void MainSiteTest() throws InterruptedException{
		// Create test object
		MainSiteCompareTest comparetest = new MainSiteCompareTest();
		MainSiteData data = new MainSiteData();
		
		// Run test case 1
		//data.setAboutUsdata();
		//comparetest.compareLinks(data.getElement1(), data.getElement2(), data.getHeader(), data.getConfirm());
		
		// Run test case 2
		data.setOurServicesdata();
		comparetest.compareLinks(data.getElement1(), data.getElement2(), data.getHeader(), data.getConfirm());
	}
}
