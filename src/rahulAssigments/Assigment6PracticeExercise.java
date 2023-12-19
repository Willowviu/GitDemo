package rahulAssigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

public class Assigment6PracticeExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input")).click();
		String selectOption = (driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]"))).getText();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(selectOption);
		
		driver.findElement(By.name("enter-name")).sendKeys(selectOption);
		driver.findElement(By.id("alertbtn")).click();
				
		String text = driver.switchTo().alert().getText();
		
		if(text.contains(selectOption))
				{
			System.out.println("Success, in the alert message appears the option selected ");
				}
		else 
			System.out.println("Something went wrong, try again, patient my friend");
		
			}

}
