package letterSounds;

public class Main {

	public static void main(String[] args) {
		
		char letter = 'A';
		
		switch (letter) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Vowels.");
				break;
				default:
					System.out.println("Consonants.");					
		}

	}

}
