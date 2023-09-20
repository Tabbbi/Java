package prj_K1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter message:");
		 String message = sc.nextLine();
		 System.out.println("Enter Encrytion-Stepsize: ");
		 int n = sc.nextInt();
		 
		 if (n % 26 != 0) {
			 n = n % 26;
		 }

		 System.out.println("");
		 String encryptedMessage = encrypt(message, n);
		 System.out.println("Encrypted Message: ");
		 System.out.println(encryptedMessage);
		 System.out.println("");
		 
		 String decryptedMessage = decrypt(encryptedMessage, n);
		 System.out.println("Decrypted Message: ");
		 System.out.println(decryptedMessage);
	}
	
	public static String encrypt(String message, int n) {
		String vowels = "AEIOUaeiou";
		String upperCons = "BCDFGHJKLMNPQRSTVWXYZBCDFGHJKLMNPQRSTVWXYZ";
		String lowerCons = "bcdfghjklmnpqrstvwxyzbcdfghjklmnpqrstvwxyz";
		String punctuation = ",.;:?!-\"'()[]{}@#$%^&*+=<>\\/^°~ ";
		
		StringBuilder encrypted = new StringBuilder();
		
		for (char c : message.toCharArray()) {
			if (vowels.indexOf(c) != -1 || punctuation.indexOf(c) != -1) {
				encrypted.append(c);
			} else {
				if (upperCons.indexOf(c) != -1) {
					int idxUp = upperCons.indexOf(c);
					if (idxUp == upperCons.length() - 1) {
						encrypted.append(upperCons.charAt(n - 1));
					} else {
						encrypted.append(upperCons.charAt(idxUp + n));
					}
				} else if (lowerCons.indexOf(c) != -1) {
					int idxLow = lowerCons.indexOf(c);
					if (idxLow == lowerCons.length() - 1) {
						encrypted.append(lowerCons.charAt(n - 1));
					} else {
						encrypted.append(lowerCons.charAt(idxLow + n));
					}
				}
			}
		}
		return encrypted.toString();
	}
	
	public static String decrypt(String encryptedMessage, int n) {
		String vowels = "AEIOUaeiou";
		String upperCons = "BCDFGHJKLMNPQRSTVWXYZBCDFGHJKLMNPQRSTVWXYZ";
		String lowerCons = "bcdfghjklmnpqrstvwxyzbcdfghjklmnpqrstvwxyz";
		String punctuation = ",.;:?!-\"'()[]{}@#$%^&*+=<>\\/^°~ ";
		
		StringBuilder decrypted = new StringBuilder();
		
		for (char c : encryptedMessage.toCharArray()) {
			if (vowels.indexOf(c) != -1 || punctuation.indexOf(c) != -1) {
				decrypted.append(c);
			} else {
				if (upperCons.indexOf(c) != -1) {
					int idxUp = upperCons.indexOf(c);
					if (idxUp == upperCons.length() - 1) {
						decrypted.append(upperCons.charAt(n + 1));
					} else {
						decrypted.append(upperCons.charAt(idxUp - n));
					}
				} else if (lowerCons.indexOf(c) != -1) {
					int idxLow = lowerCons.lastIndexOf(c);
					if (idxLow == lowerCons.length() - 1) {
						decrypted.append(lowerCons.charAt(n + 1));
					} else {
						decrypted.append(lowerCons.charAt(idxLow - n));
					}
				}
			}
		}
		return decrypted.toString();
	}
	
}
