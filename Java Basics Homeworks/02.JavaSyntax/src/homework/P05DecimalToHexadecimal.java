package homework;

import java.util.Scanner;

public class P05DecimalToHexadecimal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int decimal = input.nextInt();
		String hex = Integer.toHexString(decimal);
		System.out.println("Hex value is: " + hex);
	}
}
