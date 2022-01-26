package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundFrame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/pages/frame.html");
		 driver.manage().window().maximize();
		 driver.switchTo().frame(0);
		 WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
		 File Source = clickMe.getScreenshotAs(OutputType.FILE);
		 File dest = new File("frame1.png");
		 FileUtils.copyFile(Source, dest);
		 driver.switchTo().defaultContent();
		 
		 //Get the number of frames
		 List<WebElement> frameList = driver.findElements(By.tagName("iframe"));
		 System.out.println("Number of frames in the page:"+frameList.size());
	}

}
