package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class Orders extends BaseAmazonClass{

	Username Log;
	Password pas;
	
	
	//object repository
		@FindBy(xpath="//span[text()='Your Account']")
		WebElement Account;
		@FindBy(xpath="//a[text()='Buy Again'] [@class='a-link-normal']")
		WebElement BuyAgain;
		@FindBy(xpath="//*[contains(text(),'Not Yet Shipped')]")
		WebElement NotYetShipped;
		@FindBy(xpath="//*[contains(text(),'Cancelled Orders')]")
		WebElement CancelledOrders;

		//initiate page elements
		public Orders() {
			PageFactory.initElements(driver, this);
		}
		
		//Methods to click on order button
		public void ClickOnOrders() {
			System.out.println("Clickme");
			System.out.println(Account);
			Account.click();
			System.out.println("Clickme after");
		}
		
		public void ClickOnBuyAgain() {
			System.out.println("ClickonBuyAgian");
			BuyAgain.click();
		}
		
		public void NotYetShipped() {
			NotYetShipped.click();
		}
		
		public void CancelledOrders() {
			CancelledOrders.click();
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
