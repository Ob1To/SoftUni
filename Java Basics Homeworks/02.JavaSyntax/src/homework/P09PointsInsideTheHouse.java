package homework;

import java.util.Scanner;

public class P09PointsInsideTheHouse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String point = input.nextLine();
		double pointX = Double.parseDouble(point.split(" ")[0]);
		double pointY = Double.parseDouble(point.split(" ")[1]);
		if (isInRoof(pointX, pointY)
				|| (pointX >= 12.5 && pointX <= 17.5 && pointY >= 8.5 && pointY <= 13.5)
				|| (pointX >= 17.5 && pointX <= 22.5 && pointY >= 8.5 && pointY <= 13.5)) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}
	
	public static boolean isInRoof(double x, double y) {
		boolean isInRoof = false;
		double leftSlope = (17.5 - 12.5) * (y - 8.5) - (3.5 - 8.5) * (x - 12.5);
		double rightSlope = (22.5 - 17.5) * (y - 3.5) - (8.5 - 3.5) * (x - 17.5);
		if (leftSlope >= 0 && rightSlope >= 0 && x >= 12.5 && x <= 22.5 && y <= 8.5) {
			isInRoof = true;
		}
		return isInRoof;
	}
	
}

