package actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frame {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://starter-qa-50.fry.com");
		driver.findElement(By.xpath("//img[@alt='(EN) Apparel']")).click();
		Actions act = new Actions(driver);
		WebElement devices=driver.findElement(By.xpath("//*[@id='Filmstrip_subCategory_1']/div/div/div[2]/div[2]/div/div[1]/div[1]/a/img"));
										
		act.moveToElement(devices).build().perform();
		
		WebElement devices1 = driver.findElement(By.xpath("//*[@id='Filmstrip_subCategory_1']/div/div/div[2]/div[2]/div/div[1]/div[1]/div"));
															
		act.moveToElement(devices1).build().perform();
		act.click().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='cboxLoadedContent']/div/form/div[2]/div[1]/a")).click();
		
		
		//*[@id='Filmstrip_subCategory_1']/div/div/div[2]/div[2]/div/div[1]/div[1]/div
		
		/*
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.get("http://starter-qa-50.fry.com/product/-en-short-sleeve-dyed-t-shirt/378.uts#");
			
		Select droplist1 = new Select(driver.findElement(By.id("SIZE_NAME378")));   
		droplist1.selectByVisibleText("(EN) S");
		
		Select droplist2 = new Select(driver.findElement(By.id("COLOR_NAME378")));   
		droplist2.selectByVisibleText("(EN) Yellow");
		
		driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@class='formButton addToCart  js_variantSubmit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='widget-but-ucart']")).click();
		driver.findElement(By.xpath("//span[@id='paypalExpressCheckoutButton']")).click();
		driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("ocp_1297964872_per@gmail.com");
		driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("297964772");
		driver.findElement(By.xpath("//input[@id='submitLogin']")).click();
		
		/*
		System.out.println(driver.findElement(By.xpath("//*[@id='miniCart']/h3")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='multiitem1']/ul[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='hdrContainer']/h2")).getText());
		System.out.println(driver.findElement(By.xpath("//id('reviewModule')/div[2]/div[2]/div[1]/h4")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='reviewModule']/div[2]/div[2]/div[1]/div")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='contactInfo']/h4")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='contactInfo']/div")).getText());
		*/
		
	//	List<WebElement> cframes = driver.findElements(By.tagName("iframe"));
	//	System.out.println("Total Frames:" + cframes.size());
	//	driver.switchTo().frame(1);

		
		/*
		for(int i=0;i<cframes.size();i++){
			driver.switchTo().frame("yui-history-iframe");
			List<WebElement> text = driver.findElements(By.xpath("//*[@id='miniCart']"));
			System.out.println(text.get(i).getText());
			
						
			
		}
		*/
		
		
	}

}
