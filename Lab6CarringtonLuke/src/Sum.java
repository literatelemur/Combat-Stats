import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter an int value to be stored into an array: ");
			a[i] = input.nextInt();
			if (i % 2 == 0)
				sum += a[i];
			else
				sum -= a[i];	
		}
		
		System.out.println("The alternating sum is " + sum);

	}

}
