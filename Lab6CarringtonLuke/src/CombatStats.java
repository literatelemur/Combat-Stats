import java.util.Scanner;
public class CombatStats {

	public static void main(String[] args) {
		double min = 0, max = 0, avg = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many double values do you wish to input?");
		int quantity = input.nextInt();
		double[] dam = new double[quantity];
		for(int i = 0; i < dam.length; i++) {
			System.out.println("Enter a value:");
			dam[i] = input.nextDouble();
			if (i == 0) {
				min = dam[0];
				max = dam[0];
			}else if (dam[i] < dam[i-1])
				min = dam[i];
			else if (dam[i] > dam[i-1])
				max = dam[i];
			avg += dam[i];
		}
		avg = avg / dam.length;
		System.out.println("The minimum value is " + min);
		System.out.println("The maximum value is " + max);
		System.out.println("The average value is " + avg);
	}

}
