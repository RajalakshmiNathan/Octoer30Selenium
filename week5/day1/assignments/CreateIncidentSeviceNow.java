package week5.day1.assignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIncidentSeviceNow extends BaseClassServiceNow{
	@Test(priority = 1)
	public void createIncidentSeviceNow() throws InterruptedException, IOException {
				
		
		//driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		driver.findElement(By.xpath("//div[text()='Create New']")).click();
		driver.switchTo().frame("gsft_main");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@id='list_nav_incident']//button[text()='New']")).click();
		//driver.findElement(By.id("sysverb_new")).click();
		//select value for incident
		driver.findElement(By.xpath("//span[@class='icon icon-search']")).click();
		Thread.sleep(5000);
		
		Set<String> allwindowHandle = driver.getWindowHandles();
		List<String> windowHandle = new ArrayList<String>(allwindowHandle);
		driver.switchTo().window(windowHandle.get(1));
	
		driver.findElement(By.xpath("//a[@class='glide_ref_item_link']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(windowHandle.get(0));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("incident.short_description")).sendKeys("incident to be addressed");
		
		String incidentNumber = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println("incident.number"+incidentNumber);
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(incidentNumber);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
		
		String verifyIncident = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if(incidentNumber.equals(verifyIncident)) {
			System.out.println("Incident creation/verification successful");
		}
		else {
			System.out.println("Incident creation/verification not successful");
		}
				
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("incident.png");
		FileUtils.copyFile(source, dest);
	}

}
