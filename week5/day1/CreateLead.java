package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseHooks{
	@Test(dataProvider="sendData")
	//public static void main(String[] args) {
	public void createLead(String company,String firstName,String lastName,String phNo) {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_phoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
//		driver.close();
}
	
	@DataProvider
	public String[][] sendData(){
		
		String[][] data = new String[2][4];
		data[0][0] = "TestLeaf";
		data[0][1]="Hari";
		data[0][2]="R";
		data[0][3]="99";
		
		data[1][0] = "Qeagle";
		data[1][1]="Babe";
		data[1][2]="M";
		data[1][3]="98";
		
		
		
		return data;
		
		
		
		
		
	}
	
}






