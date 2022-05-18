package week1.day1;

public class ArmstrongNumber {
				

		public static void main(String[] args) {

			// Declare your input
			int input=282;
			// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)

			int cal=0,orig,rem;
				// Assign input into variable original 

			orig=input;

				// Use loop to calculate: use while loop to set condition until the number greater than 0

			while(input>0)
			{
				// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
				rem=input%10;
				// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
				
				input=input/10;

				// Within loop: Add calculated with the cube of remainder & assign it to calculated
				cal=cal+(rem*rem*rem);
				
			}	
				// Check whether calculated and original are same

			if(cal==orig)
			{
				//When it matches print it as Armstrong number
				System.out.println("It is an armstrong Number");
			}
			else
			{
				System.out.println("It is not an armstrong number");
			}
		}
}