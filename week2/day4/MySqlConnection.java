package week2.day4;

public abstract class MySqlConnection implements DatabaseConnection{
	
	public void executeQuery()
	{
		System.out.println("method in abstract class");
	}

}
