import javax.swing.JOptionPane;
public class calculate{
	public static void main(String[] args){
		String strNum1, strNum2;

		strNum1 = JOptionPane.showInputDialog(null,
			"Please input the first number: ","Input the first number",
			JOptionPane.INFORMATION_MESSAGE);
		double num1=Double.parseDouble(strNum1);
		strNum2 = JOptionPane.showInputDialog(null,
			"Please input the second number: ","Input the second number",
			JOptionPane.INFORMATION_MESSAGE);
		double num2=Double.parseDouble(strNum2);

		if (num2==0){
			JOptionPane.showMessageDialog(null, "Sum: "+(num1+num2)+"\n"+
				"Difference: "+(num1-num2)+"\n"+
				"Product: "+(num1*num2)+"\n"+
				"Quotient: Cannot divide by zero!",
				"Results",
				JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Sum: "+(num1+num2)+"\n"+
				"Difference: "+(num1-num2)+"\n"+
				"Product: "+(num1*num2)+"\n"+
				"Quotient: "+(num1/num2),
				"Results",
				JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}
}
			