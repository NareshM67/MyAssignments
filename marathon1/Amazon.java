package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException
	{			
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
						
		//Load the url Using get()
		driver.get("https://www.amazon.in/");			
		
		//To Maximize the window
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//div[@role='button'and text()='bags for boys']")).click();
	    
		String text=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
		System.out.println(text+" Bags for boys");
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		
		String bagname=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'])[1]")).getText();
		System.out.println(bagname);

		/*WebElement bagname=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"));
		System.out.println("First resulting bag :"+bagname.getText());
		WebElement dprice=driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("Discounted price :"+dprice.getText());		
		
		*/
		driver.close();   
	 
	}
}
