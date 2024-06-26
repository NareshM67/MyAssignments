package week2.day3;

public class RadioButton extends Button 
{
	public void selectRadioButton()
	{
		System.out.println("selectradiobutton in radiobutton class");
	}
	
	public static void main(String[] args)
	{
		
		RadioButton radio = new RadioButton();
		radio.selectRadioButton();
		radio.submit();
		radio.click();
		radio.setText("");
		
	}
}
