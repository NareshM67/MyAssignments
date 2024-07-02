package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass
{
	public static void main(String[] args) throws InterruptedException
	{			
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("https://www.leafground.com/alert.xhtml");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("naresh");		
		alert.dismiss();
		
		String expected = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(expected);
		String actual ="User cancelled the prompt.";
		if(expected.equals(actual))
		{
			System.out.println("Test pass");
		}
		else 
		{
				System.out.println("Test fail");
		}
	}
		
}