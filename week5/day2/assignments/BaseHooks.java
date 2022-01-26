package week5.day2.assignments;


	import java.io.IOException;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseHooks {
		
		public ChromeDriver driver;
		
		public String excelFileName;
		
		@DataProvider(indices =0)
		public String[][] sendData() throws IOException{
			
			ReadExcel re= new ReadExcel();
			String[][] readData = re.readData(excelFileName);
			
			
			
			return readData;
			
			
			
			}
		
		
		
		@Parameters({"url","username","password"})
		@BeforeMethod(alwaysRun = true)
		
		
		public void setup(String url,String username,String password) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("http://leaftaps.com/opentaps/");
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
//			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		
		@AfterMethod(alwaysRun = true)
		public void teardown() {
			driver.close();
		}

	}



