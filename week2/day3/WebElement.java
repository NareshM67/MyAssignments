package week2.day3;

public class WebElement
{
	
	public void click()
	{
		System.out.println("click method from webelement class");
	}
	public void setText(String text)
	{
		System.out.println("text from webelement class");
	}

	public static void main(String[] args) 
	{		
		WebElement web = new WebElement();
		web.click();
		web.setText("");
	}
}
