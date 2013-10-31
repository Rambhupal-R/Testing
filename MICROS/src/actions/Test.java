package actions;

//import java.util.List;
import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://starter-qa-50.fry.com");
		driver.findElement(By.xpath("//*[@id='subscribeForm']/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id='emailSignUp']/div")).getText();
		/*
		File file = new File("D://MICROS_Project//chrom.exe");
	   	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	   	
	   	WebDriver driver = new ChromeDriver();
	   	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://starter-qa-50.fry.com");
	
		/*
		driver.findElement(By.xpath("//*[@class='sign-in-link']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("msaddi2@csc.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("@Lt12345");
		driver.findElement(By.xpath("//input[@class='formButton']")).click();
		*/
		/*
		driver.findElement(By.xpath("//img[@alt='(EN) Apparel']")).click();
		driver.findElement(By.xpath("//*[@id='Filmstrip_subCategory_1']/div/div/div[2]/div[2]/div/div[2]/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id='productZoomViewer0']/div[1]/div/a/img")).click();
		String Path1="//*[@id='productZoomViewer0']/div[2]/div[1]/div/div[4]/span/span/span[";
		String Path2= "]/img[3]";
		
		Actions act = new Actions(driver);
				
		for (int k = 1;k<=4;k++){
			WebElement devices=driver.findElement(By.xpath(Path1+k+Path2));
			act.moveToElement(devices).build().perform();
			act.click().build().perform();
			act.click().build().perform();
			Thread.sleep(5000);
			if(k==(3 & 4)){
				act.moveToElement(devices).build().perform();
																	
			}
		}
		
		*/
		
				
		
		
				
		
		
	
		/*
		WebElement html = driver.findElement(By.tagName("html"));
		html.sendKeys(Keys.chord(Keys.COMMAND, Keys.ADD));
		html.sendKeys(Keys.chord(Keys.COMMAND, Keys.SUBTRACT));
		*/
		//Actions act = new Actions(driver);
		//act.moveToElement(Zoom in)
		
		//driver.findElement(By.xpath("//a[@class='js_headerWishListClass cmsSecure']")).click();
		
		
		
		//driver.findElement(By.xpath("//img[@alt='(EN) Apparel']")).click();
		//driver.findElement(By.xpath("//ul[@class='paratent-category-container']/li/a")).click();
		
		
		
		/*
		
		
		if (driver.findElement(By.xpath("//li[@class='crumb']/a")).getAttribute("href") != null) {
			 System.out.println(driver.findElement(By.xpath("//li[@class='crumb']/a")).getText());
			 System.out.println(driver.findElement(By.xpath("//li[@class='crumb']/a")).getAttribute("href"));
			 System.out.println("This is  clickable");
		 }
		 else
		 {
			 System.out.println("This is Not clickable item"); 
		 }
		
		
		if (driver.findElement(By.xpath("//li[@class='crumb']")).getAttribute("href") != null) {
			 System.out.println(driver.findElement(By.xpath("//li[@class='crumb']")).getText());
			 System.out.println(driver.findElement(By.xpath("//li[@class='crumb']")).getAttribute("href"));
			 System.out.println("This is  clickable");
		 }
		 else
		 {
			 System.out.println("This is Not clickable item"); 
		 }
		
		*/
		 
/*		
		String Link = driver.findElement(By.xpath("//li[@class='crumb']/a")).getAttribute("href");
		
		if(Link.equals(null)){
			System.out.println("This is not clickable");
			
		}
		else {
			System.out.println("This is a clickable item");
		}
		
				*/
		//System.out.println(driver.findElement(By.xpath("//div[@class='search-help-area-col2']/p[2]/a[2]")).getText());
		
		//System.out.println(driver.findElement(By.xpath("//input[@id='fk-top-search-box']")).getAttribute("placeholder"));
		/*
		driver.findElement(By.xpath("//*[@class='sign-in-link']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("shagadi.s123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("madhusudhan");
		driver.findElement(By.xpath("//input[@class='formButton']")).click();
		driver.findElement(By.xpath("//img[@alt='(EN) Apparel']")).click();
		Select droplist1 = new Select(driver.findElement(By.name("refinementValueIds")));   
		droplist1.selectByVisibleText("(EN) BLACK/MOSS");
		
		driver.findElement(By.xpath("//*[@id='Filmstrip_subCategory_1']/div/div/div[1]/div/div/div[1]/div[2]/p/a")).click();
		Select droplist2 = new Select(driver.findElement(By.id("COLOR_NAME138")));   
		droplist2.selectByVisibleText("(EN) Black/Moss");
		driver.findElement(By.xpath("//input[@class='vert-align-middle ffNorm variantParam']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		String winHandleBefore = driver.getWindowHandle();
		System.out.println(winHandleBefore);
		
		
		for(String winHandle : driver.getWindowHandles()){
		
		    driver.switchTo().window(winHandle);
		    System.out.println(winHandle);
		    
		}
		
		driver.findElement(By.xpath("a[@class='linkButton buttonSecondary fr']")).click();
		
		//a[@class='linkButton buttonSecondary fr']
		
		*/
		/*
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());		
		
		for (int i=0;i<=links.size();i++){
			System.out.println(links.get(i).getText());
						
		}
		*/

	
		

	}

}
