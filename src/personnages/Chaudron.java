package personnages;

public class Chaudron {
	private int nbDoses;
	private int forcePotion;
	
	public void remplirChaudron(int nbDoses, int forcePotion) {
		this.nbDoses = nbDoses;
		this.forcePotion = forcePotion;
	}
	
	public boolean resterPotion() {
		return nbDoses > 0;
	}
	
	public void utiliserDose() {
		if (nbDoses > 0) {
			nbDoses --;
		}
	}

}
