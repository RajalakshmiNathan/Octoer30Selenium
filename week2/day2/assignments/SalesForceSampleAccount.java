package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceSampleAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.name("UserFirstName")).sendKeys("thompson");
		driver.findElement(By.name("UserLastName")).sendKeys("kevin");
		driver.findElement(By.name("UserEmail")).sendKeys("kevin@gmail.com");
		WebElement jobDropdown = driver.findElement(By.xpath("//select[contains(@id,'UserTitle')]"));
		Select selectJob = new Select(jobDropdown);
		selectJob.selectByValue("Developer");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Reynold");
		WebElement CompanyEmployee = driver.findElement(By.name("CompanyEmployees"));
		Select comEmployee = new Select(CompanyEmployee);
		comEmployee.selectByValue("75");
		
		driver.findElement(By.name("UserPhone")).sendKeys("9344356543");
		WebElement companyCountry = driver.findElement(By.name("CompanyCountry"));
		Select comCountry = new Select(companyCountry);
		comCountry.selectByVisibleText("India");
		
		Thread.sleep(5000);		
		
	driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div")).click();
		Thread.sleep(5000);		
		System.out.println("Form details filled successfully");
	}

}
