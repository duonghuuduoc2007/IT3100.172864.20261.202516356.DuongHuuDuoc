import java.util.Scanner;
public class MaxMinCost {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of media items: ");
		int n = keyboard.nextInt();
		keyboard.nextLine();
		double cost[] = new double[n];
		String title[] = new String[n];
		for (int i=0;i<n;i++) {
			System.out.print("Enter name for media item " + (i+1) + ": ");
			title[i] = keyboard.nextLine();
			System.out.print("Enter cost for media item " + (i+1) + "($): ");
			cost[i] = keyboard.nextDouble();
			keyboard.nextLine();
		}
		
		int maxIndex=0, minIndex=0;
		double total=0;
		for (int i=0;i<n;i++) {
			if (cost[i]>cost[maxIndex]) maxIndex = i;
			if (cost[i]<cost[minIndex]) minIndex = i;
			double finalCost = cost[i] >20 ? cost[i]*0.9 : cost[i];
			total += finalCost;
		}
		
		System.out.println("Max: " + title[maxIndex] + " - " + cost[maxIndex]);
		System.out.println("Min: " + title[minIndex] + " - " + cost[minIndex]);
		System.out.println("Total after discount: " + total);
	}
}
