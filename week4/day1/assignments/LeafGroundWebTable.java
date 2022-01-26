package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String ProgressValue ;
		String text = "Learn to interact with Elements";
		int progresscol =0;
		int textcol =0;
		int vitalTask=0;
		int reqrow=0;
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		int rowSize = rows.size();
		System.out.println(rowSize);
		List<Integer> progressValues = new ArrayList<Integer>();
		List<WebElement> header=driver.findElements(By.xpath("//table[@id='table_id']//tr[1]/th"));
		int HeaderSize = header.size();
		System.out.println(HeaderSize);
		//List<String> headerval = new ArrayList<String>();
		for(int k=1;k<=HeaderSize;k++) {
			String temp=driver.findElement(By.xpath("//table[@id='table_id']//tr[1]/th["+k+"]")).getText();
			if (temp.equals("Selenium Learning Details")) {
				textcol=k;
							}
			if (temp.equals("Progress")) {
				progresscol=k;
						}
			if(temp.equals("Vital Task")) {
				vitalTask =k;
			}
		}
			System.out.println("Text column:"+textcol);
		for(int i =2; i<=rowSize;i++) {
			List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table_id']//tr["+i+"]/td"));
			int colSize = cols.size();
			System.out.println(colSize);
			
			String Temptext = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+textcol+"]")).getText();
			ProgressValue = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+progresscol+"]")).getText();
			if(text.equals(Temptext)) {
				reqrow=i;
				System.out.println("Learn to interact with elements found in this row:"+reqrow);
				//ProgressValue = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+progresscol+"]")).getText();
				System.out.println("Progress value for Learn to interact with Elements:"+ProgressValue);
				
			}
			//Add progress values to list
            String y= ProgressValue.replace("%", "");
            Integer temp = Integer.parseInt(y);
            //System.out.println("temp:"+temp);
			progressValues.add(temp);
				
		}
		
		
		List<Integer> progressValueList = new ArrayList<Integer>(progressValues);
		int finalValue = Collections.min(progressValueList);
		System.out.println("Least Progress Value:"+finalValue);
		
		//check vitals with least progress
		
		WebElement leastVital = driver.findElement(By.xpath("//td[text()='"+finalValue+"%']/following-sibling::td/input"));
		leastVital.click();
		if(leastVital.isSelected()) {
			System.out.println("Least progress vital is selected");
		}
		
		
	}

}
