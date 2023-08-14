package testLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.Orders;
import pompackage.Password;
import pompackage.Username;

public class OrderTest extends BaseAmazonClass{

	Orders ord;
	public OrderTest() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() throws InterruptedException {
		ord=new Orders();
		ord.initiation();
		ord.LoginAccount();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void OrderModule() throws InterruptedException {
		ord=new Orders();
		Thread.sleep(3000);
		WebElement dre= driver.findElement(By.cssSelector("#nav-link-accountList"));
		System.out.println(dre);
		//Create object of an Action Class
		Actions action = new Actions(driver);
		
		//Performing mouse hover action
		action.moveToElement(dre).build().perform();
		System.out.println("hello");
		Thread.sleep(5000);
		ord.ClickOnOrders();
//		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[contains(text(),'Your Orders')]")).click();
		Thread.sleep(5000);
		ord.ClickOnBuyAgain();
//		driver.findElement(By.xpath("//a[text()='Buy Again'] [@class='a-link-normal']")).click();
		Thread.sleep(3000);
		ord.NotYetShipped();
//		driver.findElement(By.xpath("//a[text()='Not Yet Shipped']")).click();
		Thread.sleep(5000);
		ord.CancelledOrders();
//		driver.findElement(By.xpath("//span[contains(text(),'Cancelled Orders')]")).click();
		Thread.sleep(4000);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
