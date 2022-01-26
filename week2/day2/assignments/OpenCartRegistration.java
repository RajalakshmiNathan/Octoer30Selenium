package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-username")).sendKeys("Hillary10");
		driver.findElement(By.id("input-firstname")).sendKeys("Hillary");
		driver.findElement(By.id("input-lastname")).sendKeys("clinton");
		driver.findElement(By.id("input-email")).sendKeys("Hclinton@gmail.com");
		
		WebElement countryDropdown = driver.findElement(By.id("input-country"));
		Select countrySelect = new Select(countryDropdown);
		countrySelect.selectByVisibleText("India");
		
		driver.findElement(By.id("input-password")).sendKeys("hclinton1025");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
	}

}
