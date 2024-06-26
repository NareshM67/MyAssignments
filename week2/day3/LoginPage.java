package week2.day3;

public class LoginPage extends BasePage
{
	public void performCommonTasks()
	{
		System.out.println("performCommonTasks method in LoginPage class");

	}
	public static void main(String[] args) 
	{
		LoginPage login = new LoginPage();
		login.performCommonTasks();
		login.clickElement();
		login.enterText();
		login.findElement();
	}

}
