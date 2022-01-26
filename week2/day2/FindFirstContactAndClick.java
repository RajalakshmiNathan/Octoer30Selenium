package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindFirstContactAndClick {

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
				driver.findElement(By.linkText("Find Contacts")).click();
				
				//enter firstname
				
				driver.findElement(By.xpath("//label[text()='Contact Id:']/following::input[@name='firstName']")).sendKeys("babu");
				driver.findElement(By.xpath("//label[text()='Contact Id:']/following::button[text()='Find Contacts']")).click();
				
				Thread.sleep(5000);
				//get first contact and print id
				String contactId = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).getText();
				System.out.println("First contact id:"+contactId);
				driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).click();
				
				//get details of first record
			String contactName=	driver.findElement(By.id("viewContact_fullName_sp")).getText();		
			System.out.println("Contact details displayed.contact name:"+contactName);
	}

}
