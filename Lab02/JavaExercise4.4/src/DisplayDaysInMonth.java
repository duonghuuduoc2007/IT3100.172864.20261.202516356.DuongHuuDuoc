import javax.swing.JOptionPane;
import java.util.Arrays;
public class DisplayDaysInMonth {
	public static void main(String[] args) {
		String strMonth, strYear;
		int year=0;
		String months31[] = {"1", "3", "5", "7", "8", "10", "12",
							"January", "March", "May", "July", "August", "October", "December",
							"Jan", "Mar", "Jul", "Aug", "Oct", "Dec",
							"Jan.", "Mar.", "Jul.", "Aug.", "Oct.", "Dec."};
		String months30[] = {"4", "6", "9", "11",
							"April", "June", "September", "November",
							"Apr", "Jun", "Sept", "Nov",
							"Apr.", "Jun.", "Sept.", "Nov."};
		String february[] = {"February", "2", "Feb", "Feb."};
		
		while (true) {
			strMonth = JOptionPane.showInputDialog("Enter month:");
			if (strMonth==null) break;
			if (Arrays.asList(months31).contains(strMonth)) break;
			if (Arrays.asList(months30).contains(strMonth)) break;
			if (Arrays.asList(february).contains(strMonth)) break;
			JOptionPane.showMessageDialog(null, "Invalid month! Please enter again.");
		}
		if (strMonth==null) System.exit(0);
		
		while (true) {
			strYear = JOptionPane.showInputDialog("Enter year:");
			if (strYear==null) break;
			try {
				int intYear = Integer.parseInt(strYear);
				if (intYear>0) {
					year = intYear;
					break;
				} else JOptionPane.showMessageDialog(null, "Invalid year! Please enter again.");
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Invalid year! Please enter again.");
			}
		}
		if (strYear==null) System.exit(0);
		
		if (Arrays.asList(months31).contains(strMonth)) {
			JOptionPane.showMessageDialog(null, "This month has 31 days!");
		} else {
			if (Arrays.asList(february).contains(strMonth)) {
				if (year%4==0 && (year%100!=0 || year%400==0)) {
					JOptionPane.showMessageDialog(null, "This month has 29 days!");				
				} else {
					JOptionPane.showMessageDialog(null, "This month has 28 days!");
				}
			} else {
				JOptionPane.showMessageDialog(null, "This month has 30 days!");
			}
		}
	}
}
