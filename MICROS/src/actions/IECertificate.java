package actions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IECertificate {

	public static void main(String[] args) {
		
		File file = new File("D://MICROS_Project//IEDriverServer.exe");
	   	System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	   	WebDriver driver = new InternetExplorerDriver();
	   	driver.get("https://starter-qa-50.fry.com");
	   	driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		
	}

}
