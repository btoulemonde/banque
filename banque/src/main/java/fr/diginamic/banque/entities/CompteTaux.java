package fr.diginamic.banque.entities;

public class CompteTaux extends Compte {

	private double tauxRemuneration;

	public CompteTaux(String numeroCompte, double soldeCompte, double tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}

	public String toString() {

		String infoCompte = super.toString()  ;
		return infoCompte + " "+ tauxRemuneration;
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
