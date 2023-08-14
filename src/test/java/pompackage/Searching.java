package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import basePackage.BaseAmazonClass;

public class Searching extends BaseAmazonClass{
	

	Username Log;
	Password pas;

	//object repository
		// private WebDriver driver;
	    @FindBy(id = "twotabsearchtextbox")
	    WebElement searchItem;
	    //nav-search-submit-button
	    @FindBy(id = "nav-search-submit-button")
	    WebElement searchButton;
	    //span[class='a-size-small a-color-base puis-medium-weight-text']
	    @FindBy(xpath = "//span[text()='IHAVEISSUES']")
	    WebElement item;
	    //a-autoid-0-announce
	    @FindBy(xpath = "//span[text()='Featured']")
	    WebElement filter;
	    
	    
	    
	  //initiate page elements
	  	public Searching () {
	  		PageFactory.initElements(driver, this);
	  	}
	  	
	  	public void searchItem() throws InterruptedException {
	  		searchItem.sendKeys("t shirt for man");
	  		Thread.sleep(3000);
	  	}
	  	
	  	 public void LoginAccount() throws InterruptedException {
				Log=new Username();
				pas=new Password();
//				initiation();
				
				System.out.println("username");
				Log.typeusername("madhavimakwana1094@gmail.com");
				Thread.sleep(2000);
				Log.clickbtn();
				pas.typepassword("Manoj@@2310");
				Thread.sleep(2000);
				pas.clickbtn();
			}
	  	 
	  	 public void clickonsearch() throws InterruptedException {
	  		 searchButton.click();
	  		 Thread.sleep(3000);
	  	 }
	  	 
	  	public void itemsearch() throws InterruptedException {
	  		 item.click();
	  		 Thread.sleep(5000);
	  	 }
	  	public void filterclick() throws InterruptedException {
	  		 filter.click();
	  		 Thread.sleep(5000);
	  	 }
}
