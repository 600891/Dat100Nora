package oppgaver;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgSeks {
	public static void main (String[] args) {
		int number1 = parseInt(showInputDialog("Enter your first number:"));
		int number2 = parseInt(showInputDialog("Enter your second number:"));
		int number3 = parseInt(showInputDialog("Enter your third number:"));
		int number4 = parseInt(showInputDialog("Enter your fourth number:"));
		int smallest1 = Math.min(number1, number2);
		int smallest2 = Math.min(number3, number4);
		int smallest = Math.min(smallest1, smallest2);
		String out = "The smallest of the given numbers: " + smallest;
		showMessageDialog(null,out);
		
	}
}
