package oppgaver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgTre {
	public static void main (String[] args) {
		String radiusTxt = showInputDialog ("Hva er radius i sirkelen?");
		double radius = Double.parseDouble(radiusTxt);
		double r2 = radius * radius;
		double pi = 3.14;
		double areal = r2*pi;
		int arealHeltall = (int)(areal + 0.5);
		
		String ut = "Arealet i sirkelen med " + radius + " i radius, er: " + arealHeltall;
		
		showMessageDialog(null, ut);
		
		
	}

}
