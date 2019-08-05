package workout;

import java.util.HashSet;
import java.util.Set;

public class duplicateelement {

	public static void main(String[] args) {
		
		String names[]= {"praveen","jayanth","arun","naveen","praveen","kavin","jayanth"};
		//using loop
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i]==names[j]) {
					System.out.println("duplicate element is "+ names[i]);
				}
			}
		}
		
		Set<String> sf=new HashSet<String>();
		for(String name:names) {
			if(sf.add(name)==false){
				System.out.println("the duplicate element is "+name);
				
			}
		}
		
		

	}

}
