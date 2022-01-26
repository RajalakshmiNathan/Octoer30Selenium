package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		String brTitle= driver.getTitle();
		if(brTitle.contains("Selenium Playground")) {
			System.out.println("Navigating to right page.Home");
		}
		else {
			System.out.println("Navigation unsucessful");
		}
		
		driver.navigate().back();
		
		//verify broken image
	String imgDisplay = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).getAttribute("src");
	System.out.println(imgDisplay);
	driver.get(imgDisplay);
	String brokenTitle = driver.getTitle();
	
	if (brokenTitle.contains("HTTP Status 404 ")) {
		System.out.println("Link is broken");
	}
	else {
		System.out.println("Link is not broken");
	}
	driver.navigate().back();
	
	//click an image from keybord or mouse
	//int x = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).getLocation().getX();
	//int y = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).getLocation().getY();
	driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
	String brTitle1= driver.getTitle();
	if(brTitle1.contains("Selenium Playground")) {
		System.out.println("Navigating to right page.Home");
	}
	else {
		System.out.println("Navigation unsucessful");
	}
	
	}

}
