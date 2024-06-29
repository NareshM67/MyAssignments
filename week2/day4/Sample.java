package week2.day4;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample 
{
		public static void main(String[] args)
		{	 
			//String a[]= {"3", "2", "11", "4", "6", "7"};
			List<String> a1 = new ArrayList<String>(Arrays.asList("3", "2", "11", "4", "6", "7"));
			//String b[]= {"1", "2", "8", "4", "9", "7"};
			
			List<String> b1 = new ArrayList<String>(Arrays.asList("1", "2", "8", "4", "9", "7"));
			//String c[] = {};
			//List<String> c1 = new ArrayList<String>(Arrays.asList(c));
			
			System.out.println("First List "+a1);
			System.out.println("Second list "+b1);
			System.out.print("Matching Elements are : ");			
			
			for(String c1 : a1)
			{
					if(b1.contains(c1))
					{
						System.out.print(c1+" ");
					}
				
			}
		}
}
