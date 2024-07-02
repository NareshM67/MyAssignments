package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass
{
	public static void main(String[] args) throws InterruptedException
	{			
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//div[@id='iframecontainer']")).click();
		driver.switchTo().frame("iframeResult");
		
				
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.accept();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());

		driver.close();
		
	}
}
