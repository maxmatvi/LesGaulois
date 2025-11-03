package objets;

public enum Equipment {
	CASQUE("casque"),
	BOUCLIER("bouclier");
	
	
	private String nom;
	
	private Equipment(String nom) {
		this.nom = nom; 
	}
	
	
	public String toString() {
		
		return nom;
	}
	
}