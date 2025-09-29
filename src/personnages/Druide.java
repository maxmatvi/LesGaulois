package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	@Override
	public String toString() {
		return "Druide [nom=" + nom + "]";
	}
	
	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public void fabriquerPotion(int quantite , int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite +  " doses de potion magique. Elle a une force de " + forcePotion);
		
		
	}
	
	
}
