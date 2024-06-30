package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas 
{
	public static void main(String[] args) throws InterruptedException
	{			
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("https://www.pvrcinemas.com");			
		
		//To Maximize the window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();

		
		
		//driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		//driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='KALKI 2898 AD'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='06:45 PM']")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		
		driver.findElement(By.xpath("//span[@id='SL.SILVER|E:1']")).click();
		
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
		String bookingSummary=driver.findElement(By.xpath("//div[@class='summary-movies-content']")).getText();
		System.out.println(""+bookingSummary);
		System.out.println(driver.findElement(By.xpath("//div[@class='seat-info']")).getText());

		
		
		System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'grand-tota')])[3]")).getText());

		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='mobileInput']")).sendKeys("9441435931");
		
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement closeBut = driver.findElement(By.xpath("//i[@class='pi pi-times']"));
		driver.executeScript("arguments[0].click();", closeBut);
		
		System.out.println(driver.getTitle());
		
		driver.close();		
		
		
		
	}
	
}
