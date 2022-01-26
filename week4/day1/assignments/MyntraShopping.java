package week4.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraShopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions builder = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()='Men']"));
		builder.moveToElement(men).perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Jackets")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("brand-more")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
		driver.findElement(By.xpath("//input[@value='Duke']/following-sibling::div[@class='common-checkboxIndicator']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'sprites-remove')]")).click();
		Thread.sleep(5000);
		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
		System.out.println("Number of products in page:"+allProducts.size());
		for(int i=0;i<allProducts.size();i++) {
		String temp=allProducts.get(i).findElement(By.xpath(".//h3[@class='product-brand']")).getText();
		//System.out.println("temp:"+temp);
		if(!temp.equals("Duke")) {
			System.out.println("Product brand not equal"+temp+"product number:"+(i+1));
			//break;
		}
	}
		
		//Click on better discount
		
		//driver.findElement(By.xpath("//div[@class='sort-sortBy']")).click();
		
		WebElement wb =driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		builder.moveToElement(wb).perform();
		Thread.sleep(5000);
	
		
		driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
	
		
		
		//Get first discounted price
		
		String firstDiscountPrice = driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
		System.out.println("First discounted price:"+firstDiscountPrice);
		
		WebElement firstProduct = driver.findElement(By.xpath("//picture[@class='img-responsive']"));
		builder.moveToElement(firstProduct).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(@class,'product-actionsButton')]")).click();
		
		//driver.close();
		

	}
}
