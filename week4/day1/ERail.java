package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://erail.in");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.id("txtStationFrom")).clear();
			driver.findElement(By.id("txtStationFrom")).sendKeys("mas");
			Thread.sleep(2000);
			driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
			
			//txtStationTo
			driver.findElement(By.id("txtStationTo")).clear();
			driver.findElement(By.id("txtStationTo")).sendKeys("mdu");
			Thread.sleep(2000);
			driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("chkSelectDateOnly")).click();
			Thread.sleep(20);
			
			//DataTable DataTableHeader TrainList TrainListHeader
			
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int rowsize = rows.size();
		System.out.println(rowsize);
		
		List<String> trainnames = new ArrayList<String>();
		for(int i = 1 ; i<=rowsize;i++) {
			
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
			trainnames.add(text);
			System.out.println(text);
		}
		
		Set trainnameset = new LinkedHashSet<String>(trainnames);
		
		if(trainnames.size() != trainnameset.size()) {
			System.out.println("has duplicates");
		}
		else {
			System.out.println("no duplicates");
		}
		}
	
}