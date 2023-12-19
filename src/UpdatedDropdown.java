import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


//***TestNG is one of the testing framework***
// Assertions is one thing which will help us to validate if the result (whatever Selenium written) is expected or not, if not it will fail the test

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.id("hrefIncAdt")).click();//with just one click it will select 2 adults but If we want to select 5 adults that will work but it is not good to repeat the step 4 times. We will use a while loop.
		//driver.findElement(By.id("hrefIncAdt")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		
	//***WHILE LOOP** you write the loop in pieces
		
	/*int i=1;
	while(i<5)// infinite times 1 will be less than 5 but...
	{
		whatever we write inside this loop will keep on executing it infinite times until the condition become false here
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;//...we increment i, so every loop, once it click on it, the i will be incremented 1 time and the output will be 2,3,4 and then 5, so there will be 4 clicks and the loop will stop!
	}*/
		
	//***FOR LOOP*** you write everything in one single line
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1; i<5; i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();		
	}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		
	}

}
