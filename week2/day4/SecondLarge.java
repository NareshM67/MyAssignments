package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLarge 
{
	public static void main(String[] args)
			{	 
				
					
	        // Step 1: Declare and initialize the array
	        Integer a[]  = {3, 2, 11, 4, 6, 7};
	        
	        // Step 2: Convert the array to a List
	        List<Integer> a1 = new ArrayList<>(Arrays.asList(a));
	        
	        // Step 3: Sort the List in ascending order
	        Collections.sort(a1);
	        
	        
	        
	        // Step 4: Get the second to last element (second largest number) and print it
	        int secondLargest = a1.get(a1.size() - 2);
	        System.out.println("The second largest number is: " + secondLargest);
	    }
				
			
}
