package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWindowHandle {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=Books&ref=nb_sb_noss_2");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fingerprint')]")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> allHandles = new ArrayList(windowhandles);
		driver.switchTo().window(allHandles.get(1));
		
		System.out.println(driver.getTitle());
		WebElement ele =driver.findElement(By.xpath("//span[contains(text(),'Fingerprint')]"));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest= new File("snaps/snap1.jpg");
		FileUtils.copyFile(source, dest);
		
		File source1 = ele.getScreenshotAs(OutputType.FILE);
		File dest1= new File("snaps/snap2.jpg");
		FileUtils.copyFile(source1, dest1);
		
 
	}

}
