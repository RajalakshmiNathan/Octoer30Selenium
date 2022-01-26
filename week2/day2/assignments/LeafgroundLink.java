package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//go to home page
		driver.findElement(By.linkText("Go to Home Page")).click();
		String brTitle= driver.getTitle();
		if(brTitle.contains("Selenium Playground")) {
			System.out.println("Navigating to right page.Home");
		}
		else {
			System.out.println("Navigation unsucessful");
		}
		
		driver.navigate().back();
		
		//click link
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		String title = driver.getTitle();
		System.out.println(title+"page is displayed");
		driver.navigate().back();
		
		//verify brokenlink
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String brokenTitle = driver.getTitle();
		
		if (brokenTitle.contains("HTTP Status 404 ")) {
			System.out.println("Link is broken");
		}
		else {
			System.out.println("Link is not broken");
		}
		driver.navigate().back();
		//Navigate to hyperlink page
		driver.findElement(By.xpath("//label[text()='(Interact with same link name)']/preceding-sibling::a")).click();
		driver.findElement(By.xpath("//h5[text()='HyperLink']/parent::a")).click();
		String hyTitle = driver.getTitle();
		if (hyTitle.contains("Interact with Hyperlink")) {
			System.out.println("Navigation to hyperlink page successful");
		}
		else {
			System.out.println("Navigation to hyperlink page unsuccessful");
		}
		
		//how many links are ther in this page
		List<WebElement> wbLinks = driver.findElements(By.tagName("a"));
		int numLinks = wbLinks.size();
		System.out.println("Number of links in the hyperlink page:"+numLinks);
		
	}

}
