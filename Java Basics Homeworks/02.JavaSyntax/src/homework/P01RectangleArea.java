package homework;

import java.util.Scanner;

public class P01RectangleArea {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("a = ");
		int a = input.nextInt();
		System.out.print("b = ");
		int b = input.nextInt();
		System.out.printf("Rectangle area: %d", a*b);

	}

}
