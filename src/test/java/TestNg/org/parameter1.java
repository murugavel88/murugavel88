package TestNg.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter1 {
	@Parameters({ "username", "password" })
	@Test(dataProvider = "login")
	private void credetline(String username, String password) {
		System.out.println("Enter a login caradetline");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Maven_Test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		WebElement password1 = driver.findElement(By.id("pass"));
		password1.sendKeys(password);
	}

	@DataProvider
	private Object[][] login() {
		return new Object[][] {

				{ "AAA", "111" }, { "BBB", "222" }, { "CCC", "333" }

		};
	}

}
