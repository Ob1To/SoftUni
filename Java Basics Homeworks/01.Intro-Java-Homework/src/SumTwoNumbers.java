import java.util.Scanner; 

public class SumTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Please enter the second number: ");
		int secondNumber = scanner.nextInt();
		int sum = firstNumber + secondNumber;
		
		System.out.printf("Your sum is: %d", sum);
		scanner.close();
	}

}
