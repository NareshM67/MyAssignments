package week4.day3;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Salesforce extends ProjectSpecificMethod
{
	@Test
	public void SalesforceRunner() throws InterruptedException {
		
		/*ChromeOptions options = new ChromeOptions();
		//Step2: add arguments in addArguments() to disable the notification
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("testleaf@2024");
		driver.findElement(By.id("Login")).click();*/
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		WebElement searchWE = driver.findElement(By.xpath("//p[text()='Legal Entities']"));		
		action.moveToElement(searchWE).click().perform();
		Thread.sleep(3000);
		
		//WebElement clickWE=driver.findElement(By.xpath("//one-app-nav-bar-item-root[@class='navItem slds-is-unsaved slds-context-bar__item slds-shrink-none slds-is-active']//a[@role='button']//lightning-primitive-icon[@exportparts='icon']//*[name()='svg']//*[name()='path' and contains(@d,'M476 178L2')]"));
		//action.moveToElement(clickWE).click().perform();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Company Name']/following::input")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//label[text()='Description']/following::textarea")).sendKeys("Salesforces");
		//driver.findElement(By.xpath("//button[@id='combobox-button-183']")).click();
		//driver.findElement(By.xpath("//span[text()='Active']")).click();
		//Click on Status Dropdown and select Active
		WebElement Status = driver.findElement(By.xpath("//label[text()='Status']/following::button"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Status));
		driver.executeScript("arguments[0].click();", Status);
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();

		String messege=driver.findElement(By.xpath("//div[@class='slds-form-element__help']")).getText();
		System.out.println(messege);
		String expectedMessage="Complete this field.";
		if(messege.equalsIgnoreCase(expectedMessage))
		{
			System.out.println("verified");
		}
		else
		{
			System.out.println("not verified");
		}
		driver.close();
	}

}
