package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactSelect {

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
		
		//click contacts tab
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("max");
		driver.findElement(By.id("lastNameField")).sendKeys("downman");
		
		WebElement dropDown=driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select sl = new Select(dropDown);
		sl.selectByVisibleText("INR - Indian Rupee");
		
		WebElement countryDropdown = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select countrySelect = new Select(countryDropdown);
		countrySelect.selectByValue("IND");
				
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		
		//print first name and browser title
		String firstName = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println("First Name:"+firstName);
		String bName = driver.getTitle();
		System.out.println("Browser Title:"+bName);
	driver.close();
	}

}
