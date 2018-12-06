import java.util.Scanner;

public class Caesar {
	
	private String alpha = "abcdefghijklmnopqrstuvwxyz ";
	private String plainText = "";
	private String encodedText = "";
	private int key = 0;
	private String answer;
	Scanner keyboard = new Scanner(System.in);
	public Caesar() {
		
	}
	
	// methods
	public void getPlainText() {
		System.out.println("Please enter the plain text: ");
		plainText = keyboard.nextLine();
		System.out.println("You have entered: " + plainText);
	}
	
	public void getKey() {
		System.out.println("Please enter the key #: ");
		key = keyboard.nextInt();
		System.out.println("You have entered: " + key);
	}
	
	public void encrypt() {
		for (int i = 0; i < plainText.length(); i++) {
			encodedText += alpha.charAt((alpha.indexOf(plainText.charAt(i)) + key)%alpha.length());
		}
		System.out.println(encodedText);
	}

	public String getEncryptDecrypt() {

		while (true) {
			System.out.println("Would you like to encrypt or decrypt? (enter encrypt or decrypt)");
			answer = keyboard.nextLine();
			answer = String.valueOf(answer.charAt(0)).toUpperCase();;
		
			if (answer.equals("E")) {
				break;
			}
			if (answer.equals("D")) {
				break;
			}
			
			System.out.println("please try again");
		
		
		}
		return answer;
	}

	public void getEncodedText() {
		System.out.println("Please enter the encoded text: ");
		encodedText = keyboard.nextLine();
		System.out.println("You have entered: " + encodedText);
		
	}

	public void decrypt() {
		for (int i = 0; i < encodedText.length(); i++) {
			plainText += alpha.charAt((alpha.indexOf(encodedText.charAt(i)) - key)%alpha.length());
		}
		System.out.println(plainText);
		
	}
	
}
