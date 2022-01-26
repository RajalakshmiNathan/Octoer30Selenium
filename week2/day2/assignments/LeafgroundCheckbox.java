package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//select the languages u know
		List<WebElement> chkList = driver.findElements(By.xpath("//div[@class='example'][1]//input[@type='checkbox']"));
		chkList.get(0).click();
		//confirm if selenium is selected
		boolean blSelect=driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		if(blSelect)
			System.out.println("Selenium selected");
		else
			System.out.println("Selenium not selected");
		//deselect if selected
		List<WebElement> deSelect = driver.findElements(By.xpath("//label[text()='DeSelect only checked']/following::input"));
		for(WebElement ds:deSelect) {
			if(ds.isSelected())
				ds.click();
		}
				
	//select all check boxes
	List<WebElement> selectChecks = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
	for(WebElement checkBox :selectChecks) {
		checkBox.click();
	}
}
}