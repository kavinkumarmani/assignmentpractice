package workout;

public class primenumber {
	
	public static boolean anyprimenumber(int num) {
		
		if(num<=1) {
			return false;
			
		}
		
		for(int i=2;i<num;i++) {
			if(num%i==0){
				return false;
			}
		}
		return true;
		
	}
		
		public static void giveprimenumber(int num){
			for(int i=2;i<=num;i++) {
				if(anyprimenumber(i))
					System.out.println("the given number are primenumbers  "+i );
			
		}
	}

	public static void main(String[] args) {
		
		System.out.println("the given is prime number or not  "+ anyprimenumber(33));
		System.out.println("the given is prime number or not  "+ anyprimenumber(151));
		System.out.println("the given is prime number or not  "+ anyprimenumber(280));
		
		giveprimenumber(54);

	}

}
