package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		
		driver.findElement(By.linkText("Leads")).click();

			
		driver.findElement(By.linkText("Find Leads")).click();
		System.out.println("Find leads page displayed");
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babyananthi.1999@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
		String leadID = driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]/a[@class='linktext']")).getText();
		//driver.findElement(By.xpath("//table[class='x-grid3-row-table']//a[1]")).getText();
		System.out.println("First Lead ID"+leadID);
		
		 driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]/a[@class='linktext']")).click();
		System.out.println("First lead clicked");
		String firstName=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String BTitle = driver.getTitle();
		String verTitle = "Duplicate Lead";
		if(BTitle.contains(verTitle))
			System.out.println("Title verified as Duplicate Lead"+BTitle);
		else
			System.out.println("Title is not as Duplicate Lead"+BTitle);
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		String capturedFirstName=driver.findElement(By.id("viewLead_firstName_sp")).getText();	
		 
		  if(firstName.equals(capturedFirstName))
			System.out.println("First name is same as captured first name"+capturedFirstName);
		else
			System.out.println("First name is not same as captured first name");
		//driver.close();
	}

}
