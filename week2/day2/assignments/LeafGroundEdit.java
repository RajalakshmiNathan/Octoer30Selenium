package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("email")).sendKeys("georgeflint@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("jack");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		//get default text entered
		WebElement  wbDefaultText= driver.findElement(By.name("username"));
		String defaultText=wbDefaultText.getAttribute("value");
		System.out.println("value in text box:"+defaultText);
		//clear the text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		//check if testbos disabled
		boolean blEnabled = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isEnabled();
		if (!blEnabled)
			System.out.println("Textbox is disabled");
		else
			System.out.println("Textbox is enabled");
	}

}
