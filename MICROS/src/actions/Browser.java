package actions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
public class Browser {
	WebDriver driver;
	
	@BeforeClass	
	@Parameters("browser")	
	public void openBrowser(String browser){
		if(browser.equalsIgnoreCase("FF")) {
			System.out.println("Firefox driver would be used");
			driver = new FirefoxDriver();
			}
		else
		{
			System.out.println("Chrome driver would be used");
			File file = new File("D://MICROS_Project//chrom.exe");
		   	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		   	driver=new ChromeDriver();
		   	driver.get("https://starter-qa-50.fry.com");
		  /*
		  DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
	        caps.setCapability("ignoreZoomSetting", false);
			driver = new InternetExplorerDriver();
			*/			
		}
	}

	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser(String browser){
		try {
			driver.wait(15000);
		}
		catch(Exception e){}
		driver.close();
		driver.quit();
		
	}
	
	
}
