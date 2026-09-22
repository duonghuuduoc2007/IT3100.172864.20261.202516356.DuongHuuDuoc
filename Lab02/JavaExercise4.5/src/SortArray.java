import java.util.Scanner;
import java.util.Arrays;
public class SortArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of media costs: ");
		int n = keyboard.nextInt();
		double mediaCosts[] = new double[n];
		System.out.print("Enter Media Costs:");
		for (int i=0;i<n;i++) {
			mediaCosts[i] = keyboard.nextInt();
		}
		
		double sum=0;
		for (int i=0;i<n;i++) {
			sum+=mediaCosts[i];
		}
		double average = sum/n;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.print("Sorted array: ");
		Arrays.sort(mediaCosts);
		for (int i=0;i<n;i++) {
			System.out.print(mediaCosts[i] + " ");
		}
	}
}
