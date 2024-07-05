package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc 
{
	public static void main(String[] args) throws InterruptedException
	{			
		
		ChromeOptions options = new ChromeOptions();
		//Step2: add arguments in addArguments() to disable the notification
		options.addArguments("--disable-notifications");
		
		//Launch the browser
		
		ChromeDriver driver = new ChromeDriver(options);
		
		//Load the url Using get()
		driver.get("https://www.irctc.co.in/");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//li[@id='flight']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		//Step 2: Convert the Set into List 
		List<String> windows = new ArrayList<String>(windowHandles);
		// Get the window address by using get method
		//Step3:
		driver.switchTo().window(windows.get(1));
		System.out.println("Child window title is "+driver.getTitle());
		driver.switchTo().window(windows.get(0));
		driver.close();
	}
	
}
