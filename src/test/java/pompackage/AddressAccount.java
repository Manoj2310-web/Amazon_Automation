package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class AddressAccount extends BaseAmazonClass{

	Username Log;
	Password pas;
	//object repository
	// private WebDriver driver;
    @FindBy(id = "address-ui-widgets-enterAddressFullName")
    WebElement fullName;
    @FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
    WebElement phoneNumber;
  
    @FindBy(id = "address-ui-widgets-enterAddressPostalCode")
    WebElement postalCode;
    @FindBy(id = "address-ui-widgets-enterAddressCity")
    WebElement city;
  
    @FindBy(id = "address-ui-widgets-enterAddressLine1")
    WebElement addressLine1;
    @FindBy(id = "address-ui-widgets-enterAddressLine2")
    WebElement addressLine2;
    @FindBy(xpath = "//input[@type='submit'][@class='a-button-input']")
    WebElement Add;
		
		//initiate page elements
		public AddressAccount() {
			PageFactory.initElements(driver, this);
		}
		
		public void set_fullname(String fname) {
	        fullName.sendKeys(fname);
	    }
	  
	    public void set_phonenumber(String phnumber) {
	      
	        phoneNumber.sendKeys(phnumber);
	    }
	  
	    public void set_postalCode(String pcode) {
	       
	        postalCode.sendKeys(pcode);
	    }
	  
	    public void set_city(String cty) {
	        
	        city.sendKeys(cty);
	    }
	  
	    public void set_addressLine1(String line1) {
	        
	        addressLine1.sendKeys(line1);
	    }
	  
	    public void set_addressLine2(String line2) {
	        
	        addressLine2.sendKeys(line2);
	    }
	  
	    public void click_button() {
	        Add.click();
	        /*
	         * Actions builder = new Actions(AutoFill.driver);
	         * builder.moveToElement(button).click(button); builder.perform();
	         */
	    }
	    public void LoginAccount() throws InterruptedException {
			Log=new Username();
			pas=new Password();
//			initiation();
			
			System.out.println("username");
			Log.typeusername("madhavimakwana1094@gmail.com");
			Thread.sleep(2000);
			Log.clickbtn();
			pas.typepassword("Manoj@@2310");
			Thread.sleep(2000);
			pas.clickbtn();
		}
}
