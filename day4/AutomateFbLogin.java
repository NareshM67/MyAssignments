package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateFbLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();		
		
		//Load the url Using get()
		driver.get("https://www.facebook.com/");
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		//pause the execution for some time(secs)
		Thread.sleep(2000);
		
		//To Locate the WebElement and use findElement()
		WebElement username = driver.findElement(By.id("email"));

		// To enter the value to the WebElement using sendKeys() method
		username.sendKeys("testleaf.2023@gmail.com");
		
		//password element and enter the value using sendkeys()
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Locate the Login button and click
		driver.findElement(By.name("login")).click();
		
		//Locate "Find your account and log in" and click on the element
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		//To get the title of page-->getTitle()
		String actualTitle = driver.getTitle();	
		
		//To print actualtitle in console
		System.out.println("Actual Title is : "+actualTitle);
				
		String expectedTitle = "Forgotten Password | Can't Log In | Facebook";		
		//To print expectedTitle in console
		System.out.println("Expected Title : "+expectedTitle);
		
		//if condition for verifying actual and expected titles are matched or not
		if(actualTitle.equalsIgnoreCase(expectedTitle))			
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		
		 //To close the browser window
		driver.close();
	}

}
