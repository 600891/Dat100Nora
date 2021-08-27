package oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

// adderer to heltall

public class OppgEn {
	public static void main(String[] args) {
		String tallTxtEn = showInputDialog("Gi det første heltallet:");
		String tallTxtTo = showInputDialog("Gi det andre heltallet:");
		int tallEn = parseInt(tallTxtEn);
		int tallTo = parseInt(tallTxtTo);
		int resultat = tallEn + tallTo;
		String utTxt = "Svar: " + resultat;
		showMessageDialog(null, utTxt);
	}
}
