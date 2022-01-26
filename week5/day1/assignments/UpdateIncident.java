package week5.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateIncident extends BaseClassServiceNow{
	
	@Test(priority=2)
	public void updateIncident() {
		
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		//Open record: INC0008111"
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("INC0008111");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
		driver.switchTo().frame("gsft_main");
		//click on incident
//		driver.findElement(By.xpath("//a[text()='INC0008111']")).click();
//		driver.findElement(By.xpath("//a[text()='INC0008111']")).sendKeys(Keys.ENTER);
		
		WebElement dropDown = driver.findElement(By.name("incident.urgency"));
		Select dropDownSelect = new Select(dropDown);
		dropDownSelect.selectByVisibleText("1 - High");
				
		WebElement dropDownState = driver.findElement(By.name("incident.state"));
		Select dropDownSelectState = new Select(dropDownState);
		dropDownSelectState.selectByVisibleText("In Progress");
		
		driver.findElement(By.id("activity-stream-textarea")).sendKeys("priority and state updated");
		driver.findElement(By.id("sysverb_update")).click();
		
		
	}

}
