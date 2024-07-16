package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/features/Salesforce.feature"}, glue="stepDef")
public class SalesforceRunner extends AbstractTestNGCucumberTests
{
	
}