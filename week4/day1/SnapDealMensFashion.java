package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealMensFashion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		//WebElement wb = driver.findElement(By.xpath("//span[contains(text(),'Mens Fashion')]"));
		WebElement wb = driver.findElement(By.xpath("//li[text()='More Categories']//following::span[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(wb).perform();
		
		WebElement wb2 = driver.findElement(By.xpath("//span[text()='Sneakers']"));
		builder.doubleClick(wb2).perform();
				

	}

}
