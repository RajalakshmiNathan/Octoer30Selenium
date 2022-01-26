package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookHandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//click create account
		driver.findElement(By.linkText("Create New Account")).click();
		
		//enter new account details
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Sam");
		driver.findElement(By.name("lastname")).sendKeys("eliza");
		driver.findElement(By.id("password_step_input")).sendKeys("Eliza123");
		driver.findElement(By.name("reg_email__")).sendKeys("9876566773");
		
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select daySelect = new Select(dayDropDown);
		daySelect.selectByVisibleText("10");
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropDown);
		monthSelect.selectByValue("6");
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		yearSelect.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		driver.findElement(By.name("websubmit")).click();
		
		System.out.println("Successfully created account");
		
		//driver.close();
	}

}
