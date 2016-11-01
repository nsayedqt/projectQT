/* Intermediate class between generic Tests.java Class and the test cases Classes.  Used for grouping methods that will be in common with the test cases.
 * Written by: Daniel Malakiman
 * 10/26/2016
 * Qualitest Group
 * 
 */

package org.qualitest.structure;

public class MainSiteStructure extends GenericTestFunctions{
	
	// local variables
	private String URL = "https://www.qualitestgroup.com/";
	
	
	
	/* Call the inherited initialize method from Tests.java
	 * 
	 * 
	 */
	protected void InitializeSite(){
		super.InitializeSite();
		
	}

	/* Getter for URL that will be used in test classes
	 * 
	 */
	public String getURL() {
		return URL;
	}

}
