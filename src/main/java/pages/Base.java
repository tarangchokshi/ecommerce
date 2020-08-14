package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Base {
	WebDriver driver;


	public WebDriver setupBrowser(){
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}




	@AfterSuite
	public void tearDown(){
		driver.close();
	}
}
