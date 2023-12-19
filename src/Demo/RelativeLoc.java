package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;//We need to make sure to import this package

public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//123.Introduction to relative locators
		//124. Relative locators

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement dateOfBirth= driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		
		//WebElement iceCreamLabel= driver.findElement(By.cssSelector("label[class='form-check-label'] [text='Check me out if you Love IceCreams!']"));
		//driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();// ERROR: Unable to locate element: label[class='form-check-label'] [text='Check me out if you Love IceCreams!']
		
		WebElement rdbutton = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdbutton)).getText());
		
	}

}
