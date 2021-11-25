package TestNg.org;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Websites {
	WebDriver driver;
	@Test(groups = "Appilcation")
	private void FaceBook() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Maven_Test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("murugavel");
		driver.findElement(By.name("pass")).sendKeys("987988FB");
		WebElement tamil = driver.findElement(By.linkText("தமிழ்"));
		tamil.click();
		WebElement Engliesh = driver.findElement(By.linkText("English (UK)"));
		Engliesh.click();
		WebElement create = driver.findElement(By.linkText("Sign up for Facebook"));
		create.click();
		WebElement day = driver.findElement(By.id("day"));
		Select da = new Select(day);
		da.selectByValue("8");

		WebElement month = driver.findElement(By.id("month"));
		Select mo = new Select(month);
		mo.selectByVisibleText("Aug");

		WebElement year = driver.findElement(By.id("year"));
		Select ye = new Select(year);
		ye.selectByVisibleText("1999");
		System.out.println("Facebook");
		driver.quit();
	}

	@Test(groups = "Appilcation", dependsOnGroups = "property")
	private void FSAB() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Maven_Test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		WebElement mouseover = driver.findElement(By.linkText("STANDARDS"));
		Actions ac = new Actions(driver);
		ac.moveToElement(mouseover).perform();
		WebElement move = driver.findElement(By.linkText("Concepts Statements"));
		ac.moveToElement(move).perform();
		JavascriptExecutor ja = (JavascriptExecutor) driver;
		ja.executeScript("argumenrs[0].click();", driver);
		

	}

	@Test(groups = "property")
	private void Amazon() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Maven_Test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement scrolldown = driver.findElement(By.xpath("(//span[@class='navFooterDescText'])[3]"));
		JavascriptExecutor av = (JavascriptExecutor) driver;
		av.executeScript("arguments[0].scrollIntoView()", scrolldown);

		WebElement scrollup = driver.findElement(By.xpath("//a[@aria-label='Amazon App']"));
		JavascriptExecutor up = (JavascriptExecutor) driver;
		up.executeScript("arguments[0].scrollIntoView()", scrollup);
		System.out.println("Amazon");
		System.out.println(driver.getTitle());
		System.out.println("Amazon");

		driver.quit();

	}

	@Test(groups = "property")
	private void Myntra() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Maven_Test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/login");

		System.out.println("Myntra");
		driver.quit();

	}

	@Test(groups = "Appilcation")
	private void Google() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Maven_Test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Actions tt = new Actions(driver);
		tt.contextClick(gmail).perform();
		Robot bb = new Robot();
		bb.keyPress(KeyEvent.VK_DOWN);
		bb.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("google");

	}

	@Test(groups = "auto", expectedExceptions = Exception.class,timeOut = 2000)
	private void Aleart() {
		System.setProperty("webdrvier.chrome.driver",
				"C:\\Users\\NATURE\\eclipse-workspace\\Maven_Test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		System.out.println("Aleart");
		
	}

}
