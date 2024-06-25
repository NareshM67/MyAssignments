package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbRegistration 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("https://en-gb.facebook.com/");
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		//to pause the excution
		Thread.sleep(3000);
		
		//to click the create ne account button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	
		
		Thread.sleep(3000);
		
		//To Locate the firstname WebElement and enter value
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("naresh");

		//To Locate the lastname WebElement and enter value
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("maroju");
		
		//To Locate the email or mobile number WebElement and enter value
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("naresh.m@gmail.com");
		
		//To Locate the password WebElement and enter value
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("maroju");
		
		//To Locate the date WebElement and enter value
		WebElement dateWE = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select date = new Select(dateWE);
		date.selectByVisibleText("6");
		
		//To Locate the month WebElement and enter value
		WebElement monthWE = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(monthWE);
		month.selectByVisibleText("Jul");
		
		//To Locate the year WebElement and enter value
		WebElement yearWE = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(yearWE);
		year.selectByVisibleText("1994");	
		
		//To click the radio button
		driver.findElement(By.xpath("(//input[@name ='sex'])[2]")).click();
		
		//to close browser window
		driver.close();				
	}	
}
