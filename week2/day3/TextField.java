package week2.day3;

public class TextField extends WebElement 
{
	public void getText()
	{
		System.out.println("gettext method in textfieldclass");
	}
	
	public static void main(String[] args) {
		
		TextField text = new TextField();
		text.getText();
		text.click();
		text.setText("");
		
	}
}
