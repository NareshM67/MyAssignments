package week2.day3;

public class Button extends WebElement 
{
	public void submit()
	{
		System.out.println("submit button from button class");
	}
	
	public static void main(String[] args) 
	{
		Button button = new Button();
		button.submit();
		button.click();
		button.setText("");
	}
}

