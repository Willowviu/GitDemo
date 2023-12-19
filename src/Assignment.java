import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Francisco de Miguel Arroyo";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		// or it works to:
		// driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		// to grab the text that is shown on the window alert pop up:
		System.out.println(driver.switchTo().alert().getText());

		// When we switch the context to alert, then Selenium gets the knowledge to see
		// if there are any alerts presented on your Web page
		driver.switchTo().alert().accept();

		// When the alert is presented as accept or cancel button, and we want to cancel
		// we will write:
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	}

}

		//to Format and align our code in Eclipse: Cntrl + Shift + f
		//Whenever we write a class name, we need to make sure that the first letter is in Capital Letters and the remaining are small ones
		//When defining a variable, variable name should start with a small letter, but the second work (in case there is) should be in Capital
		//TO DEBUG: DEBUGGING: If we want to watch our code execution step by step from the point we like (if something is failing) we want to 
		//stop our script (when is stopped in passed), we want to pass our test until that point, and from there we can monitor (debug) step by 
		//step, if that is the case: Right click + Toggle Breakpoint
		//will press: Debug as... And if we want to watch our code execution step by step, we click the button "step over" it execute the step
		//and our test will get pass until next step, the line will move to the next step


