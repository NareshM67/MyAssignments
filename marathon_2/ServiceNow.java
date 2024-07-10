package marathon_2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ServiceNow {
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		
		//Load the url Using get()
		driver.get("https://dev198624.service-now.com/");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("B6LIoxDq=r!9");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(3000);
		Shadow dom= new Shadow(driver);
		WebElement all=dom.findElementByXPath("//div[text()='All']");
		all.click();
		Thread.sleep(3000);
		dom.findElementByXPath("//span[text()='Service Catalog']").click();
		Thread.sleep(3000);
		WebElement frame1 = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		dom.findElementByXPath("//a[text()='Hardware']").click();
		Thread.sleep(3000);
		dom.findElementByXPath("//a[contains(text(),'Apple MacBook Pro 15')]").click();
		
		dom.findElementByXPath("//button[text()='Add to Cart']").click();
		Thread.sleep(3000);
		String subtotal=driver.findElement(By.xpath("//table[@id='sc_cart_item_list']//tr[5]/td[2]")).getText();
		System.out.println("Subtotal : "+subtotal);

		dom.findElementByXPath("//button[@id='catalog_cart_proceed_checkout']").click();
		String message=driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
		System.out.println("Verification message is : "+message);
		
		
		String requestnumber=driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("Request Number is : "+requestnumber);
		
		String totalPrice=driver.findElement(By.xpath("//div[@id='sc_cart_view']/table//tbody//tr[2]//td[3]")).getText();
		System.out.println("Total Price is : "+totalPrice);
		if(totalPrice.equals(subtotal))
		{
			System.out.println("Prices are same");
		}else
		{
			System.out.println("not same");
		}
		TakesScreenshot ts = (TakesScreenshot)driver;
	       // Capture screenshot as output type FILE
		 File file = ts.getScreenshotAs(OutputType.FILE);	 
	 
	     //save the screenshot taken in destination path
		 FileUtils.copyFile(file, new File("./ScreenShot_Folder/Servicenow.png"));
		driver.close();
		driver.quit();
		
	}
}
