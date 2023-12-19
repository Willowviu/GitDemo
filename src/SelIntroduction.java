import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//*************EMAIL DE RAHUL: mentor@rahulshettyacademy.com**************

public class SelIntroduction {

	public static void main(String[] args) {

		//Invoking Browser
		//Chrome - ChromeDriver ->Methods close get
		//Firefox - FirefoxDriver ->Methods close get
		//Safari - SafariDriver ->Methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		
		//chromedriver.exe ->Chrome Browser
		//step to invoke chrome driver
		//Selenium Manager
		
		
		//Chrome
		//Thanks to SeleniumManager we can skip the step above (avoid writing the line), so now it is optional
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing\\Selenium\\GRID\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
	    //Firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing\\Selenium\\GRID\\\\geckodriver.exe");
		//WebDriver driver1 = new FirefoxDriver();
		
		//Microsoft Edge 
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing \\GRID\\msedgedriver.exe");
		//WebDriver driver2 = new EdgeDriver();
		
				
		
		driver.get("http://www.worldsurfleague.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

}
