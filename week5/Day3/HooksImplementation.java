package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDef.ProjectSpecificMethod;

public class HooksImplementation extends ProjectSpecificMethod
{
	@Before
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}
	@After
	public void closeBrowser() {
		driver.close();
}
}