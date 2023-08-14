package testLayer;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import basePackage.BaseAmazonClass;
import pompackage.AddressAccount;
import pompackage.Password;
import pompackage.Username;

public class AccountTest extends BaseAmazonClass{

	AddressAccount address;
	public AccountTest() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() throws InterruptedException {
		
		address = new AddressAccount();
		address.initiation();
		address.LoginAccount();
		Thread.sleep(3000);
		
		
		
	}
	
	@Test
	public void UserAccount() throws InterruptedException {
		address = new AddressAccount();
		WebElement dre= driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		//Create object of an Action Class
		Actions action = new Actions(driver);
		
		//Performing mouse hover action
		action.moveToElement(dre).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[contains(text(),'Your Addresses')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//text()[.='Add Address']/ancestor::div[1]")).click();
		Thread.sleep(3000);
		address.set_fullname("Manoj Gedia");
		Thread.sleep(2000);
		address.set_phonenumber("8077094048");
		Thread.sleep(2000);
		address.set_addressLine1("266");
		Thread.sleep(4000);
		address.set_addressLine1("Stanley Street");
		Thread.sleep(2000);
		address.set_city("Barrie");
		Thread.sleep(2000);
		Select dropdown=new Select(driver.findElement(By.xpath("//span[text()='Select']")));
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Ontario");
		Thread.sleep(2000);
		address.set_postalCode("L4M 6X8");
		Thread.sleep(2000);
		address.click_button();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
}
