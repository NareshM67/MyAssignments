package week2.day3;

public class CheckBoxButton extends Button 
{
	public void clickCheckButton()
	{
		System.out.println("clickcheckbutton method in checkboxbutton class");
	}
	
	public static void main(String[] args)
	{
		{
			CheckBoxButton check = new CheckBoxButton();
			check.clickCheckButton();
			check.click();
			check.setText("");
			check.submit();
			
		}
	}
}
