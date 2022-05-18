package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		// Declare an int Input and assign a value 13

		int input=11;

		// Declare a boolean variable flag as false

		boolean f=false;

		if(input==1 || input==0)
		{
			System.out.println("Neither Prime nor composite");
			f=true;
		}
		else
		{
			// Iterate from 2 to half of the input
			for(int i=2;i<=(input/2);i++)
			{

				// Divide the input with each for loop variable and check the remainder
				int rem=input%i;
				if(rem!=0)
				{			
					// Set the flag as true when there is no remainder
					f=true;
				}
				break;
			}
			if(f==true)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
		}
		
	}
}
