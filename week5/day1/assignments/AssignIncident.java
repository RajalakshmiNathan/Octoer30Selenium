package week5.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AssignIncident extends BaseClassServiceNow{
		
	@Test(priority=3)
	public void assignIncident() {
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		//Open record: INC0008111"
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("INC0008111");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
		driver.switchTo().frame("gsft_main");	
		
		driver.findElement(By.xpath("//button[@id='lookup.incident.assignment_group']/span")).click(); 
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWindowHandles.get(1));
		
		driver.findElement(By.xpath("//a[text()='Analytics Settings Managers']")).click();
		driver.switchTo().window(allWindowHandles.get(0));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("activity-stream-textarea")).sendKeys("software group update");
		driver.findElement(By.id("sysverb_update")).click();
	}

}
