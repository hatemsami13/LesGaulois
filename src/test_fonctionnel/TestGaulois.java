package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);

		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bpnjour Asterix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui trés bonne idée.");
		
		Romain minus= new Romain("Minus", 6);
		
		System.out.println("Dans la foret " + asterix + " et " + obelix + " tombent nez à nez sur le romain " + minus.getNom() + ".");
	}
	
}
