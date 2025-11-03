package personnages;

import objets.Equipment;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0: "La force du coup doit etre positive";
		
		int forceAvant = force;
		
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			force = 0;
			parler("J'abandonne!");
		}
		assert force < forceAvant: "La force devrait avoir diminué";
		
		verifierInvariant();
	}

	@Override
	public String toString() {
		return nom;
	}
	
	
	
	
	private boolean isInvariantVerified() {
		return force >= 0;
	}
	
	private void verifierInvariant() {
		assert isInvariantVerified(): "Invariant violé: force négative";
	}
	
	

	private int getForce() {
		return force;
	}

	
	
	
	
	
	private Equipment[] equipments = 
			new Equipment[2];
	private int nbEquipment = 0;
	
	public void sEquiper(Equipment equipment) {
		
		switch (nbEquipment) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
			if (equipments[0]==equipment) {
				
				System.out.println("Le soldat " + nom + " possède un " + equipment + "!");
				
			} else {
				ajouterEquipment(equipment);
			}
			break;
		case 0: 
			ajouterEquipment(equipment);
			break;
		}
	}

	private void ajouterEquipment(Equipment equipment) {
		equipments[nbEquipment] = equipment;
		nbEquipment++;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + equipment + ".");
	}
	
	//TEST DE MINUS ET DE EQUIPEMENT
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		
		minus.recevoirCoup(2);
		
		System.out.println("Force de Mius après coup: " + minus.getForce());
		
		
		System.out.println(" Test de la méthode sEquiper ");
		
		minus.sEquiper(Equipment.CASQUE);
		
		minus.sEquiper(Equipment.CASQUE);
		
		minus.sEquiper(Equipment.BOUCLIER);
		
		minus.sEquiper(Equipment.CASQUE);
	}
	
	
}
