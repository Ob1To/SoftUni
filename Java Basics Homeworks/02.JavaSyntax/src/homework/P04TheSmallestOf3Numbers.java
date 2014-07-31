package homework;

import java.util.Arrays;
import java.util.Scanner;

public class P04TheSmallestOf3Numbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%c = ", ('\u0061' + i));
			numbers[i] = input.nextInt();
		}
		Arrays.sort(numbers);
		System.out.printf("Smallest: %d", numbers[0]);
	}
}
