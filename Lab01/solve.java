import javax.swing.JOptionPane;
public class solve{
	public static void main(String[] args){
		String strA1, strB1,
			strA2, strB2, strC2, strD2, strE2, strF2,
			strA3, strB3, strC3, strOption;

		strOption=JOptionPane.showInputDialog(null,"The first-degree equation with one variable: (1) \n"+
			"The system of first-degree equations with two variables: (2) \n"+
			"The second-degree equation with one variable: (3)",
			"Select an option",
			JOptionPane.INFORMATION_MESSAGE);

		if (strOption==null) {
			System.exit(0);
		}
		int option=Integer.parseInt(strOption);

		switch(option){
			case 1:
				strA1=JOptionPane.showInputDialog(null,"Enter a: ",
				"a.x + b = 0",
				JOptionPane.INFORMATION_MESSAGE);
				if (strA1==null){
					System.exit(0);
				}
				double a1=Double.parseDouble(strA1);

				strB1=JOptionPane.showInputDialog(null,"Enter b: ",
				"a.x + b = 0",
				JOptionPane.INFORMATION_MESSAGE);
				if (strB1==null){
					System.exit(0);
				}
				double b1=Double.parseDouble(strB1);

				if (a1==0){
					if (b1==0){
						JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions",
							"Result", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "The equation has no solution",
							"Result", JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
						JOptionPane.showMessageDialog(null, "x =  "+(-b1/a1),
							"Result", JOptionPane.INFORMATION_MESSAGE);
				}
				System.exit(0);

			case 2:
				strA2=JOptionPane.showInputDialog(null,"Enter a: ",
				"a.x + b.y = c and d.x + e.y = f",
				JOptionPane.INFORMATION_MESSAGE);
				if (strA2==null){
					System.exit(0);
				}
				double a2=Double.parseDouble(strA2);

				strB2=JOptionPane.showInputDialog(null,"Enter b: ",
				"a.x + b.y = c and d.x + e.y = f",
				JOptionPane.INFORMATION_MESSAGE);
				if (strB2==null){
					System.exit(0);
				}
				double b2=Double.parseDouble(strB2);

				strC2=JOptionPane.showInputDialog(null,"Enter c: ",
				"a.x + b.y = c and d.x + e.y = f",
				JOptionPane.INFORMATION_MESSAGE);
				if (strC2==null){
					System.exit(0);
				}
				double c2=Double.parseDouble(strC2);

				strD2=JOptionPane.showInputDialog(null,"Enter d: ",
				"a.x + b.y = c and d.x + e.y = f",
				JOptionPane.INFORMATION_MESSAGE);
				if (strD2==null){
					System.exit(0);
				}
				double d2=Double.parseDouble(strD2);

				strE2=JOptionPane.showInputDialog(null,"Enter e: ",
				"a.x + b.y = c and d.x + e.y = f",
				JOptionPane.INFORMATION_MESSAGE);
				if (strE2==null){
					System.exit(0);
				}
				double e2=Double.parseDouble(strE2);

				strF2=JOptionPane.showInputDialog(null,"Enter f: ",
				"a.x + b.y = c and d.x + e.y = f",
				JOptionPane.INFORMATION_MESSAGE);
				if (strF2==null){
					System.exit(0);
				}
				double f2=Double.parseDouble(strF2);

				double D=a2*e2-b2*d2;
				double Dx=c2*e2-f2*b2;
				double Dy=a2*f2-d2*c2;

				if (D!=0){
					JOptionPane.showMessageDialog(null, "x =  "+(Dx/D)+"\n"+"y = "+(Dy/D),
							"Result", JOptionPane.INFORMATION_MESSAGE);
				} else if (Dx==0 && Dy==0){
					JOptionPane.showMessageDialog(null, "The system of equations has infinitely many solutions",
							"Result", JOptionPane.INFORMATION_MESSAGE); 
				} else {
					JOptionPane.showMessageDialog(null, "The system of equations has no solution",
							"Result", JOptionPane.INFORMATION_MESSAGE);
				}
				System.exit(0);

			case 3:
				strA3=JOptionPane.showInputDialog(null,"Enter a: ",
				"a.x^2 + b.x + c = 0",
				JOptionPane.INFORMATION_MESSAGE);
				if (strA3==null){
					System.exit(0);
				}
				double a3=Double.parseDouble(strA3);

				strB3=JOptionPane.showInputDialog(null,"Enter b: ",
				"a.x^2 + b.x + c = 0",
				JOptionPane.INFORMATION_MESSAGE);
				if (strB3==null){
					System.exit(0);
				}
				double b3=Double.parseDouble(strB3);

				strC3=JOptionPane.showInputDialog(null,"Enter c: ",
				"a.x^2 + b.x + c = 0",
				JOptionPane.INFORMATION_MESSAGE);
				if (strC3==null){
					System.exit(0);
				}
				double c3=Double.parseDouble(strC3);

				if (a3==0){
					if (b3==0){
						if (c3==0){
							JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions",
								"Result", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "The equation has no solution",
								"Result", JOptionPane.INFORMATION_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "The equation has one root: x =  "+(-c3/b3),
							"Result", JOptionPane.INFORMATION_MESSAGE);
					}
					System.exit(0);
				}

				double delta=b3*b3-4*a3*c3;

				if (delta<0) {
					JOptionPane.showMessageDialog(null, "The equation has no solution",
							"Result", JOptionPane.INFORMATION_MESSAGE);
				} else if (delta==0) {
					JOptionPane.showMessageDialog(null, "The equation has a double root: x = "+(-b3/(2*a3)),
							"Result", JOptionPane.INFORMATION_MESSAGE);
				} else {
					double x1=(-b3+Math.sqrt(delta))/(2*a3);
					double x2=(-b3-Math.sqrt(delta))/(2*a3);

					JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\n" + "x2 = " + x2,
							"Result", JOptionPane.INFORMATION_MESSAGE);
				}
				System.exit(0);
		}
	}
}
			