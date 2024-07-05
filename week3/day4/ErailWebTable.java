package week3.day4;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ErailWebTable 
{
	public static void main(String[] args) throws InterruptedException
	{			
		
		//ChromeOptions options = new ChromeOptions();
		//Step2: add arguments in addArguments() to disable the notification
		//options.addArguments("--disable-notifications");
		
		//Launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url Using get()
		driver.get("https://erail.in/");			
		
		//To Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement start = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		start.clear();
		start.sendKeys("MAS"+Keys.ENTER);
		WebElement end = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		end.clear();
		end.sendKeys("MDU"+Keys.ENTER);
		//driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU"+Keys.ENTER);

		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		//WebElement table = driver.findElement(By.xpath("(//table)[2]"));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
        
		int rowCount= rows.size();
		Set<String> trainNames= new LinkedHashSet<String>();
		Set<String> duplicateTrainNames = new LinkedHashSet<String>();
		for (int i=2;i<=rowCount; i++) 		
        {
            String trainName= driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
            System.out.println(trainName);
            if(trainNames.add(trainName)==false)
            {
				duplicateTrainNames.add(trainName);
			}
        }
		int totalNoOfTrains = rowCount-1;
		if(totalNoOfTrains==trainNames.size())
		{
				System.out.println("There is no duplicate trains");
	
		}else
		{
			System.out.println("There is duplicate trains");
		}

		System.out.println("The duplicated train names are : "+ duplicateTrainNames);
		driver.close();
	}        
        
}
       

	

