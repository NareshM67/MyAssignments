package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Missing {

	public static void main(String[] args) {
		 // Step 1: Declare and initialize the array
        Integer a[]  = {1, 2, 3, 4, 10, 6, 8};
        
        // Step 2: Convert the array to a List
        List<Integer> a1 = new ArrayList<>(Arrays.asList(a));
        
        Collections.sort(a1);
        int previousNumber = a1.get(0);
        System.out.print("Missing numbers are : ");
        for (int i = 1; i < a1.size(); i++) {
            int currentNumber = a1.get(i);
            if (currentNumber - previousNumber > 1) {
                // There is a gap, print missing numbers
                for (int missing = previousNumber + 1; missing < currentNumber; missing++) 
                {
                    System.out.print(missing+" ");
                }
            }
            previousNumber = currentNumber;
        }

	}

}
