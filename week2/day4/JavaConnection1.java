package week2.day4;

public class JavaConnection1 extends MySqlConnection {

	public void connect() {
		System.out.println("connect abstact method in database");
		
	}

	public void disconnect() {
		System.out.println("disconnect abstact method in database");

		
	}

	public void executeUpdate() {
		System.out.println("execute abstact method in database");

		
	}
	public static void main(String[] args) {
		
		MySqlConnection sql= new JavaConnection1();
		sql.connect();
		sql.disconnect();
		sql.executeUpdate();
		sql.executeQuery();
		
	}

}
