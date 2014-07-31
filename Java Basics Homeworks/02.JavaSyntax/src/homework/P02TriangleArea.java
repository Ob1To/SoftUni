package homework;

import java.util.Scanner;

public class P02TriangleArea {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] coordinates = new int[6];
		System.out.println("Enter x and y coordinates:");
		for (int i = 0; i < 3; i++) {
			System.out.print("next point (x y) = ");
			int x = input.nextInt();
			int y = input.nextInt();
			input.nextLine();
			coordinates[i * 2] = x;
			coordinates[i * 2 + 1] = y;
		}
		double area = (coordinates[0] * (coordinates[3] - coordinates[5]) +
						coordinates[2] * (coordinates[5] - coordinates[1]) +
						coordinates[4] * (coordinates[1] - coordinates[3])) / 2;
		System.out.println(Math.abs(Math.round(area)));
	}

}
