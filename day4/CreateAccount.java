package week1.day4;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class CreateAccount
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
				
				//locate element click on Accounts button		
				driver.findElement(By.linkText("Accounts")).click();
				
				//locate element click on Create Account button
				driver.findElement(By.linkText("Create Account")).click();
				
				//locate account name field and enter name
				driver.findElement(By.id("accountName")).sendKeys("naresh1");
				
				//locate descripton field and enter value
				WebElement description = driver.findElement(By.name("description"));
				description.sendKeys("Selenium Automation Tester");			
				
				//locate numberofemployees field and enter value
				driver.findElement(By.id("numberEmployees")).sendKeys("25");
				
				//locate sitename field and enter value
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
				
				//locate create Account button and click
				driver.findElement(By.className("smallSubmit")).click();

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
