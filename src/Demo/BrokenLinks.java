package Demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		//110. Automate broken links 
		//111. Open Connection method to identify status codes of the links
		//112. Iterate over all links in the page to validate broken links mechanism
		//113. Importance of Soft Assertions
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		//broken URL
		//How we identify whether that specific url is working or not, so we will get the URLS, we will try to call that URL'S
		//and see what is the status call, if it is more than 400... we would've figure out which one is broken
		//Step 1 is to get all URL'S tied up to the links using Selenium
		//Once we have all URL'S then we will use Java methods to call those URL'S and will get the status call 
		//if status code >400 then that URL is not working -> the link tied to that URL is broken
		//a[href*="soapui"]
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			
			//String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href"); 200 is the response which is good
			//String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");//400 means link is broken
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The link with the text "+link.getText()+" is broken with the code "+respCode);
		}
		
		a.assertAll();
		
	}

}

//This is cool! right? cos without spending much time of clicking any link and checking if the url is loading, we actually got 	
//the url, we used some java method called openconnection, we sent a request call and get the response

