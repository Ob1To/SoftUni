import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {

	public static void main(String[] args) {
		System.out.println("Please enter the amount of cities");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int amount = scanner.nextInt();
			String[] towns = new String[amount];
			for (int i = 0; i < amount; i++) {
				System.out.printf("Please enter the %d town", i + 1);
				towns[i] = scanner.next(); 
			}
			System.out.println("Your towns are: ");
			System.out.println(Arrays.toString(towns));
			System.out.println("And after sorting ... they are: ");
			Arrays.sort(towns);
			System.out.println(Arrays.toString(towns));
	}

}
