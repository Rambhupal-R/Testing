package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://starter-qa-50.fry.com");
		driver.findElement(By.xpath("//*[@id='header-nav']/a[6]/img")).click();
		Thread.sleep(30000);
		
		
		/*
		WebElement list= driver.findElement(By.xpath("//*[@id='sortItemOptions']"));
				
		List<WebElement> options = list.findElements(By.tagName("option"));
								
		System.out.println("Total elements -> "+ options.size());
		
		for(int i=0;i<options.size();i++){
						
				System.out.println(options.get(i).getText()+" ---- "+ options.get(i).getAttribute("selected"));
				
			} */
		}

	
	
}
