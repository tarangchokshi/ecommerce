package pages;
import org.testng.annotations.*;


public class Login extends Base{

	@Test
	public void login(){

		driver = setupBrowser();
		driver.get("http://automationpractice.com/index.php");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "My Store";

		if (ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
			System.out.println("Home Page title verified.");	
		}

	}
}


