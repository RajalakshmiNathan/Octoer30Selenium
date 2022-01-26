package week4.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chercherFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("frames");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		//Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement dropdown = driver.findElement(By.id("animals"));
		Select option = new Select(dropdown);
		option.selectByVisibleText("Baby Cat");
		
	}

}
