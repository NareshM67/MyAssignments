package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod
{
	
	
	@When("Click on the crmsfa")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on the Lead tab")
	public void click_Lead() {
		driver.findElement(By.linkText("Leads")).click();
		}

	@When("Click on the CreateLead link")
	public void click_Create() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("enter the company name")
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");


	}

	@Given("Enter the firstname")
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naresh");

	}

	@Given("Enter the lastname")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
	}

	@When("click on the create lead button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("verify the createLead is successfull")
	public void verifyCreate_Lead() {
		System.out.println(driver.getTitle());
	}

	
	
}
