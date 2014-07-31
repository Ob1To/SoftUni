package homework;

import java.util.Scanner;

public class P08CountOfEqualBitPairs {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int counter = 0;
		String loopsNumber = Integer.toBinaryString(number);
		int firstBit = number & 1;
		for (int i = 0; i < loopsNumber.length(); i++) {
			number = number >> 1;
			int nextBit = number & 1;
			if (firstBit == nextBit) {
				counter++;
			}
			firstBit = nextBit;
		}
		System.out.println(counter);
	}
}
