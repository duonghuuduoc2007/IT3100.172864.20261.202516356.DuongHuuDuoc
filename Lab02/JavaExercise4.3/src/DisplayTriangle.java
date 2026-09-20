import java.util.Scanner;
public class DisplayTriangle {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = keyboard.nextInt();
		
		if (n<=0) {
			System.out.println("Invalid value of n!");
		} else {
			for (int i=0;i<n;i++) {
				for (int j=0;j<2*i+1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}