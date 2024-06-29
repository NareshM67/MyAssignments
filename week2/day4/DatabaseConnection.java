package week2.day4;

public interface DatabaseConnection 
{
	public abstract void connect();
	
	public abstract void disconnect();
	
	public abstract void executeUpdate();
}
