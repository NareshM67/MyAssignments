package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead
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
			WebElement username = driver.findElement(By.id("username"));			
			//enter username
			username.sendKeys("demosalesmanager");
			
			//locate password element and enter password 
			driver.findElement(By.id("password")).sendKeys("crmsfa");			
			
			//locate element and click on login button
			driver.findElement(By.className("decorativeSubmit")).click();		
			
			//locate element click on CRM/SFA button
			driver.findElement(By.partialLinkText("CRM")).click();			
			
			//locate element click on Leads button
			driver.findElement(By.linkText("Leads")).click();
			
			//locate and click on create Lead button 
			driver.findElement(By.linkText("Create Lead")).click();
			
			//locate firstname field and enter firstname
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("naresh");
			
			//locate lastname field and enter lastname
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("maroju");
			
			//locate company name field and enter the value
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			
			//locate title field enter value
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selinum");
			
			//locate create lead button and click
			driver.findElement(By.className("smallSubmit")).click();
			
			//to get title of a page
			String actualTitle = driver.getTitle();
			//print value in console
			System.out.println("Actual title is : "+actualTitle);
			
			String expectedTitle = "View Lead | opentaps CRM";
			//print value in console
			System.out.println("Expected title is : "+expectedTitle);
			
			//To verify the title
			if(actualTitle.equalsIgnoreCase(expectedTitle))
				System.out.println("Title Matched");
			else
				System.out.println("Title didn't match");
			
			//To close the browser window
			driver.close();			
		}
}