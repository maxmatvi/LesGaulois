package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public boolean resterPotion() {
	return quantitePotion>0;
	}
	
	public void remplirChaudron((int quantite , int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}
	
}
