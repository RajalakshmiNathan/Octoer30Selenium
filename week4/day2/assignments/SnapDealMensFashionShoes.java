package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealMensFashionShoes {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement wb = driver.findElement(By.xpath("//li[text()='More Categories']//following::span[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(wb).perform();
		
		WebElement wbSportsShoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		wbSportsShoes.click();
		
		String ShoeCount = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText();
		System.out.println("ShoeCount"+ShoeCount);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		//Price Low To High
//		List<WebElement> sortList = driver.findElements(By.xpath("//ul[@class='sort-value']"));
//		int sortListSize = sortList.size();
//		for(int i = 0 ;i<sortListSize;i++) {
//			String text = sortList.get(i).getText();
//			System.out.println("text:"+text);
//			if(text.contains("Price Low To High")) {
//				sortList.get(i).click();
//				break;
//			}
//		}
		//(//li[@class='search-li']/span)[2]
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		Thread.sleep(5000);
		List<Integer> actualProductList = new ArrayList<Integer>();
		List<WebElement> productPriceList = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		int productPriceListSize = productPriceList.size();
		for(int i=0;i<productPriceListSize;i++) {
			String temp = productPriceList.get(i).getAttribute("data-price");
			System.out.println("temp"+temp);
			int tempInteger = Integer.parseInt(temp);
			actualProductList.add(tempInteger);
		}
		
		List<Integer> productListSorted = new ArrayList<Integer>(actualProductList);
		Collections.sort(productListSorted);
		boolean blSorted = actualProductList.equals(productListSorted);
		if(!blSorted) {
			System.out.println("price list is not sorted");
		}
		else {
			System.out.println("price list is sorted");
		}
		
		//select price range 900-1200
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		//verify navy filter
//	boolean	blNavy = driver.findElement(By.xpath("//a[@data-value='Navy']")).isDisplayed();
//		if(blNavy) {
//			System.out.println("navy filter displayed ");
//		}
//		else {
//			System.out.println("navy filter not displayed ");
//		}
		//verify price filter
		String price = driver.findElement(By.xpath("//a[@data-key='Price|Price']")).getText();
		if(price.contains("Rs. 900 - Rs. 1200")) {
			System.out.println("Price filter Rs. 900 - Rs. 1200 applied ");
		}
		else {
			System.out.println("price filter Rs. 900 - Rs. 1200 not displayed ");
		}
		//mouse hover on first displayed training shoes
		
		WebElement firstShoe = driver.findElement(By.xpath("//picture[@class='picture-elem']"));
		builder.moveToElement(firstShoe).perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[contains(@class,'quick-view-bar')]")).click();
		//switch to frame
		
//		Set<String> windowHandles = driver.getWindowHandles();
//		List<String> allWindowHandles = new ArrayList<String>(windowHandles);
//		System.out.println("no of window handle:"+allWindowHandles.size());
//		driver.switchTo().window(allWindowHandles.get(1));
		
		//driver.switchTo().frame(1);
		
		String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Cost of training shoes:"+cost);
		
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount:"+discount);
		//take snapshot of shoes
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("Shoes.png");
		FileUtils.copyFile(source, dest);
		
		//driver.switchTo().defaultContent();
		driver.close();
		driver.quit();
		
		
		
	}

}
