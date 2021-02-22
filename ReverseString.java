import java.util.Scanner;

//$Id$

public class ReverseString {
	public static String reverse(String sentence){
		if(sentence.length()==0) {
			return "";
		} 
		return reverse(sentence.substring(1)) + sentence.charAt(0);
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = in.nextLine();
		System.out.println(reverse(sentence));

	}

}
