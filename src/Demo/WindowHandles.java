package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Thread.sleep(3000);
		/*your driver object will not have the knowledge about the new tab/window which it's just opened,we have to give that knowledge		
		explicitly to Selenium, and then Selenium can shift its focus from the parent to child browser.
		For that Selenium have to know how many windows are opened.*/
		Set<String> windows = driver.getWindowHandles(); //[parentID, childID,] 
		/*This method will get you the all the windows handle ID's which have been opened by your automation*/
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailID);
	}

}
