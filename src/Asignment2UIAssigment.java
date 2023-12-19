import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Asignment2UIAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Francisco de Miguel Arroyo");
		driver.findElement(By.name("email")).sendKeys("ptdemiguel@hotmail.es"); 
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("hello123");	
		driver.findElement(By.id("exampleCheck1")).click();
		//dropdown with select tag - static
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1")); 
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("01/04/1982");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		
	}
 
}
