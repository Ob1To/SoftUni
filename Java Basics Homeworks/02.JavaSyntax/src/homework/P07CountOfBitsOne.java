package homework;

import java.util.Scanner;

public class P07CountOfBitsOne {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int counter = 0;
		for (int i = 0; i < 16; i++) {
			if ((number & 1) == 1) {
				counter++;
			}
			number = number >> 1;
		}
		System.out.println(counter);
	}

}
