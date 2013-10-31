package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Social_TC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize(); 
		driver.get("http://starter-qa-50.fry.com");
		driver.findElement(By.xpath("//img[@alt='(EN) Apparel']")).click();
		driver.findElement(By.xpath("//*[@id='Filmstrip_subCategory_1']/div/div/div[2]/div[2]/div/div[4]/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id='shareButtons-reaction0-text']/div")).click();
		
	
		
		/*
		// Grab the table
		WebElement table = driver.findElement(By.id("gig_1379422306920_gigya.socialize.plugins.share.showShareUI_commentCanvas"));
				
		// Now get all the TR elements from the table
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		// And iterate over them, getting the cells
		for (WebElement row : allRows) {
			System.out.println(allRows.size());
		 List<WebElement> cells = row.findElements(By.tagName("td"));
		 System.out.println(cells.size());
		 for (WebElement cell : cells) {
		 // And so on
			 System.out.println(cell.getText());
			 
		 }
		}
		
		
		*/
		
		
		
		//driver.findElement(By.xpath("//table[@id='gig_1379422306920_gigya.socialize.plugins.share.showShareUI_commentCanvas']")).sendKeys("Test message");
		
		//driver.findElement(By.xpath("//*[@id='gig_1379422306920_gigya.socialize.plugins.share.showShareUI_comment']")).sendKeys("This is a test post");
		
		/*
		List <WebElement> objects = driver.findElements(By.xpath("//*[@id='darkenScreenObject']"));
			System.out.println("Total elements -> "+ objects.size());
		
		for(int i=0;i<objects.size();i++){
			System.out.println(objects.get(i).getText()+" ---- "+ objects.get(i).getAttribute("selected"));
		}
		*/
		
		
	}

}
