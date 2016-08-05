package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginTest() throws InterruptedException {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\GrillSgt\\workspace\\TestNG\\drivers\\chromedriver.exe");
		System.out.println("Starting ChromeDriver...");
		WebDriver driver = new ChromeDriver();
		System.out.println("ChromeDriver started.");*/
		System.out.println("Starting Firefox...");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Firefox started.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Loading Rediff.com.");
		driver.get("http://rediff.com");
		System.out.println("Rediff.com loaded");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
		System.out.println("Sign In page loaded.");
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Firefox closed");
		
	}

}
