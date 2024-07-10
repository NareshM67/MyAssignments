package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("https://www.bigbasket.com/");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']")).click();
		//action.moveToElement(clickWE).click().perform();
		
		Actions action = new Actions(driver);
		//WebElement itemWE = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[1]"));
		Thread.sleep(3000);
		WebElement foodWE = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		
		action.moveToElement(foodWE).perform();
		Thread.sleep(3000);
		WebElement riceWE=driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		action.moveToElement(riceWE).perform();
		Thread.sleep(3000);
		WebElement boiledWE=driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		action.moveToElement(boiledWE).click().perform();
		
		WebElement brandWE=driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		action.moveToElement(brandWE).click().perform();
		
		Thread.sleep(3000);
		WebElement itemWE=driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"));
		action.moveToElement(itemWE).click().perform();
		Set<String> windowHandles = driver.getWindowHandles();		
		
		//Step 2: Convert the Set into List 
		List<String> windows = new ArrayList<String>(windowHandles);
		// Get the window address by using get method
		//Step3:
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
		
		WebElement quantity=driver.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full'])[5]"));
		action.moveToElement(quantity).click().perform();

		//driver.findElement(By.xpath("//input[@id='i-BBRoyal']")).click();
		
		String price=driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[5]")).getText();
		System.out.println("Price "+price);
		
		WebElement add=driver.findElement(By.xpath("//button[text()='Add to basket']"));
		action.moveToElement(add).click().perform();
		
		String conform=driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		System.out.println("add basket confirmation : "+conform);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
	       // Capture screenshot as output type FILE
		 File file = ts.getScreenshotAs(OutputType.FILE);	 
	 
	     //save the screenshot taken in destination path
		 FileUtils.copyFile(file, new File("./ScreenShot_Folder/BigBasket.png"));
		 
		 driver.close();
		 driver.quit();
	}
}
