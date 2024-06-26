package week2.day3;

public class BasePage 
{
	public void findElement()
	{
		System.out.println("find element method in BasePage class");
	}
	public void clickElement()
	{
		System.out.println("click element method in BasePage class");
	}
	public void enterText()
	{
		System.out.println("enter text method in BasePage class");
	}
	public void performCommonTasks()
	{
		System.out.println("performCommonTasks method in BasePage class");
	}
	
	public static void main(String[] args)
	{
		BasePage base=new BasePage();
		base.clickElement();
		base.enterText();
		base.performCommonTasks();
		base.findElement();
		
	}

}
