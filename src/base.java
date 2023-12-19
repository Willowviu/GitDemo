import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		
		
		String[] itemsNeeded={"Cucumber","Brocolli","Beetroot","Carrot","Onion","Banana"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		//This addItems method is taking care of everything, this is called a Utility
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Thread.sleep(5000);
		//Explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
			}
	
	
	
	
	
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j=0;	
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0;i<products.size();i++)
			
		{
		// format (Brocolli - 1 kg) to get actual vegetable name: Brocolli
		// .split(based on "-") will separate Brocolli,	1kg	
						
		String[] name=products.get(i).getText().split("-");
		String formattedName=name[0].trim();
		// convert array into array list for easy search
		// check whether name you extracted is present in the arrayList or not
		
		List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		
		if(itemsNeededList.contains(formattedName))
		{
		j++;	
		// click on Add to cart
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		
		if(j==itemsNeeded.length) //***we use length() method to get the Size of the Array and we use size() method to get the size of the ArrayList*** 
		{
			break;
		}
		}
		}
		
		// now this code is working, but it will iterate through all the veggies on the Web, so if we put 3 veggies on our array of String
		// String[] itemsNeeded={"Cucumber","Brocolli","Beetroot"} we'll just need to iterate 3 times
		// so if we put this int j=0; when iterates for the first time, and finds "Cucumber", then j becomes 1 (with j++) and then again
		// the loop will check for the next items, Brocolli, so j becomes 2, and next time the j value will be incremented 1 more time
		// as much as veggies we have on our String[] itemsNeeded
		
				
		
	}
	}

	
	
	

