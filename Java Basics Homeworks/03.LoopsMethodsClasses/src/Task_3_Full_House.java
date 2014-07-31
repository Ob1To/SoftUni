
public class Task_3_Full_House {

	public static void printCard(int number) {
		if (number < 11) {
			System.out.print(number);
		}
		else {
			switch (number) {
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
		}
	}
	
	public static void printSuit(int number) {
		switch (number) {
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
		break;
		}
	}
	
	public static void main(String[] args) {
		int fullHouseCounter = 0;
		for (int threeEqual = 2; threeEqual < 15; threeEqual++) {
			for (int twoEqual = 2; twoEqual < 15; twoEqual++) {
				if (threeEqual != twoEqual) {
					for (int firstSuit = 1; firstSuit < 5; firstSuit++) {
						
						for (int secondSuit = firstSuit + 1; secondSuit < 5; secondSuit++) {
							
							for (int thirdSuit = secondSuit + 1; thirdSuit < 5; thirdSuit++) {
								
								for (int fourtSuit = 1; fourtSuit < 5; fourtSuit++) {
									
									for (int fifthSuit = fourtSuit + 1; fifthSuit < 5; fifthSuit++) {
										
										printCard(threeEqual);
										printSuit(firstSuit);
										printCard(threeEqual);
										printSuit(secondSuit);
										printCard(threeEqual);
										printSuit(thirdSuit);
										printCard(twoEqual);
										printSuit(fourtSuit);
										printCard(twoEqual);
										printSuit(fifthSuit);
										System.out.println();
										fullHouseCounter++;
									}
									
									
								}
								
							}
							
						}
						
					}
				}
			}
		}
		System.out.printf("Full House number is %d", fullHouseCounter);
	}

}
