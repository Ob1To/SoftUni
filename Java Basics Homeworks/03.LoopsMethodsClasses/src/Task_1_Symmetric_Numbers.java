import java.util.Scanner;


public class Task_1_Symmetric_Numbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter start: ");
		int start = scn.nextInt();
		System.out.println("Enter end: ");
		int end = scn.nextInt();
		
		for (int i = start; i <= end; i++) {
			char[] arr = Integer.toString(i).toCharArray();
			boolean isSymmetric = true;
			
			for (int j = 0, k = arr.length - 1; j < arr.length / 2; j++, k--) {
				if (isSymmetric) {
					if (arr[j] != arr[k]) {
						isSymmetric = false;
					}
				}
			}
			if (isSymmetric) {
				System.out.print(i + " ");
			}
		}
	}

}
