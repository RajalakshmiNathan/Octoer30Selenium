package week5.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgLeads {

		// TODO Auto-generated method stub
		public ChromeDriver driver;
		
		@BeforeMethod
		
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		
		@Test(priority=1 ,invocationCount = 3)
		
		public void createLead(){
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
			driver.findElement(By.name("submitButton")).click();
		}

		@Test (priority=2, dependsOnMethods="week5.day1.assignments.TestNgLeads.createLead")
		public void deleteLead() throws InterruptedException{
			
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

		}
		
		@Test(dependsOnMethods={"week5.day1.assignments.TestNgLeads.createLead","week5.day1.assignments.TestNgLeads.deleteLead"},alwaysRun = true)
		public void duplicateLead() throws InterruptedException{
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.name("submitButton")).click();
			}
		
		@Test(priority=3)
		
		public void editLead() throws InterruptedException{
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
			driver.findElement(By.name("submitButton")).click();
			}

		@AfterMethod
		public void teardown() {
			driver.close();
		}
}




