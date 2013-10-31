package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Footer {

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
		driver.findElement(By.xpath("//*[@id='subscribeForm']/div[3]/div")).click();
		Thread.sleep(10000);
		System.out.println("Error Message:" + driver.findElement(By.xpath("//*[@id='subscribeForm']/div[2]")).getText());
		System.out.println("Email Address Text:"+driver.findElement(By.xpath("//*[@id='subscribeForm']/input[3]")).getAttribute("value"));

	}

}
