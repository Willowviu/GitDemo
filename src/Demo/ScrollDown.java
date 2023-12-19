package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class ScrollDown {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//102. How to perform scrolling using JavaScriptExecutor & 
		//103. how to handle table grids in web page &
		//104. Parsing String with Generated Sum values
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;//***INTERVIEW QUESTION*** How do you scroll on a page?
		
		js.executeScript("window.scrollBy(0,500)");
		//that's it, now when you run your test the main window will scroll down
		Thread.sleep(3000);
		//***INTERVIEW QUESTION*** How do you scroll on a component inside our page?
		//we write in console: document.querySelector(".tableFixHead").scrollTop=5000
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement>values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		//We've just got all the values of that WebElement
		//now to sum the values of the table:
		int sum = 0;
		
		for(int i=0;i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());//0+28=28;28+23=51
		}	//like this we convert that string values to an integer format, cos getText() returns text
		
		System.out.println(sum);
		driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		//driver.findElement(By.cssSelector(".totalAmount")).getText();
		//driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();this would give me 296
		//now to convert it to integer:
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
		
	}	

}
