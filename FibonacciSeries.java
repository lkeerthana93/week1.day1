package week1.day1;

public class FibonacciSeries {
	
		public static void main(String[] args) {

			// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
			int range=9,firstNum=0,secNum=1;
			int sum;
			// Print first number
		
			// Iterate from 1 to the range
			for (int i = 0; i < range ; i++) {
				System.out.println(firstNum);	
				// add first and second number assign to sum
				sum=firstNum+secNum;
				// Assign second number to the first number
				firstNum=secNum;
				// Assign sum to the second number
				secNum=sum;
				// print sum
			}
						
		}

}
