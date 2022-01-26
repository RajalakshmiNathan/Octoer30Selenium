package week5.day2.assignments;

	import java.io.IOException;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateLead extends BaseHooks{
		
		@BeforeTest(alwaysRun = true)
		public void setValues() {
			excelFileName = "CreateLead";
			
		}
		
		
		@Test(dataProvider="sendData", groups= {"functional","regression"})
		//public static void main(String[] args) {
		public void createLead(String company,String firstName,String lastName,String phNo) throws InterruptedException {
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
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			Thread.sleep(5000);
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
			driver.findElement(By.name("submitButton")).click();
//			driver.close();
	}
//		
//		@DataProvider
//		public String[][] sendData(){
//			
//			String[][] data = new String[2][4];
//			data[0][0] = "TestLeaf";
//			data[0][1]="Hari";
//			data[0][2]="R";
//			data[0][3]="99";
//			
//			data[1][0] = "Qeagle";
//			data[1][1]="Babe";
//			data[1][2]="M";
//			data[1][3]="98";
//			
//			
//			
//			return data;
//			
//			
//			
//			
//			
//		}
//		
//		@DataProvider
//		public String[][] sendData() throws IOException{
//			
//			ReadExcel re= new ReadExcel();
//			String[][] readData = re.readData("CreateLead");
//			
//			
//			
//			return readData;
//			
//			
//			
//			}
		
	}








