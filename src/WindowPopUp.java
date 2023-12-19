import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing\\Selenium\\GRID\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/");		
		driver.findElement(By.linkText("Basic Auth")).click();
	}

}
