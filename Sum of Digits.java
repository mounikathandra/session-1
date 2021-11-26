package JavaTraining;
import java.util.Scanner;

public class SumOfAllDigitNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<4;i++) {
			System.out.println("Enter a  number");
			int num=sc.nextInt();
			int sum=0,rem;
			while(num>0) {
				rem=num%10;
				num=num/10;
				sum=sum+rem;
			}
			System.out.println("Sum is:"+sum);
		}
		

	}

}
