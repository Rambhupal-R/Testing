package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



import Locators.ApplicationLocators;
import Utilities.FrameworkException;
import Utilities.Global;
import Utilities.Utility;





public class GenericFunctions {
	static WebDriver  driver;
	
	public void jsClick(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("document.getElementsByTagName('button')[0].click();");
        js.executeScript(stringBuilder.toString());
    }
	// This method is used to select the element from ListBox based on label
	public void select(String locatorName1, String label1) {
		WebElement webElement = null;
		try {
			webElement = ApplicationLocators.getElementUsingLabel(driver, locatorName1, "select");
			if (webElement != null) {
				Select select = new Select(webElement);
				select.selectByVisibleText(label1);
				Utility.reportingResults("Pass", "Select the value '"+label1+"' from the "+locatorName1+" field","Successfully selected the value '"+label1+"' from "+locatorName1+" field");
				}
			else
			{
				Utility.reportingResults("Fail", "Select the value '"+label1+"' from "+locatorName1+" field","Failed to select the value '"+label1+"' from "+locatorName1+" field");
			}
		} catch (Exception exception) {
			new FrameworkException(exception, "SeleniumDriver:select(label)");
		}
	}
	public void highlightElement(WebElement element) {
	    for (int i = 0; i < 2; i++) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	                element, "color: red; border: 2px solid yellow;");
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	                element, "");
	    }
	}
	 
	public void set(String xpath, String value,String locatorName) {
		WebElement webElement = null;
		try {
			webElement=driver.findElement(By.xpath(xpath));
			//webElement = CreateLeadLocators.getElementUsingLabel(driver, locatorName, "input");
			if (webElement.isDisplayed()) {
				
				webElement.clear();
				webElement.sendKeys(value);
				Utility.reportingResults("Pass", "Set the value '"+value+"' in "+locatorName+" field","Successfully enter the value '"+value+"' in "+locatorName+" field");
				
				}
			else{
				Utility.reportingResults("Fail", "Set the value '"+value+"' in "+locatorName+" field","Failed to enter the value '"+value+"'in "+locatorName+" field");
			}
		} catch (Exception exception) {
			new FrameworkException(exception, "SeleniumDriver:select(label)");
		}
	}
	public void Login(String username,String password)
	{
		
		driver.get(Global.BrowserURL);
		driver.manage().window().maximize();
		/*driver.get(properties.getProperty("browserUrl"));*/
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		if (driver.findElement(By.id("username")).isDisplayed())
		{
			Utility.reportingResults("Pass", "Launch the 'MICROS' Application","Successfully Launched the 'MICROS' application");
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys(username);
			Utility.reportingResults("Pass", "Set the value '"+username+"' in username field","Successfully enter the value '"+username+"' in Username field");
		}
		else{
			Utility.reportingResults("Pass", "Set the value '"+username+"' in username field","Failed enter the value '"+username+"' in Username field");	
		}
		if (driver.findElement(By.id("password")).isDisplayed()){
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		Utility.reportingResults("Pass", "Set the value in password field","Successfully enter the password value");
		}
		else{
			Utility.reportingResults("Pass", "Set the value in password field","Failed enter the password value");	
		}
		if (driver.findElement(By.id("Login")).isDisplayed()){
		driver.findElement(By.id("Login")).click();
		Utility.reportingResults("Pass", "Click on the Login link","Successfully clicked on the Login link");
		}
		else{
			Utility.reportingResults("Pass", "Click on the Login link","Failed to click on the Login link");	
		}
		if (driver.findElement(By.linkText("Leads")).isDisplayed()){
			Utility.reportingResults("Pass", "Verify Login to the Application","Successfully login to the application");
		}else{
			Utility.reportingResults("Fail", "Verify Login to the Application","Failed login to the application");	
		}
		
	}
	public void Logout(){
		driver.findElement(By.id("userNav-arrow")).click();
		if(driver.findElement(By.linkText("Logout")).isDisplayed())
		{
			driver.findElement(By.linkText("Logout")).click();
			Utility.reportingResults("Pass", "Click on the Logout link","Successfully clicked on the Logout link");
			if (driver.findElement(By.id("username")).isDisplayed())
			{
				Utility.reportingResults("Pass", "Verify the Logout functionality","Successfully Logout from the application");
				
			}
			else
			{
				Utility.reportingResults("Fail", "Verify the Logout functionality","Failed to Logout from the application");
				
			}
			
		}
		else{
			Utility.reportingResults("Fail", "Click on the Logout link","Failed to click on the Logout link");
			
		}
		
		
		
		
	}
	public void Launch()
	{
		driver.get(Global.BrowserURL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		if (driver.findElement(By.linkText("Current accounts")).isDisplayed())
		{
			
			Utility.reportingResults("Pass", "MICROS Application Launch","Successfully RBS application launched");
		}
		else{
			Utility.reportingResults("Pass", "MICROS Application Launch","Failed RBS Application Launch");	
		}
	
	}

	public void selectvalue(String locatorName, String value,String label) {
		WebElement webElement = null;
		try {
			

webElement  = driver.findElement(By.xpath(locatorName));

			if (webElement != null) {
				Select select = new Select(webElement);
				select.selectByVisibleText(value);
				Utility.reportingResults("Pass", "Select the value '"+label+"' from the "+value+" field","Successfully selected the value '"+value+"' from "+label+" field");
				}
			else
			{
				Utility.reportingResults("Fail", "Select the value '"+label+"' from "+value+" field","Failed to select the value '"+value+"' from "+label+" field");
			}
		} catch (Exception exception) {
			new FrameworkException(exception, "SeleniumDriver:select(label)");
		}
	
}
	public String excelIntValueConvertion(String excelValue){
		String value = null;
		
		try{
			 if (excelValue.trim().endsWith(".0"))	{	
				 System.out.println(" **************  in if block  *************** ");
				// System.out.println( " index value ::::::::: "+excelValue.trim().substring(0, excelValue.trim().indexOf(".0")));
				 value = excelValue.trim().substring(0, excelValue.trim().indexOf(".0"));
				 System.out.println(" value ::::::::::::  "+value);
			/* int convertedIntValue = (int)Math.round(Double.parseDouble(excelValue.trim()));
			 System.out.println(" convertedIntValue ------------- "+convertedIntValue);
			 value = Integer.toString(convertedIntValue);
			 System.out.println(" value ::::::::::::  "+value);*/
			 }
			 else{
				 System.out.println(" **************  in else block  *************** ");
				 value = excelValue;
			 }
			}
			catch(Exception exp){
				exp.printStackTrace();
				
			}
		
		return value;
	}
}
	

