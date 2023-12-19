import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String downloadPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing\\Selenium\\GRID\\chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://pdftojpg.org/");		
		driver.findElement(By.cssSelector("[class*='btn file-start']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Fran\\OneDrive\\Documents\\check\\fileupload.exe");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='btn btn--convert']")));
		
		driver.findElement(By.cssSelector("[class*='btn btn--convert']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(5000);
		File f = new File(downloadPath+"/converted.zip");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());
			if(f.delete())
			{
				System.out.println("file deleted");
			}
		}
		//C:\Users\Fran\eclipse-workspace\Introduction\converted.zip
		
		
		//code to download the file - selenium script
		//verify if the file is successfully downloaded (Java file package)
		//delete the file form your system
		
		
		
		
		
		
		
		
		
		
		
	}

}
