package week1.day3;

import java.util.Arrays;


public class FindMissingElement 
{
	public static void main(String[] args)
	{
		int input[] = {1,4,3,2,8,6,7};
		Arrays.sort(input);
		for(int i=0;i<input.length;i++)
		{
			if (input[i] != i + 1)
			{
                // Print the missing number
                System.out.println("Missing Number is "+(i + 1));
                // Break the loop once the missing number is found
                break;
		
		    }
	    }
	}
}
