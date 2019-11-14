package fr.diginamic.banque.entities;

public class CompteTaux extends Compte {
	
	private double tauxRemuneration;
	
	public CompteTaux(String numeroCompte, double soldeCompte, double tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	
	public String toString (){
		
		String idCompte = super.toString();
		return idCompte + "taux de rémunération: " + tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	
	

}
