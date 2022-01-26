package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMobile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//search oneplus 9 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String customerReviews = driver.findElement(By.xpath("//span[contains(@aria-label,'out of 5 stars')]/following-sibling::span")).getText();
		System.out.println("No of customer reviews:"+customerReviews);
		
		
		driver.findElement(By.xpath("//i[contains(@class,'a-icon-star-small')]")).click();
		
		String percentage=driver.findElement(By.xpath("//a[contains(@title,' 5 stars')]")).getAttribute("title");
		System.out.println("percentage:"+percentage);
		
		driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[2]")).click();
		
		Set<String> allWindowHandle = driver.getWindowHandles();
		List<String> windowHandleList = new ArrayList<String>(allWindowHandle);
		System.out.println("window handle size:"+windowHandleList.size());
		driver.switchTo().window(windowHandleList.get(1));
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("mobile.png");
		FileUtils.copyFile(source, dest);
		Thread.sleep(5000);
		//priceblock_dealprice
		String ourPrice = driver.findElement(By.xpath("//span[@id='priceblock_dealprice']")).getText();
		System.out.println("ourPrice"+ourPrice);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		//driver.switchTo().frame(0);
		String cartSubTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("cartSubTotal"+cartSubTotal);
		
		if (ourPrice.contains(cartSubTotal)) {
			System.out.println("Cart sub sub total matches with actual price");
		}
		else {
			System.out.println("Cart sub sub total doesnt match with actual price");
		}
		
	}

}
