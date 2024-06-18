package week1.day2;

public class Palindrome 
{	
		public static void main(String[] args)
		{	 
			int output=0;    
			int input=12345; 	 
		    int temp = input;	     
		   for (int i = input; i > 0; i /= 10)
			{   				  
				int reminder = input%10;  				 
				output=(output*10)+reminder;  
				input=input/10;				
			}    
	 			
			if(temp==output)    
				System.out.println("Number is palindrome ");    
			else    
				System.out.println("Number is not palindrome");  	 
		}	
}


