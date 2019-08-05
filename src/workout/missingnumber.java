package workout;

public class missingnumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,6};
		int sum=0;
		
		for(int i=0;i<5;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("the sum is "+ sum);
		
		int sum1=0;
		for(int j=1;j<=6;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		System.out.println("the missing number is  "+ (sum1-sum));
		

	}

}
