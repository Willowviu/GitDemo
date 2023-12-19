import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
		//this helps when you want to internal navigate when you already presented in the automation mode, it won't wait for the main page (google.com) to load
		driver.navigate().back();
		driver.navigate().forward();
	}

}
