package workout;

import java.util.Arrays;

public class largestsmallest {

	public static void main(String[] args) {
		
		int number[]= {1};
		int largest=number[0];
		int smallest=number[0];
		
		for(int i=1;i<number.length;i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
			else if(number[i]<smallest) {
				smallest=number[i];
			}
		}
		System.out.println("the given numbers in array are "+ Arrays.toString(number));
		System.out.println("the largest number is "+ largest);
		System.out.println("the smallest number is "+smallest);

	}

}
