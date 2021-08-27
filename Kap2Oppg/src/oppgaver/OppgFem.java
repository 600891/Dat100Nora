package oppgaver;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgFem {

	public static void main (String[] args) {
		String numberTxt = showInputDialog("Write a whole number between 0 and 1000");
		int number = parseInt(numberTxt);
		if(number > 0 && number < 1000) {
			int lastNum = number%10;
			int secondNum = number/10;
			int firstNum = secondNum/10;
			secondNum = secondNum%10;
			int digitSum = firstNum + secondNum + lastNum;
			String ut = "The digit sum of your number is: " + digitSum;
			showMessageDialog(null, ut);
		}
		else {
			numberTxt = showInputDialog("Write a whole number between 0 and 1000");
		}
	}
}
