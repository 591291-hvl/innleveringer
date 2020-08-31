package oblig1;

import static javax.swing.JOptionPane.*;

public class oppgave5 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int tall = Integer.parseInt(showInputDialog("Oppgi karakter: "));
			if (tall > 100 || tall < 0) {
				showMessageDialog(null, "Verdi ikke gyldig");
				i--;
			} else {
				if (tall >= 90) {
					showMessageDialog(null, "Karakteren din er A");
				} else if (tall >= 80) {
					showMessageDialog(null, "Karakteren din er B");
				} else if (tall >= 60) {
					showMessageDialog(null, "Karakteren din er C");
				} else if (tall >= 50) {
					showMessageDialog(null, "Karakteren din er D");
				} else if (tall >= 40) {
					showMessageDialog(null, "Karakteren din er E");
				} else {
					showMessageDialog(null, "Karakteren din er F");
				}
			}
		}
	}
}