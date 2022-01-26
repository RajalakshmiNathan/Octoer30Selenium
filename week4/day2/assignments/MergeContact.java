package week4.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click 'Contacts' tab
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//a")).click();
		
		//click on the first resulting contact in new window 
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Window handles:"+allWindowHandles.size());
		
		List<String> WindowHandles = new ArrayList<String>(allWindowHandles);
		String secondWindowHandle = WindowHandles.get(1);
		String firstWindowHandle = WindowHandles.get(0);
		driver.switchTo().window(secondWindowHandle);
		Thread.sleep(5000);
		String firstLinkText = driver.findElement(By.xpath("//table[contains(@class,'x-grid3-row-table')]//td//a[@class='linktext']")).getText();
		
		driver.findElement(By.xpath("//table[contains(@class,'x-grid3-row-table')]//td//a[@class='linktext']")).click();
		Thread.sleep(5000);
		//driver.switchTo().defaultContent();
		driver.switchTo().window(firstWindowHandle);
		Thread.sleep(5000);
		//click the second widget to
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//following::a[2]")).click();
		
		
		//click on the first resulting contact in To window 
				Set<String> allWindowHandles2 = driver.getWindowHandles();
				System.out.println("Window handles:"+allWindowHandles2.size());
				
				List<String> WindowHandles2 = new ArrayList<String>(allWindowHandles2);
				String secondWindowHandle2 = WindowHandles2.get(1);
				String firstWindowHandle2 = WindowHandles2.get(0);
				driver.switchTo().window(secondWindowHandle2);
				Thread.sleep(5000);
				String firstLinkText2 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).getText();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
				driver.switchTo().window(firstWindowHandle2);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				
				driver.switchTo().alert().accept();
				System.out.println("Page title:"+driver.getTitle());
				
				
	}

}
