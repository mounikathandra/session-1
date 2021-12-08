package JavaTraining;

import java.util.Arrays;
import java.util.*;

public class AIOBSampleHandled {

	public static void main(String[] args) {
		int arr[] = { 35, 54, 65, 78, 44, 42, 55 };
		System.out.println("Enter the elements in an array");
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of required element");
		try {
			int element = sc.nextInt();
			System.out.println("Element in the given index:" + arr[element]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index you entered is invalid");

			System.out.println("Please enter a valid index number between 0 to 6");

		}

	}

}
