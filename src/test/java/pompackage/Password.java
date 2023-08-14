package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Password extends BaseAmazonClass{

	//object repository
		@FindBy(css="#ap_password")
		WebElement Password;
		@FindBy(id="signInSubmit")
		WebElement SignIn;
		@FindBy(name="rememberMe")
		WebElement Checkbox;
		
		
		//initiate page elements
		public Password() {
			PageFactory.initElements(driver, this);
		}
		
		//Methods to type Password and click on continue button
		public void typepassword(String pass) {
			Password.sendKeys(pass);
		}
		
		public void clickbtn() {
			SignIn.click();
		}
}
