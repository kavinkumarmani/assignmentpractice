package workout;

import java.nio.ShortBuffer;

public class intreverse {

	public static void main(String[] args) {
		
		int j=34567;
		int rev=0;
		
		while(j!=0) {
			rev=rev*10+j%10;
			j=j/10;
		}
		System.out.println(rev);
		
		int i=45678;
		
		StringBuffer sf=new StringBuffer(String.valueOf(i));
		System.out.println(sf.reverse());

	}

}
