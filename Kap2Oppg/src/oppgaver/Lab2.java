package oppgaver;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Lab2 {

	public static void main(String[] args) {
		int sekunder = parseInt(showInputDialog("Skriv inn sekunder:"));
		double minutter = sekunder/60;
		int sekundRest = sekunder%60;
		int time = (int)minutter/60;
		int minuttRest = (int)minutter%60;
		
		String ut = time + ":" + minuttRest + ":" + sekundRest;
		showMessageDialog(null, ut);
		
		
	}

}
