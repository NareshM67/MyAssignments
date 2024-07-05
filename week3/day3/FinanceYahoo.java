package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo 
{
	public static void main(String[] args) throws InterruptedException
	{			
		
		//Launch the browser		
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("https://finance.yahoo.com/");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='More']")).click();
		driver.findElement(By.linkText("Crypto")).click();
		
		// // Locate the table in the DOM
		WebElement table = driver.findElement(By.xpath("//table"));
		
		 // Locate the rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        
        for (WebElement row : rows) 		
        {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (!cells.isEmpty())
            {
                // first column
                String cryptoName = cells.get(1).getText();
                System.out.println("Cryptocurrency Name: " + cryptoName);
            }
        }
        driver.close();
	
}
}