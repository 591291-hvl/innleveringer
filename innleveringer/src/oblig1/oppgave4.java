package oblig1;

import static javax.swing.JOptionPane.*;

public class oppgave4 {
	public static void main(String[] args) {

		int inntekt = Integer.parseInt(showInputDialog("Skriv inn inntekt her: "));

		int tr1 = 164100;
		int tr2 = 230950;
		int tr3 = 580650;
		int tr4 = 934050;
		double utTxt = 0.0;

		// Vet det ikke er sånn man regner ut skatt, men jeg er altfor dum til å forstå
		// hvordan man skal regne det ut
		// Har fått det forklart flere ganger, og har sett hva folk har gjort, men
		// fortstår det ikke
		// Programmering kunnskapen er ikke det som holder meg tilbake denne gangen:)

		if (inntekt < tr1) {
			showMessageDialog(null, "Du skal ikke betale skatt");
		} else if (inntekt < tr2) {

			utTxt = inntekt * 0.0093;
			showMessageDialog(null, "Din brutto inntekt er: " + (utTxt));
		} else if (inntekt < tr3) {

			utTxt = inntekt * 0.0241;
			showMessageDialog(null, "Din brutto inntekt er: " + (utTxt));
		} else if (inntekt < tr4) {

			utTxt = inntekt * 0.1152;
			showMessageDialog(null, "Din brutto inntekt er: " + (utTxt));
		} else {

			utTxt = inntekt * 0.1452;
			showMessageDialog(null, "Din brutto inntekt er: " + (utTxt));
		}

	}
}