package actions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;



import java.util.Calendar;
import java.util.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


//import org.openqa.selenium.By;
//import org.openqa.selenium.SeleneseCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver; */





import Utilities.Global;

import functions.ExcelFunctions;

public class ExcelStarterTest {	
	//private String tcPriority;
	//private String Subscription;
	WebDriver  driver;
	Properties properties = new Properties();
	Calendar dateObj = Calendar.getInstance();
	String dateObject = Long.toString(dateObj.getTimeInMillis()).substring(8);
    static String HandleBefore = "";

  
  @BeforeClass  
  //@Parameters("browser") 
  public void setUp() throws Exception {
 	    
	  Global.sScriptName="StarterTC";
		properties.load(new FileInputStream(System.getProperty("user.dir")+"\\Environment\\MICROS.properties"));

		File file = new File("D://MICROS_Project//chrom.exe");
	   	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	   	

	   //	driver=new ChromeDriver();
	 driver = new FirefoxDriver();
	   	driver.get("http://starter-qa-50.fry.com");
	   	
	   	//driver.findElement(By.xpath("//*[@class='sign-in-link']")).click();
	  
	 /* DesiredCapabilities capability=null;
	
		if(browser.equalsIgnoreCase("firefox")){
			System.out.println("firefox");
			capability = DesiredCapabilities.firefox();
			capability.setBrowserName("firefox");
			capability.setPlatform(org.openqa.selenium.Platform.ANY);
		}
		
		else if(browser.equalsIgnoreCase("iexplore")){
			System.out.println("iexplore");
			capability = DesiredCapabilities.internetExplorer();
			capability.setBrowserName("iexplore");
			
			capability.setPlatform(org.openqa.selenium.Platform.ANY);
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.out.println("chrome");
			capability = DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");			
			capability.setPlatform(org.openqa.selenium.Platform.ANY);			
		} 
		
		driver = new RemoteWebDriver (new URL("http://localhost:5555/wd/hub"), capability);
		
		//CommandExecutor executor = new SeleneseCommandExecutor(new URL("http://172.16.1.83:5555/wd/hub"), new URL("http://localhost:5557/wd/hub"), capability);
		//driver = new RemoteWebDriver (executor, capability);
		driver.get("http://starter-qa-50.fry.com"); */
  }
 
 
  @DataProvider(name = "DP")
  public Object[][] createData() throws Exception {
		Object[][] retObjArr = null;
		
			retObjArr = getTableArray(
					"D://MICROS_Project//Data Sheet.xls",
					"UIS5_TC25", "Startoffile", "endoffile");				
		
		return (retObjArr);
	}
  
  @Test(dataProvider = "DP")
	public void CreateOrderAutoTest(String priorty, String tcName,
			String subscription, String action, String identifier, String value,
			String expectedResult, String name) throws Exception {

		//if (priorty.equals(tcPriority) && subscription.equals(Subscription)) {
			ExcelFunctions.executeAction(driver, dateObject, priorty, tcName,
					subscription, action, identifier, value, expectedResult, name);
		//}
			//driver.close();
	}

  
  public String[][] getTableArray(String xlFilePath, String sheetName,
			String StartTable, String EndTable) throws Exception {
		String[][] tabArray = null;

		try {
			Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
			Sheet sheet = workbook.getSheet(sheetName);
			int startRow, startCol, endRow, endCol, ci, cj;
			Cell tableStart = sheet.findCell(StartTable);
			startRow = tableStart.getRow();
			startCol = tableStart.getColumn();

			Cell tableEnd = sheet.findCell(EndTable, startCol + 1,
					startRow + 1, 20, 64, false);

			endRow = tableEnd.getRow();
			endCol = tableEnd.getColumn();
			System.out.println("startRow=" + startRow + ", endRow=" + endRow
					+ ", " + "startCol=" + startCol + ", endCol=" + endCol);
			tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
			ci = 0;

			for (int i = startRow + 1; i < endRow; i++, ci++) {
				cj = 0;
				for (int j = startCol + 1; j < endCol; j++, cj++) {

					tabArray[ci][cj] = sheet.getCell(j, i).getContents();
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return (tabArray);
	}
  
  @AfterClass
	public void tearDown() {
		System.out.println("Execution Completed........");		
		//driver.quit();
	}
}
