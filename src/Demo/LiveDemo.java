package Demo;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LiveDemo {		//*******SUPER INTERESTING******

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//117.Perform Web Table Sorting
		//118.Build Custom Selenium method using Stream Mapper
		//119.Automating Pagination Scenarios

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fran\\Desktop\\Selenium Automation Testing Edureka\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
				
		//1.click on the column so it get sorted
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//2.capture all the WebElements (almond, apple, banana, beans, brinjal) into a list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//3.capture text of all WebElements into a new ORIGINAL list (from the existing WebElments list)
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//4.we will apply sort on the ORIGINAL list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		//5.compare ORIGINAL list vs sorted list (if both are equal you can conclude that these are in sorted order)
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price; //we put here the List<String> so it becomes globally
		//(118.Lesson) ***FAMOUS INTERVIEW QUESTION*** We want to get the price of the rice (1 specific element)
		//1.scan the name column with .getText() ->Beans ->print the price of the Beans
		do
			{
			List<WebElement> raws = driver.findElements(By.xpath("//tr/td[1]"));
			price = raws.stream().filter(s->s.getText().contains("Tomato")).
		map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		//***IF AN INTERVIEWER ASK ME: How do you print all the elements presented in the list?
		//we will write this single line: list.forEach() and "a" which represents every item in the list
		price.forEach(a->System.out.println(a));
		
		//Now if the element is not presented in the first page we will need to click in the next button, so we will go to page 2  
		//and so on, until the element we are looking for is found. So we've written do - while loop.
		if(price.size()<1)   //this means there isn't an element in our price list
		{
			driver.findElement(By.xpath("//li/a[@aria-label='Next']")).click();
		}
		
			}
		while(price.size()<1)	;
		
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		
		return pricevalue;
	}

}
