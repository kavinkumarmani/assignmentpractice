package workout;

public class palindromenumbers {
	
	public static void anypolindrome(int num) {
		
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("the given number is polindrome number");
		}
		else {
			System.out.println("the given number is not a polindrome number");
		}
	}

	public static void main(String[] args) {
		
		anypolindrome(32423);

	}

}
