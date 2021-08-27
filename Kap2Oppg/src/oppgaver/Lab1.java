package oppgaver;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Lab1 {
	public static void main (String[] args) {
		int day = parseInt(showInputDialog("Please input the desired day: "));
		int month = parseInt(showInputDialog("Please input the desired month:"));
		int year = parseInt(showInputDialog("Please input the desired year:"));
		String date = day + "." + month + "." + year;
		showMessageDialog(null, date);
	}
}
