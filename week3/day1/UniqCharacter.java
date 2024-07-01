package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqCharacter {

	public static void main(String[] args) 
	{
		String companyName = "google";
		
		char charArray[]= companyName.toCharArray();
		
		Set<Character> uniqChar = new LinkedHashSet<Character>();
		
		for (char c : charArray) 
		{			
			uniqChar.add(c);			
		}
		System.out.println(uniqChar);
	}

}
