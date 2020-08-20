package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//added in dev for test...

public class Login extends Base{
	WebDriver driver;

	@Test (priority = 1, description = " This function will go to home page and verify.")
	public void home(){

		driver = setupBrowser();
		driver.get("http://automationpractice.com/index.php");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "My Store";

		if (ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
			System.out.println("Home Page title verified.");	
		}

	}

	@Test (priority = 2, description = " This function will Login into site.")
	public void loginPage(){

		WebElement loginURL = driver.findElement(By.xpath("//a[@class='login'][contains(.,'Sign in')]"));
		loginURL.click();
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));//*[@id="email"]
		email.sendKeys("ifour.tarang@gmail.com");

		WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
		password.sendKeys("qwerty");

		WebElement submitButton = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		submitButton.click();
		
	}
}


