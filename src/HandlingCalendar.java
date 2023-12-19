import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				Thread.sleep(5000);
				
				// to select Round Trip button radio
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				
				// a[@value='MMA'] - Xpath for Chennai
				
				// a[@value='BLR'] - Xpath for Bengaluru
				
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				driver.findElement(By.xpath("//a[@value='BLR']")).click();
				
				//driver.findElement(By.xpath("(//a[@value='MMA'])[2]")).click();//Rahul is advising us there are some people who don't like to use index, in the future jobs we will land...
				//so another way to handle this will be the following:	
				
				//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR'] ***Note there is one space between the parent and the child relationship***
				//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MMA']
				
				driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
				Thread.sleep(5000);
				
				//This is to select the current date on the calendar
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
				//********It is giving me an error:  Unable to locate element: .ui-state-default.ui-state-highlight.ui-state-active******
			}
		
		
		
		
	}
	