package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {

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
		
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='firstName']")).sendKeys("babu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//click on the first resulting lead
		//String leadID = driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]//a[@class='linktext'][1]")).getText();
		driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]//a[@class='linktext'][1]")).click();
		
		String expTitle = "View Lead | opentaps CRM";
		String actTitle = driver.getTitle();
		
		if (expTitle.equals(actTitle))
			System.out.println("Page title verified");
		else
			System.out.println("Page title doesnot match");
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(3000);
		String companyName ="accenture";
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		
		String CaptureCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(CaptureCompany.contains(companyName))
			System.out.println("Company name change successful"+CaptureCompany);
		else
			System.out.println("Company name change not successful"+CaptureCompany);
		
		driver.close();
				
	}

}
