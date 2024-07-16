package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Salesforce extends ProjectSpecificMethod
{
	//ChromeDriver driver;
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	@Given("Lanuch the browser load the url")
	public void lanuchBrowser() {
				
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Enter username as {string}")
	public void username(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter password as {string}")
	public void enter_the_password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	@When("Click on login")
	public void click_on_the_login() {
		driver.findElement(By.id("Login")).click();
	}

	@When("Click on toggle menu")
	public void click_on_the_toggle_menu() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@When("Click on viewAll")
	public void click_on_the_view_all() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@When("Click on sales")
	public void click_on_sales() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
		WebElement Acc=driver.findElement(By.xpath("//span[text()='Accounts']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.executeScript("arguments[0].click();", Acc);
	}
	

	@When("Click on new button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[text()='New']")).click();

	}

	@When("Enter account name")
	public void enter_account_name() {
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys("Naresh");
	}

	@When("Select Ownership as public")
	public void select_ownership_as_public() {
		//Click on Status Dropdown and select Active
		WebElement ownershipWE= driver.findElement(By.xpath("//label[text()='Ownership']/following::button"));
		 driver.executeScript("arguments[0].click();", ownershipWE);
		 driver.findElement(By.xpath("//span[text()='Public']")).click();
			}

	@When("Click save button")
	public void click_save_button() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("Verify account name")
	public void verify_account_name() {
		String accountName=driver.findElement(By.xpath("//div[@class='slds-align-middle slds-hyphenate']")).getText();
		System.out.println(accountName);
	}

	
}

