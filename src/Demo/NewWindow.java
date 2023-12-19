package Demo;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//126.Invoking Multiple Windows
		//127.Taking WebElement Partial Screenshot

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//switching window
		driver.switchTo().newWindow(WindowType.WINDOW);//now Selenium will open one blank tab which is ready to receive any URL
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it =handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
		.get(1).getText();
		driver.switchTo().window(parentWindowId);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		//Screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		
		//so to get a physical file from file object there is a class in java called File Utils, so this method will take this
		//file object and convert it into a file in your system with logo.png
		
		FileUtils.copyFile(file, new File("logo.png"));
		
		
		//driver.quit();
		
		//Get Height & Width, for example of our name edit Box of our Angular Practice Web
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		//now will know what is the height and width then you can compare with what you've given by your developer or business team
		//so we can fail the test accordingly
		
		
		
		
		
		
		//when you call it.next() the control will move to the 1st index, which is "0" index, which is the parentWindow,
		//and the 2nd time we call it.next() then the control will move to the 2nd index, which is the childWindow
		
		//with this method .getWindowHandles Selenium will just see how many windows are currently opened by Selenium
		
		//but the driver control is still in the home page only, so we have to deliberate tell driver switch to the window you like
		
		//now with the method .getScreenshotAs we will get the screen shot on a file format, so we need to create one variable
		//for file class so our screen shot will be stored in a file variable
	}

}
