import java.util.Scanner;


public class Task_2_Generate_3_Letter_Words {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the letters: ");
		String lettersString = scn.nextLine();
		
		String theWord = "";
		
		for (int i = 0; i < lettersString.length(); i++) {
			
			for (int j = 0; j < lettersString.length(); j++) {
				
				for (int k = 0; k < lettersString.length(); k++) {
					theWord = "" + lettersString.charAt(i) + lettersString.charAt(j) + lettersString.charAt(k);
					System.out.print(theWord + " ");
				}
				
			}
			
		}
	}

}
