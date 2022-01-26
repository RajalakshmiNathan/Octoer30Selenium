package week4.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionJquerySortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement Item2 = driver.findElement(By.xpath("//li[text()='Item 2']/span"));
		WebElement Item4 = driver.findElement(By.xpath("//li[text()='Item 4']/span"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(Item2, Item4).perform();
		
		
//		WebDriverManager.chromedriver().setup();
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://jqueryui.com/sortable/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//        // drag object is inside the iframe tag so switch to frame
//        driver.switchTo().frame(0);
//        WebElement Item2 = driver.findElement(By.xpath("//li[text()='Item 2']/span"));
//        WebElement Item4 = driver.findElement(By.xpath("//li[text()='Item 4']/span"));
//        int x = Item4.getLocation().getX();
//        int y = Item4.getLocation().getY();
//        Actions builder = new Actions(driver);
//        builder.dragAndDropBy(Item2, x, y).perform()
		
	}

}
