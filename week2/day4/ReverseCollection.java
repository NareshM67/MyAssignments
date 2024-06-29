package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {

	public static void main(String[] args) {
		
		String names[]= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
        List<String> names1 = new ArrayList<>(Arrays.asList(names));
        
        
		Collections.sort(names1);
		
		System.out.println("Sorted list "+names1);
		
       // Collections.reverse(names1);
		
		List<String> reversedList = new ArrayList<>();
		for (int i = names1.size() - 1; i >= 0; i--) {
		    reversedList.add(names1.get(i));
		}
        
        System.out.println("Reversed list "+reversedList);	
		

	}

}
