package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead 
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
		username.sendKeys("democsr");	
		
		//locate password element and enter password 
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");			
		
		//locate element and click on login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();		
		
		//locate element click on CRM/SFA button
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();	
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");	
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Naresh");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M");			

		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("nareshm");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("selenium");
		
		//locate descripton field and enter value
		WebElement description = driver.findElement(By.xpath("//textarea[@class='inputBox' and @name='description']"));
		description.sendKeys("Selenium Automation Tester");	

		//locate email field and enter value
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("nareshm@gmail.com");			

		WebElement stateWE = driver.findElement(By.xpath("//select[@class='inputBox' and @name='generalStateProvinceGeoId']"));
		Select state = new Select(stateWE);
		state.selectByVisibleText("New York");
		
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();		
		
		driver.findElement(By.xpath("//a[text()= 'Edit']")).click();		
		
		driver.findElement(By.xpath("//textarea[@name= 'description']")).clear();
		
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("nareshmgmail.com");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Update']")).click();	
		
		//To get the tile of page
		String Title = driver.getTitle();
		System.out.println("Title is : "+Title);	
		
		//To close the browser window
		driver.close();	
	}
}
