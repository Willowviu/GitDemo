import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		//URL in the browser
		// No puedo seguir porque la url de la leccion es diferente de la url de ahora mismo 
		// a[@value='MMA'] - Xpath for Chennai
		
		// a[@value='BLR'] - Xpath for Bengaluru
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MMA'])[2]")).click();//Rahul is advising us there are some people who don't like to use index, in the future jobs we will land...
		//so another way to handle this will be the following:	
		
		//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR'] ***Note there is one space between the parent and the child relationship***
		//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MMA']
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}

}
