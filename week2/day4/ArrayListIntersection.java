package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;

public class ArrayListIntersection 
{
		public static void main(String[] args)
		{	 
			
			Integer a[]= {3, 2, 11, 4, 6, 7};
			Integer b[]= {1, 2, 8, 4, 9, 7};
			
			List<Integer> a1 = new ArrayList<>(Arrays.asList(a));
			List<Integer> b1 = new ArrayList<>(Arrays.asList(b));
			
			List<Integer> intersection = new ArrayList<>();
	        
			for (Integer number : a1) {
	            if (b1.contains(number)) {
	                intersection.add(number);
	            }
	        }
			System.out.println("The intersection of the two lists is: " + intersection);
	        
	        
		}
}
