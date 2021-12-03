package JavaTraining;
import java.util.Scanner;

public class Rev1Array {
	
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the array size: ");
	int n = scan.nextInt();
	System.out.println("enter the elememts in the array: ");
	int a[] = new int[n];
	for(int i=0; i < n; i++) {
	a[i] = scan.nextInt();
	}
	
	for(int i=0; i < n/2; i++)
	swap(i,n-i-1,a);
	for(int i = 0; i < n; i++) 
	System.out.println(a[i]);
	}

	public static void swap(int x, int y, int[] arr) {
	int temp = arr[x];
	arr[x] = arr[y];
	arr[y] = temp;
	}
	

		

	}


