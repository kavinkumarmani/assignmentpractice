package workout;

public class reversestring {

	public static void main(String[] args) {
		
		String s="tatawaterplus";
		String rev="";
		int len=s.length();
		System.out.println(len);
		for(int i=12;i>=0;i--) {
			rev= rev+ s.charAt(i);
		}
		System.out.println(rev);
		
		StringBuilder sf=new StringBuilder(s);
		System.out.println(sf.reverse());

	}

}
