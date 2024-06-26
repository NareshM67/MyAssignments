package week2.day3;

public class Chrome extends Browser
{
	
	public void openIncognito()
	{
		System.out.println("Incogniti window");		
	}
	
	public void clearCache()
	{
		System.out.println("clearcache");
		
	}
	
	public static void main(String[] args) 
	{
		Chrome chrome = new Chrome();
		chrome.openIncognito();
		chrome.clearCache();
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();
		System.out.println("name : "+chrome.browserName);
		System.out.println("version : "+chrome.browserVersion);		
				
	}

}
