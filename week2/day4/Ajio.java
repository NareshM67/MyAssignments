package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio 
{
	public static void main(String[] args) throws InterruptedException
	{			
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("https://www.ajio.com/");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(3000);
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(count);
		
		
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		
		for (WebElement result:brands) {
			
			String list= result.getText();
            System.out.println(list);        //div[@class='nameCls']       
        }
List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		for (WebElement result:names) {
			
			String listnames= result.getText();
            System.out.println(listnames);          
        }
		
		driver.close();
		
		
	}
}
