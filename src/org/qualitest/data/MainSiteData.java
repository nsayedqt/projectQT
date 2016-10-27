package org.qualitest.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainSiteData {

	private By element1;
	private By element2;
	private By header;
	private String confirm;
	
	
	public void setAboutUsdata(){
		this.element1 = By.cssSelector("a[href='https://www.qualitestgroup.com/why-qualitest/']");
		this.element2 = By.id("menu-item-8991");
		this.header = By.xpath("/html/body/div[1]/div/section/div/h1");
		this.confirm = "Why QualiTest?";
	}

	public void setOurServicesdata(){
		this.element1 = By.xpath("/html/body/div[1]/div/section[1]/div[1]/div/ul/li[2]/a");
				
		this.element2 = By.cssSelector("div.inner div.primary-messaging a[href='https://www.qualitestgroup.com/solutions-overview/software-testing-services/']");
		this.header = By.xpath("/html/body/div[1]/div/section/div/h1");
		this.confirm = "Software Testing Services";
	}

	public By getElement1() {
		return element1;
	}


	public By getElement2() {
		return element2;
	}


	public By getHeader() {
		return header;
	}


	public String getConfirm() {
		return confirm;
	}
}
