package oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

//regner ut arealet av et rektangel
public class OppgTo {
	public static void main(String[] args) {
		String lengdeTxt = showInputDialog("Lengden p� rektangelet i cm");
		String breddeTxt = showInputDialog("Bredden p� rektangelet i cm");
		int lengde = parseInt(lengdeTxt);
		int bredde = parseInt(breddeTxt);
		int areal = lengde * bredde;
		String utTxt = "Arealet er " + areal + " cm.";
		showMessageDialog(null, utTxt);
	}
}
