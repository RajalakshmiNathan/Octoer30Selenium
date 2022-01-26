package week5.day2.assignments;


	import java.io.IOException;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DeleteLead extends BaseHooks {
		
		@BeforeTest(alwaysRun = true)
		public void setValues() {
			excelFileName ="DeleteLead";
		}
		
		
		
		    @Test(dataProvider="sendData", groups = "functional")
		    
		//public static void main(String[] args) throws InterruptedException {
		public void deleteLead(String phoneNumber) throws InterruptedException {
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
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Delete")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			String text = driver.findElement(By.className("x-paging-info")).getText();
			if (text.equals("No records to display")) {
				System.out.println("Text matched");
			} else {
				System.out.println("Text not matched");
			}
//			driver.close();
	}

//	@DataProvider
//	public String[][] sendData(){
//		
//		String[][] data = new String[2][1];
//		data[0][0] = "99";
//
//		
//		data[1][0] = "99";
//
//		
//		
//		
//		return data;
//	}
	
//		    @DataProvider
//			public String[][] sendData() throws IOException{
//				
//				ReadExcel re= new ReadExcel();
//				String[][] readData = re.readData("DeleteLead");
//				
//				
//				
//				return readData;
//				
//				
//				
//				}






}
