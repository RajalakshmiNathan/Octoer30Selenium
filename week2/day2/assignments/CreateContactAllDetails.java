package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAllDetails {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("max");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("man");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Product supplies");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Product supplies delivery head");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("maxman@gmail.com");
		
		WebElement stateDropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select selectState = new Select(stateDropdown);
		selectState.selectByVisibleText("Indiana");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		System.out.println("Contact created");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("product supplies");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Details Updated");
		//get title
		String PTitle = driver.getTitle();
		System.out.println("Page Title:"+PTitle);
	}

}
