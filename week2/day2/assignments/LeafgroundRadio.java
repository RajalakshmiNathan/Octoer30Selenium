package week2.day2.assignments;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//are u enjoying classes
		driver.findElement(By.xpath("//div[@id='first']//input[@id = 'yes']")).click();
		
		//Find default selected radio button
		WebElement radio = driver.findElement(By.xpath("//label[text()='Find default selected radio button']/parent::div"));
		List<WebElement> radioList  = radio.findElements(By.tagName("input"));
		List<WebElement> labelList  = radio.findElements(By.tagName("label"));
		//int radioListCount = radioList.size();
		//System.out.println(radioListCount);
		int index = 0;
		for (WebElement radioButton : radioList) {
			index=index+1;
			boolean blCheck = radioButton.isSelected();
			System.out.println("blCheck"+blCheck);
			if (blCheck) {
				System.out.println("index of selected radio:"+index);
				break;
			}
		}
		System.out.println("Selected Radio label:"+labelList.get(index).getAttribute("for"));
	
		//select your age group
		driver.findElement(By.xpath("//label[contains(text(),'Select your age group')]/following-sibling::input[2]")).click();
		
			
	}

}
