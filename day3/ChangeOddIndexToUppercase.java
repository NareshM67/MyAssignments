package week1.day3;

public class ChangeOddIndexToUppercase 
{	
	    public static void main(String[] args) 
	    {
	        //String test = "changeme";	
	    	String test = "selenium";	 
	        // Convert the given String to a character array
	        char[] charArray = test.toCharArray();
	       
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            // Check if the index is odd
	            if (i % 2 != 0) 
	            {
	                // Change the character to uppercase
	                charArray[i] = Character.toUpperCase(charArray[i]);	               
	            }	           
	        }     
	        System.out.println(charArray);	        
	    }
	}



