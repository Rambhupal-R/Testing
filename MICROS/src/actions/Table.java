package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Table {


	public static void main(String[] args) throws InterruptedException {


WebDriver driver=new FirefoxDriver();
 driver.manage().window().maximize();
driver.get("http://starter-qa-50.fry.com/product/-en-performance-polo/373.uts");
Select droplist1 = new Select(driver.findElement(By.id("SIZE_NAME373")));   
droplist1.selectByVisibleText("(EN) Regular M ($39.5)");

Select droplist2 = new Select(driver.findElement(By.id("COLOR_NAME373")));   
droplist2.selectByVisibleText("(EN) Palm ($39.5)");

driver.findElement(By.xpath("//input[@class='js_pickup']")).click();
driver.findElement(By.linkText("Select a store")).click();
Thread.sleep(20000);     
driver.findElement(By.xpath("//*[@id='searchZipCode']")).sendKeys("48103");
Thread.sleep(10000); 
driver.findElement(By.xpath("//*[@id='storeSearchButton']")).click();
Thread.sleep(20000); 
List<WebElement> rowCollection=driver.findElements(By.xpath("//table[@id='storeLayerResultsTable']/tbody/tr"));
 

System.out.println("Numer of rows in this table: "+rowCollection.size());
//Here i_RowNum and i_ColNum, i am using to indicate Row and Column numbers. It may or may not be required in real-time Test Cases.       
int i_RowNum=1;
for(WebElement rowElement:rowCollection)
{
      List<WebElement> colCollection=rowElement.findElements(By.xpath("td"));
      int i_ColNum=1;
      for(WebElement colElement:colCollection)
      {
           
    	  System.out.println("Row "+i_RowNum+" Column "+i_ColNum+" Data "+colElement.getText());
           i_ColNum=i_ColNum+1;
       }
    i_RowNum=i_RowNum+1;
 }
 //driver.close();
		 
	}

}
