package TestNg.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter2 {
	@Parameters({"name","password"})
	@Test
	private void login_page(String name, String password) throws Throwable {
		System.setProperty("webdriver.driver.chromedriver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Maven_Test\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		WebElement number = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone ')]"));
		number.sendKeys(name);

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//
//		WebElement mail = driver.findElement(By.id("email"));
//		mail.sendKeys(name);
//		
//		WebElement password1 = driver.findElement(By.id("pass"));
//		password1.sendKeys(password);

	}

}
