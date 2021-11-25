package TestNg.org;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Ingoner {
	WebDriver driver;

	@BeforeSuite
	private void set_chrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Maven_Test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(groups = "money", priority = 1, invocationCount = 5,dependsOnGroups ="cost")
	private void faceBook_luanch() {

		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		System.out.println("facebook");

	} 

	@Test(groups = "money", priority = 2)
	private void Amazon_launch() {

		driver.navigate().to("https://www.amazon.in/");
		System.out.println("Amazon");

	}

	@Test(groups = "money", priority = 3)
	private void fasb_luanch() throws Throwable {

		driver.navigate().to("https://www.fasb.org/home");
		driver.findElement(By.xpath("//a[@data-dropdown='#dropdown-1176171545645']")).click();
		System.out.println("application");
		TakesScreenshot tv = (TakesScreenshot) driver;
		File scr = tv.getScreenshotAs(OutputType.FILE);
		File dec = new File("C:\\Users\\NATURE\\eclipse-workspace\\Maven_Test\\screenshort\\test.png");
		FileUtils.copyFile(scr, dec);

	}

	@Test(groups = "cost", priority = 4)
	private void Filpkart_luanch() {

		driver.navigate().to("https://affiliate.flipkart.com/login");
		System.out.println("filpkart");

	}

	@Test(groups = "cost", priority = 5, expectedExceptions = Exception.class)
	private void myntra_luanch() {
		driver.navigate().to("https:/www.ntra.om/login");
		System.out.println("myntra");
	}

}
