package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);

		asterix.parler("Bonjour Ob�lix.");
		obelix.parler("Bpnjour Asterix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui tr�s bonne id�e.");
	}
}
