package workout;

public class junkremove {

	public static void main(String[] args) {
		
		String s="h!a@i#H$O%W^are123u";
				
		s=s.replaceAll("[^a-zA-Z1-9]", "");
		System.out.println(s);

	}

}
