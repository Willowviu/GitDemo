package rahulAssigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assigment7webTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.id("product"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());
		//when we say table.findElements it will inspect all the elements with the tagName "tr" (which are the rows) in that web table only
		//if we'd put driver.findElements it will check in the complete page
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		List<WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secondRow.get(0).getText());
		
		System.out.println(secondRow.get(1).getText());
		
		System.out.println(secondRow.get(2).getText());
		
				
	}

}
