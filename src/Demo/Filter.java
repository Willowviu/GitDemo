package Demo;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		//when we type Rice, we will get just 1 result, we have to make sure now for every result we .getText() 
		
		List<WebElement> filteredList = veggies.stream().filter(veggie->veggie.getText().contains("Rice"))
		.collect(Collectors.toList());
		
		//so .stream() now have all the results, so for each result we have one condition to check
		//so if we have 2 results, so the .stream() for the 1st iteration take the 1st result and that 1st result will get 
		//stored in this veggie. So the Rice will get stored in the veggie and it will check the WebElement and will .getText()
		//so text of Rice will be retrieved, only 1 result.
		//So as my veggies list = 1 result, and my filteredList = 1 result, both matches, so your test case is passed
		//So this is how you can put the condition
		Assert.assertEquals(veggies.size(), filteredList.size());
		
	}

}
