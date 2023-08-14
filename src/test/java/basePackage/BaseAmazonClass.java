package basePackage;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TimeUtils;

public class BaseAmazonClass {

	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	public BaseAmazonClass() {
		
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\AmazonTestNG\\src\\test\\java\\environmentvariables\\Config.properties");
		prop.load(file);
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException a) {
			// TODO Auto-generated catch block
			a.printStackTrace();
		}
	}
	
	//Step 2 Create method to keep all common command child will be using it
	
	public static void initiation() {
	String browsername = prop.getProperty("browser");
	
	if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();}
	else if(browsername.equals("Firefox")){
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TimeUtils.timepage));
	driver.get(prop.getProperty("url"));
	}
	}

