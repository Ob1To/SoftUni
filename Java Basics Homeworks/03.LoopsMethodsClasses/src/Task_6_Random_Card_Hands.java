import java.util.Random;
import java.util.Scanner;


public class Task_6_Random_Card_Hands {

	public static void printCard(int cardValue, int cardSuit){
		
		switch (cardValue) {
		case 2:
			System.out.print(cardValue);
			break;
		case 3:
			System.out.print(cardValue);
			break;
		case 4:
			System.out.print(cardValue);
			break;
		case 5:
			System.out.print(cardValue);
			break;
		case 6:
			System.out.print(cardValue);
			break;
		case 7:
			System.out.print(cardValue);
			break;
		case 8:
			System.out.print(cardValue);
			break;
		case 9:
			System.out.print(cardValue);
			break;
		case 10:
			System.out.print(cardValue);
			break;
		case 11:
			System.out.print("J");
			break;
		case 12:
			System.out.print("Q");
			break;
		case 13:
			System.out.print("K");
			break;
		case 14:
			System.out.print("A");
			break;
		}
		
		switch (cardSuit) {
		case 1:
			System.out.print('♣' + " ");
			break;
			case 2:
			System.out.print('♦' + " ");
			break;
			case 3:
			System.out.print('♥' + " ");
			break;
			case 4:
			System.out.print('♠' + " ");
		}
	}
	
	public static void printRandomHands(int numberHands){
		
		
		for (int i = 0; i < 5; i++) {
			Random generator = new Random();
			int cardValue = generator.nextInt(13) + 2;
			int cardSuit = generator.nextInt(4) + 1;
			
			printCard(cardValue, cardSuit);
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Please enter number of hands: ");
			int numberOfHands = scn.nextInt();
			
			for (int i = 0; i < numberOfHands; i++) {
				printRandomHands(numberOfHands);
			}
	}

}
