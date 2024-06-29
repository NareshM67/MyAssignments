package week2.day4;

public class JavaConnection implements DatabaseConnection {

	

	public  void connect() {
		System.out.println("connect Absract method in DatabaseConnection ");
		
	}

	public void disconnect() {
		System.out.println("disconnect Absract method in DatabaseConnection");
		
	}

	public void executeUpdate() {
		System.out.println("excuteUpdate Absract method in DatabaseConnection");
		
	}
	
	public static void main(String[] args) {
		
		DatabaseConnection data= new JavaConnection();
		data.connect();
		data.disconnect();
		data.executeUpdate();
		

	}

	
}
