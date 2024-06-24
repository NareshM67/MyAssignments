package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Account 
{
	public static void main(String[] args) throws InterruptedException
	{			
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("http://leaftaps.com/opentaps/");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		//To Locate the username WebElement and use findElement()
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));			
		//enter username
		username.sendKeys("demosalesmanager");	
		
		//locate password element and enter password 
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");			
		
		//locate element and click on login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();		
		
		//locate element click on CRM/SFA button
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		
		//locate element click on Accounts button		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		//locate element click on Create Account button
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		//locate account name field and enter name
		driver.findElement(By.xpath("(//input[@name='accountName' and @type='text'])[2]")).sendKeys("Naresh");
		
		//locate descripton field and enter value
		WebElement description = driver.findElement(By.xpath("//textarea[@class='inputBox' and @name='description']"));
		description.sendKeys("Selenium Automation Tester");	
		
		// Locate the dropdown WebElement
		WebElement industryElement = driver.findElement(By.xpath("//select[@class='inputBox' and @name='industryEnumId']"));
		//Create an object for Select class (from selenium)
		Select industry = new Select(industryElement);
		//Use select method 
		industry.selectByIndex(2);
		
		//ownership dropdown
		WebElement ownershipWE = driver.findElement(By.xpath("//select[@class='inputBox' and @name='ownershipEnumId']"));
		Select ownership = new Select(ownershipWE);
		ownership.selectByVisibleText("S-Corporation");
				
		// Employee dropdown 
		WebElement sourceWE = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select source = new Select(sourceWE);
		source.selectByValue("LEAD_EMPLOYEE");	
				
		//marketingCampaignId dropdown
		WebElement marketingCampaignWE = driver.findElement(By.xpath("//select[@class='inputBox' and @name='marketingCampaignId']"));
		Select marketingCampaignDD = new Select(marketingCampaignWE);				
		marketingCampaignDD.selectByIndex(5);
				
		// state dropdown 
		WebElement stateWE = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select state = new Select(stateWE);
		state.selectByValue("TX");		
		
		//locate create Account button and click
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		//To get the tile of page
		String actualTitle = driver.getTitle();
		System.out.println("actualtitle is : "+actualTitle);
		
		String expectedTitle = "Create Account | opentaps CRM";
		System.out.println("expectedTitle is : "+expectedTitle);
		
		//To verify the title using if condition
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		
		//to close the browser window
		driver.close();				
	 }
}
