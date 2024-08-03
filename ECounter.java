import java.util.Scanner;

public class ECounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int e = 0;
		System.out.println("Please enter a phrase:");
		Scanner Phrase = new Scanner (System.in);
		String newPhrase = Phrase.nextLine();
		for (int i = 0; i < newPhrase.length(); i++) {
			if (newPhrase.charAt(i) == 'e' || newPhrase.charAt(i) == 'E') {
				e++;
			}
		}
		System.out.println("The phrase '" + newPhrase + "' contains " + e + " 'e's.");
	}

}
