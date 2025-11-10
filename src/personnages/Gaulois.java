package personnages;

import objets.Equipment;

public class Gaulois {
	private String nom;
	//private int force;
	private int effetPotion = 1;
	private Village village;
	
	//Changements TP3 POO 
	
	private int force;
	private int nbtrophees;
	private Equipment trophees[] = new Equipment[100];
	
	//Changements TP3 POO , FIN

	
	
	
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

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	
	
	//Changements TP3 POO 
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " +
	romain.getNom());
		Equipment[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
	nbtrophees++) {
			this.trophees[nbtrophees] = trophees[i];
		}
		
	}
	
	//Changements TP3 POO , FIN
	
	
	
	@Override
	public String toString() {
		return nom;
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		int forceCoup = (force*effetPotion)/3;
//		romain.recevoirCoup(forceCoup);
//		
//		if (effetPotion>1) {
//			effetPotion--;
//		}
//	}

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
