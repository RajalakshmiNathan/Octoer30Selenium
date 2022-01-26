package week5.day2.assignments;

	import java.io.IOException;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DuplicateLead extends BaseHooks {
		
		@BeforeTest(alwaysRun = true)
		public void setValues() {
			excelFileName ="DuplicateLead";
		}
		
	@Test(dataProvider = "sendData", groups="functional")
		//public static void main(String[] args) throws InterruptedException {
		public void duplicateLead(String phno) throws InterruptedException {
//			WebDriverManager.chromedriver().setup();
//			ChromeDriver driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("http://leaftaps.com/opentaps/");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//			driver.findElement(By.id("password")).sendKeys("crmsfa");
//			driver.findElement(By.className("decorativeSubmit")).click();
//			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.name("submitButton")).click();
//			driver.close();
	}
	
//@DataProvider
//public String[][] sendData(){
//	String[][] data = new String[2][1];
//	data[0][0] = "99";
//	//data[0][1] = "TCS";
//	
//	data[1][0] = "99";
//	//data[1][1] = "CTS";
//	
//	
//	
//	return data;
//	
//	
//	
//	}
//

//	@DataProvider
//	public String[][] sendData() throws IOException{
//		
//		ReadExcel re= new ReadExcel();
//		String[][] readData = re.readData("DuplicateLead");
//		
//		
//		
//		return readData;
//		
//		
//		
//		}

	





}
