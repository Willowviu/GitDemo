package Demo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HandlingHTTPSCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//105. Handling HTTPS Certifications
		//106. Explore Chrome options to set proxies, plugins & paths
		
		/*//How to set download folder location (this is only for Firefox)*/
		FirefoxProfile profile = new FirefoxProfile();
	    profile.setPreference("browser.download.folderList", 2);
	    profile.setPreference("browser.download.dir",System.getProperty("user.dir") + File.separator + "downloads");
	    profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv,application/zip");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		Proxy proxy = new Proxy(); 
		proxy.setHttpProxy("ipaddress:4444");//we will need to ask the proxy string
		options.setCapability("proxy", proxy);
		
		/*//How to set download folder location (this is only for Chrome)
		Map<String, Object> prefs = new	HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs); */
		
		 		
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
		
				//we have created a HashMap class, and in that HashMap we are setting this key,  what will be our default download directory
		//***INTERVIEW QUESTION***
		//Is there any way that you can trick your existing automation behavior by setting up proxy..., and we will say yes
		//there is a way, there is a class called FirefoxOptions which can modify the behavior 
		
			
		/*to Block pop-up windows we will write this code:
		 FirefoxOptions options = new FirefoxOptions();
		 options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		*/

	}

}
