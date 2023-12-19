package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//98.Handling calendar UI in Travel websites
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		//April 23
		driver.findElement(By.className(".flatpickr-calendar.animate.arrowTop.open")).click();//This is to select the calendar window//THIS IS NOT WORKING
				
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))  
		{    //we are telling Selenium: until you see the "April" I want you keep on navigating
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("flatpickr-day"));
		 
		//What we need to remember is: Grab the common attribute//Put it into list and iterate//
		 int count = driver.findElements(By.className("flatpickr-day")).size();
		
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equals("21"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}
		
		
	}

}
