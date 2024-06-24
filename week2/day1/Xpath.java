package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath 
{
public static void main(String[] args) throws InterruptedException {
		
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps");
		
		// maximize the window 
		driver.manage().window().maximize();
		
		//Login to the leaftaps
		//driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("demosalesmanager");
		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		
		//driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		// Click on crmsfa link
		//driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		
		//Click on the leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		WebElement currencyWE = driver.findElement(By.xpath("//select[@id='createLeadForm_currencyUomId']"));
		Select currencyDD = new Select(currencyWE);
		currencyDD.selectByValue("INR");
		//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naresh");
				
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");		
		
		driver.findElement(By.xpath("//input[@name= 'submitButton']")).click();
}
}
