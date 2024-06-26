package week2.day3;

public class LoginTestData extends TestData
{
	public void enterUsername()
	{
		System.out.println("enter username method");
	}
	public void enterPassword()
	{
		System.out.println("enter password method");
	}
	
	public static void main(String[] args)
	{
		
		LoginTestData login = new LoginTestData();
		login.enterUsername();
		login.enterPassword();
		login.enterCredentials();
		login.navigateToHomePage();
	}
}
