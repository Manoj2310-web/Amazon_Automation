package testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pompackage.Username;
import pompackage.Password;

import basePackage.BaseAmazonClass;

public class LoginTest extends BaseAmazonClass {

	Username Log;
	Password Pas;
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		initiation();
		
		Log=new Username();
		Pas=new Password();
	}
	
//	@Test(priority=1)
//	public void Login() throws InterruptedException {
//		Log.typeusername(prop.getProperty("Username"));
//		Thread.sleep(2000);
//		Log.clickbtn();
//		Pas.typepassword(prop.getProperty("Password"));
//		Thread.sleep(2000);
//		Pas.clickbtn();
//	}
	
//	@Test(priority=2)
//	public void Title() throws InterruptedException {
//		String actual= Log.verify();
//		System.out.println(actual);
//		Assert.assertEquals(actual, "Amazon Sign In");
//		Thread.sleep(2000);
//	}
//	
//	@Test(priority=1)
//	public void Correct_Email() throws InterruptedException {
//		Log.typeusername("manojgedia94@gmail.com");
//		Thread.sleep(2000);
//		Log.clickbtn();
//		Thread.sleep(2000);
//	}
//	
//	@Test(priority=2)
//	public void InCorrect_Email() throws InterruptedException {
//		Log.typeusername("manojgedia");
//		Thread.sleep(2000);
//		Log.clickbtn();
//		Thread.sleep(2000);
//	}
	
//	@Test
//	public void InCorrect_Password() throws InterruptedException {
//		Log.typeusername("manojgedia94@gmail.com");
//		Thread.sleep(2000);
//		Log.clickbtn();
//		Pas.typepassword("");
//		Pas.clickbtn();
//		Thread.sleep(5000);
//	}
	
	@Test
	public void KeepMeSignedIn() throws InterruptedException {
		Log.typeusername("manojgedia94@gmail.com");
		Thread.sleep(2000);
		Log.clickbtn();
		Pas.typepassword("Manoj@2310");
		WebElement checkbox=driver.findElement(By.name("rememberMe"));
		checkbox.click();
		Thread.sleep(4000);
		Pas.clickbtn();
		Thread.sleep(4000);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		Thread.sleep(2000);
		assert currentURL.equals("https://www.amazon.ca/?ref_=nav_ya_signin") : "Login is successful";
//		driver.close();
//		initiation();
//		Thread.sleep(4000);
	}
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
