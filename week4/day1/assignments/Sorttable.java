package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorttable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");
		driver.manage().window().maximize();
		
		int nameCol=0;
		WebElement Table = driver.findElement(By.id("table_id"));
		List<WebElement> RowsList = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		int rowSize = RowsList.size();
		System.out.println("Row Size:"+rowSize);
		List<String> nameList = new ArrayList<String>();
		List<String> nameList2 = new ArrayList<String>();
		List<WebElement> HeaderList = driver.findElements(By.xpath("//table[@id='table_id']//tr//th"));
		int headerSize = HeaderList.size();
		System.out.println("Header Size:"+headerSize);
		
		for(int k=1;k<=headerSize;k++) {
			String temp =  driver.findElement(By.xpath("//table[@id='table_id']//tr//th["+k+"]")).getText();
			if(temp.equals("Name")) {
				nameCol = k;
				break;
			}
			
		}
		
		System.out.println("nameCol"+nameCol);
		
		for(int i=1;i<rowSize;i++) {
			List<WebElement> colsList = driver.findElements(By.xpath("//table[@id='table_id']//tbody/tr["+i+"]/td"));
			int colsSize = colsList.size();
			//System.out.println("cols Size:"+colsSize);
			
		
				String nameListstr = driver.findElement(By.xpath("//table[@id='table_id']//tbody/tr["+i+"]/td["+nameCol+"]")).getText();
				//int namesSize = nameList.size();
				nameList.add(nameListstr);
				System.out.println("name:"+nameListstr);
				
		
			
			
		}
		
		Collections.sort(nameList);
		
		//click on name and add to list
		driver.findElement(By.xpath("//table[@id='table_id']//tr//th[text()='Name']")).click();
		
		WebElement Table2 = driver.findElement(By.id("table_id"));
		List<WebElement> RowsList2 = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		int rowSize2 = RowsList2.size();
		
		for(int l=1;l<rowSize;l++) {
			List<WebElement> colsList2 = driver.findElements(By.xpath("//table[@id='table_id']//tbody/tr["+l+"]/td"));
			int colsSize2 = colsList2.size();
			//System.out.println("cols Size:"+colsSize);
			
		
				String nameListstr2 = driver.findElement(By.xpath("//table[@id='table_id']//tbody/tr["+l+"]/td["+nameCol+"]")).getText();
				//int namesSize = nameList.size();
				nameList2.add(nameListstr2);
				System.out.println("name:"+nameListstr2);	
			
		}
		
		boolean bl = nameList2.equals(nameList);
		System.out.println("Comparison of both lists"+bl);
		
		
	}

}
