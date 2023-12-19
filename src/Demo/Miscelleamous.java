package Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;//we need to bring this jar (commons-io-2.6) from internet and place it in our build path 

public class Miscelleamous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//108. Maximizing window and deleting cookies
		//109. How to take Screenshots in Selenium
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();// this is to delete all cookies, so it might not be necessary for the next i.question
		
		/* ***INTERVIEW QUESTION***
		They want to check the scenario where they want to delete the session cookie and make sure that secure login gets log out
		and he has to navigate to the home page, so how you automate that?
		*/
		//so in that case we will delete that cookie
		driver.manage().deleteCookieNamed("sessionkey");
		
		//click on any link, and we will be redirected to the login page
			//login page- verify login url
				
		driver.get("https://google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C://Users//Fran//screenshot.png"));
		
		
		
		
	}

}
