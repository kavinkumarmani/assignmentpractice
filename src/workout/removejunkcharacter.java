package workout;

public class removejunkcharacter {

	public static void main(String[] args) {
		
		String i="wer12!@#$are34&^*you56";
		
		i=i.replaceAll("[^a-zA-Z1-9]", "");
		System.out.println(i);
		

	}

}
