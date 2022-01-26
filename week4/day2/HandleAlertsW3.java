package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertsW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().sendKeys("Raji");
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.id("demo")).getText();
		if(text.contains("Raji")) {
			System.out.println("text appears on the browser"+text);
		}
		else {
			System.out.println("Text doesnot appear on the browser");
		}
			
		
	
		
	}

}
