package week5.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassServiceNow {
	
	public ChromeDriver driver;
	@BeforeTest
	
	public void setup() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://dev109323.service-now.com/navpage.do");
	driver.manage().window().maximize();
	driver.switchTo().frame("gsft_main");
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Pollachi123!");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
	Thread.sleep(7000);
	}
	
	
	@AfterTest
	public void teardown() {
		//driver.close();
	}
	
	
}
