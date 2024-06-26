package week2.day3;

public class Browser {
	
	
	String browserName = "chrome";
	String browserVersion="126.0.6478.115";
	public void openURL()
	{
		System.out.println("url opened");
	}
	
	public void closeBrowser()
	{
		System.out.println("browser closed");
	}
	public void navigateBack()
	{
		System.out.println("navigated back");
	}
	
	public static void main(String[] args)
	{		
		Browser browser= new Browser();
		browser.openURL();
		browser.closeBrowser();
		browser.navigateBack();
		
	}
}
