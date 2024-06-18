package week1.day1;

public class IsPrimeNumber 
{

	public static void main(String[] args) 
	{		
		    int n = 56;		  
		    int count = 0;
		    if (n < 2)
		      {
			System.out.println ("The given is number " + n + " is not prime");
			System.exit (0);
		      }
		    
		    for (int i = 1; i <= n; i++)
		      {
			if (n % i == 0)
			  count += 1;
		      }

		    
		    if (count > 2)
		      System.out.println ("The given is number " + n + " is not prime");

		    else
		      System.out.println ("The given is number " + n + " is prime");
		  }
		
	}

