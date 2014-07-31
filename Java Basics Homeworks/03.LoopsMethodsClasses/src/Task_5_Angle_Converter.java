import java.util.Scanner;



public class Task_5_Angle_Converter {

	public static void converter(int number, String type) {
		double result = 0;
		if (type.equals("deg")) {
			result = (number * Math.PI) / 180;
			System.out.println("Your result after conversion is: " + result);
		}
		else if (type.equals("rad")) {
			result = (number * 180) / Math.PI;
			System.out.println("Your result after conversion is: " + result);
		}
		else {
			System.out.println("Sorry your input was not correct !");
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Please enter angles to convert: ");
		Scanner scn = new Scanner(System.in);
		int angleNumbers = scn.nextInt();
		scn.nextLine();
		for (int i = 1; i <= angleNumbers; i++) {
			System.out.printf("Please enter the %d angles to convert: ", i);
			converter(scn.nextInt(), scn.next());
		}
	}

}
