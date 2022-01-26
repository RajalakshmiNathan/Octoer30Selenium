package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//selecting dropdown n-1
		WebElement dropDown = driver.findElement(By.id("dropdown1"));
		Select option = new Select(dropDown);
		List<WebElement>  optionList = option.getOptions();
		int listSize = optionList.size();
		int reqIndex = listSize-1;
		option.selectByIndex(reqIndex-1); //since index starts from 0
				
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select option2 = new Select(dropDown2);
//		List<WebElement>  optionList2 = option2.getOptions();
//		int listSize2 = optionList2.size();
//		int reqIndex2 = listSize2/2;
//		System.out.println(reqIndex2);//finding mid value
//		option2.selectByIndex(reqIndex2-1); //since index starts from 0
		option2.selectByVisibleText("Selenium");		
		
		//Selecting by value
		
		WebElement dropDown3 = driver.findElement(By.name("dropdown3"));
		Select option3 = new Select(dropDown3);
		option3.selectByValue("3");		
		
		//Finding Number of dropdown options
		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select option4 = new Select(dropdown4);
		List<WebElement>  optionList4 = option4.getOptions();
		int listSize4 = optionList4.size();
		System.out.println("Number of dropdown options:"+listSize4);
		
		//selecting by send keys
		WebElement dropdown5  = driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select"));
		//Select option5 = new Select(dropdown5);		
		//List<WebElement>  optionList5 = option5.getOptions();
		dropdown5.sendKeys("Appium");
		
		WebElement listBox = driver.findElement(By.xpath("//option[text()='Select your programs']/parent::select"));
		listBox.sendKeys("Loadrunner");
	}

}
