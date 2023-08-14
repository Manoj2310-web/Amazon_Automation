package pompackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Username extends BaseAmazonClass{

	
	//object repository
	@FindBy(id="ap_email")
	WebElement Username;
	@FindBy(id="continue")
	WebElement Continue;
	
	//initiate page elements
	public Username() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods to type Username and click on continue button
	public void typeusername(String email) {
		System.out.println("hi");
		System.out.println(email);
		System.out.println(Username);
		Username.sendKeys(email);
		System.out.println("hihettr");
	}
	
	public void clickbtn() {
		Continue.click();
	}
	
	public String verify() {
		return driver.getTitle();
	}
	
	
}
