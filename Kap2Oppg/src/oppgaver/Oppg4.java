package oppgaver;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg4 {
	//dette programmet konverterer et beløp i USD til NOK, kursen er 8.95
	public static void main(String[] args) {
		String usdTxt = showInputDialog("Skriv inn en verdi USD her: ");
		double belop = Double.parseDouble(usdTxt);
		double konvertert = belop * 8.95;
		belop = (int)(konvertert*100 + 0.5)/100.0;
		
		String ut = "Beløpet blir: " + belop + " NOK";
		showMessageDialog(null, ut);
		
		
	}
	
}
