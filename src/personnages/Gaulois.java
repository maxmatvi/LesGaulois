package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);

	}

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		;
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return nom;
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		int forceCoup = (force*effetPotion)/3;
		romain.recevoirCoup(forceCoup);
		
		if (effetPotion>1) {
			effetPotion--;
		}
	}

	void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public void setVillage(Village village) {
		this.village = village;
		
	}
	
	public void SePresenter() {
		if (village != null && village.getChef() == this) {
			
			parler("Bonjour , je m'appelle " + nom + ". Je suis le chef du village " + village.getNom() + ".");
		} else if (village != null) {
			parler("Bonjour , je m'appelle " + nom + ". Je suis dans le village " + village.getNom() + ".")
			
		} else {
			parler("Bonjour , je m'appelle " + nom + ". Je voyage de villages en villages")
			
		}
			
	}

}
