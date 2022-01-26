package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Goto home page n verify title
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		String brTitle= driver.getTitle();
		if(brTitle.contains("Selenium Playground")) {
			System.out.println("Navigating to right page.Home");
		}
		else {
			System.out.println("Navigation unsucessful");
		}
		
		driver.navigate().back();
		//Find position of Button
		System.out.println("Position is:"+driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation());
		
		//Find color of button
		System.out.println("Color is"+driver.findElement(By.id("color")).getCssValue("color"));
		
		//display size of the object
		System.out.println("Size is:"+driver.findElement(By.id("size")).getSize());
	}
}