package workout;

public class Stringreverse {

	public static void main(String[] args) {
		
		String s="kavinkumarmani";
		String rev="";
		int len=s.length();
		System.out.println(len);
		StringBuilder sf=new StringBuilder(s);
		System.out.println(sf.reverse());
		
		for(int i=17;i>=0;i--) {
			rev=rev+(s.charAt(i));
		}
		System.out.println(rev);

	}

}
