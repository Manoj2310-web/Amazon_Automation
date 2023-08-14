package testLayer;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.Orders;
import pompackage.Password;
import pompackage.Searching;
import pompackage.Username;

public class SearchTest extends BaseAmazonClass {

	Searching sea;
	public SearchTest() {
		super();
	}
	
	@BeforeMethod
	public void initsetup() throws InterruptedException {
		
		sea=new Searching();
		sea.initiation();
		sea.LoginAccount();
		Thread.sleep(3000);
	}
	
	@Test
	public void Search() throws InterruptedException {
		sea=new Searching();
		sea.searchItem();
		Thread.sleep(3000);
		sea.clickonsearch();
		Thread.sleep(3000);
		String SearchResultProductname=driver.findElement(By.xpath("//span[contains(text(),concat('Men',\\\"'\\\",'s Jersey Short Sleeve Crew Neck'))]")).getText();
//		driver.findElement(By.xpath("//span[contains(text(),concat('Men',\"'\",'s Jersey Short Sleeve Crew Neck'))]")).click();
		//sea.itemsearch();
		System.out.println(SearchResultProductname);
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		//sea.filterclick();
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
