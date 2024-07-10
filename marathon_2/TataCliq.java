package marathon_2;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		
		//Load the url Using get()
		driver.get("https://www.tatacliq.com/");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions action = new Actions(driver);
		WebElement brandsWE = driver.findElement(By.xpath("//div[text()='Brands']"));		
		action.moveToElement(brandsWE).perform();
		
		WebElement watchWE = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));		
		action.moveToElement(watchWE).perform();
		
		WebElement featuredWE = driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]"));		
		action.moveToElement(featuredWE).click().perform();
		
		//driver.findElement(By.xpath("//div[@class='SelectBoxDesktop__base']"));		
		WebElement sortWE = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sort = new Select(sortWE);
		sort.selectByVisibleText("New Arrivals");
		
		driver.findElement(By.xpath("//div[@id='l2FilterDiv-0']")).click();
		Thread.sleep(3000);
		List<WebElement> PricesAll = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		for(int i=0;i<PricesAll.size();i++)
		{
			String prices=PricesAll.get(i).getText();
			System.out.println(prices);
		}
		
		String price1 =driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']/h3")).getText();
		
		System.out.println("Price "+price1);
		driver.findElement(By.xpath("//div[@id='ProductModule-MP000000022548970']")).click();
		
		
		Set<String> windowHandles = driver.getWindowHandles();	
		
		//Step 2: Convert the Set into List 
		List<String> windows = new ArrayList<String>(windowHandles);
		// Get the window address by using get method
		//Step3:
		driver.switchTo().window(windows.get(1));
		String price2=driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']")).getText();

		System.out.println(price2);
		String price3= price2.replaceAll("MRP: ", "");
		if(price1.equals(price3))
		{
			System.out.println("Prices are same");
		}else
		{
			System.out.println("not same");
		}
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String cartCount=driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();

		System.out.println("Cart Count : "+cartCount);
		
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		driver.close();
		driver.switchTo().window(windows.get(0));
		driver.close();
		
		
	}
}
