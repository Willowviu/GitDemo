package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1.Give me the count of the links on the page (keep in mind any link on HTML web pages will have a tag called "a")
		//a
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		//2.***INTERVIEW QUESTION*** Give me the count of links of the entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		////3.***INTERVIEW QUESTION*** Give me the count of links presented in the footer section - Limiting webdriver scope
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));//Remember for WebElement we use findElement,not findElements
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//In the footer section are 4 columns, give me the links of the first column
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4. Click on each link of the first column in the footer section and check if the pages are opening 
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{//This for loop open all the tabs
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		//5. Now give me the name of each window title
			
		}
			Set<String> abc = driver.getWindowHandles();//abc = our count will be 4
			Iterator<String> it = abc.iterator();
		
			while(it.hasNext())   //with it.hasNext() we are asking if there is any window present or not, and if it it present, go move to that window
			{						//or...returns true ir the iteration has more elements
				driver.switchTo().window(it.next());//so iterator control will move to its base, that means 0 index: https://qaclickacademy.com/practice.php"
													//(practice page). And if we want to move to the page with 1 index, we have to repeat it.next() again
													//so we write the while loop so we don't put 4 times it.next().
													//so once it moves to that specific index, we will get that window ID
				System.out.println(driver.getTitle());//now we are printing to the console the title of that specific page
			}
		
		//***INTERVIEW QUESTION*** What is the special you have done in your automation compare to others? or how did you bring any optimization? we could say  
	}	//with a script like this, everything is opening in separate tabs on a single shot, and it will decrease time execution from 15 mins to 1 min,
		//so we can say we brought a unique thing in the project.	
	
	
}
