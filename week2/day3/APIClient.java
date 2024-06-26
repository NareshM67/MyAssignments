package week2.day3;

public class APIClient
{
	
	public void sendRequest(String endpoint)
	{
		System.out.println(endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, String requestStatus )
	{
		System.out.println(endpoint+" "+requestBody+" "+requestStatus);
	}

	public static void main(String[] args) 
	{
		
		APIClient api = new APIClient();
		api.sendRequest("TestLeaf");
		api.sendRequest("TestLeaf", " Selenium", "Inprogress");
		

	}

}
