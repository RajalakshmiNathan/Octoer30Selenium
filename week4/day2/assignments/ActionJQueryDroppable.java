package week4.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionJQueryDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement Drag = driver.findElement(By.id("draggable"));
		WebElement Drop = driver.findElement(By.id("droppable"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(Drag, Drop).perform();
		
	}

}
