import java.util.Scanner;

public class ASCIINumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letter = 'A';
		int asciiVal = 'A';
		
		for (int i = 0; i < 26; i++) {
			System.out.println("Ascii value of "+ letter + ": " + asciiVal);
			letter++;
			asciiVal++;
		}
		
		
		
	}

}
