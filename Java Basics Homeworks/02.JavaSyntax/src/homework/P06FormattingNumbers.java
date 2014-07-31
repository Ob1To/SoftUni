package homework;

import java.util.Scanner;

public class P06FormattingNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		String hexA = Integer.toHexString(a);
		String binA = Integer.toBinaryString(a);
		a = Integer.parseInt(binA);
		double b = input.nextDouble();
		double c = input.nextDouble();
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hexA, a, b, c);
	}
}
