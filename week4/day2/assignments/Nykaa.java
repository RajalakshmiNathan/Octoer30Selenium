package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement WbBrand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(WbBrand).perform();
		
		Thread.sleep(5000);
		driver.findElement(By.id("brandSearchBox")).sendKeys("l'Oreal Paris");
		Thread.sleep(3000);
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		
		//check title
		String pgTitle = driver.getTitle();
		if (pgTitle.contains("L'Oreal Paris")) {
			System.out.println("Page title contains loreal paris");
		}
		else {
			System.out.println("Page title doesnot contain loreal paris");
		}
		
		//sort by customer top rated
		driver.findElement(By.className("sort-name")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();	
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		List<WebElement> filters = driver.findElements(By.className("filter-value"));
		int filtersize = filters.size();
		for(WebElement ft :filters ) {
			String text = ft.getText();
			if(text.contains("Shampoo")) {
				System.out.println("Shampoo filter is applied");
			}
			if(text.contains("Color Protection")) {
				System.out.println("Color Protection filter is applied");
			}			
			
		}
		
		//driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour Protect Shampoo']")).click();
		//div[contains(text(),'Colour Protect Shampoo']
		
		//unable to click loreal paris color protect shampoo
		driver.findElement(By.xpath("//div[contains(text(),'Colour Protect Shampoo')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindowHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWindowHandles.get(1));
		
		WebElement sizeDropDown = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select sizeDropDownselect = new Select(sizeDropDown);
		sizeDropDownselect.selectByVisibleText("175ml");
		
		//print MRP
		String MRP = driver.findElement(By.xpath("//span[text()='MRP:']/span")).getText();
		System.out.println("MRP:"+MRP);
		
		driver.findElement(By.xpath("//button/span[text()='ADD TO BAG']")).click();
		
		driver.findElement(By.xpath("//button/span[@class='cart-count']")).click();
		driver.switchTo().frame(0);
		Thread.sleep(10000);
		String grandTotal = driver.findElement(By.xpath("//span[text()='Grand Total']/following::div")).getText();
		System.out.println("Grand Total:"+grandTotal);
		
		driver.findElement(By.xpath("//span[text()='PROCEED']")).click();
		
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		
		String actualGrandTotal = driver.findElement(By.xpath("//div[text()='Grand Total']/following::span")).getText();
		System.out.println("Grand total in check out:"+actualGrandTotal);
		
		if(grandTotal.contains(actualGrandTotal)) {
			System.out.println("Grandtotal matches with Actual grand total");
			
		}
		else
		{
			System.out.println("Grandtotal doesnt match with Actual grand total");
			
		}
			
		//driver.close();
		
	}

}
