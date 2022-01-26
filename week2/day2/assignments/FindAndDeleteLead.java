package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAndDeleteLead {

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
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("10");
		driver.findElement(By.name("phoneNumber")).sendKeys("9940174140");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String leadID = driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]/a[@class='linktext']")).getText();
		//driver.findElement(By.xpath("//table[class='x-grid3-row-table']//a[1]")).getText();
		System.out.println("First Lead ID"+leadID);
		
		 driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]/a[@class='linktext']")).click();
		driver.findElement(By.linkText("Delete")).click();
		System.out.println("Lead ID deleted"+leadID);
		
	   driver.findElement(By.linkText("Find Leads")).click();
	   System.out.println("Find leads page displayed");
		//driver.findElement(By.linkText("Find Leads")).click();
	   driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(leadID);
	   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	   System.out.println("Searching deleted lead!!");
	   Thread.sleep(5000);
	   String verMsg = driver.findElement(By.className("x-paging-info")).getText();
	   System.out.println("Verification msg:"+verMsg);
	   String expMsg = "No records to display";
	   if (verMsg.contains(expMsg)) {
		   System.out.println("Lead deletion Successful");
	   }
	   else
		   System.out.println("Lead deletion Not Successful");
	   }
	}


