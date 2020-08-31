package oblig1;

import static javax.swing.JOptionPane.*;

public class oppgave6 {

	public static void main(String[] args) {

		int heltall = Integer.parseInt(showInputDialog("Skriv heltall her: "));
		int n = heltall;
		int tall = 1;
		for (int i = 1; i <= heltall; i++) {
			tall = tall * n;
			n--;
		}
		System.out.print(tall);
	}
}