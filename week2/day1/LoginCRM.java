package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginCRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AAA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("James");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Reynolds");
		driver.findElement(By.name("submitButton")).click();
		String comName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("company name:"+comName);
		
		String bTitle = driver.getTitle();
		System.out.println("Browser title:"+bTitle);
		
		driver.close();
	}

}
