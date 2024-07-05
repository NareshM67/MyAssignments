package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAction 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("https://www.amazon.in/");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions action = new Actions(driver);
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(search).sendKeys(search,"oneplus 9 pro");
		
		WebElement clickWE = driver.findElement(By.id("nav-search-submit-button"));
		action.moveToElement(clickWE).click().perform();
		
		
		
		String firstPrice = driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		
		System.out.println("Price of first product : "+firstPrice);
		
		String customerRatingNo = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		
		System.out.println("Number of customer Ratings of first product : "+customerRatingNo);
		
		WebElement productclick=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		action.moveToElement(productclick).click();
		
		
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
	}
}
