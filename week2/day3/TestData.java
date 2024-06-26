package week2.day3;

public class TestData 
{
	public void enterCredentials()
	{
		System.out.println("enter credentials method");
	}
	public void navigateToHomePage()
	{
		System.out.println("navigate to homePage method");
	}
	
	public static void main(String[] args) 
	{
		TestData testdata = new TestData();
		testdata.enterCredentials();
		testdata.navigateToHomePage();
	}
}
