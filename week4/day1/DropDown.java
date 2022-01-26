package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement wb = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Selenium']"));
		WebElement wb1 = driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[text()='Loadrunner']"));
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(wb).click(wb1).keyUp(Keys.CONTROL).perform();
		
		
	}

}
