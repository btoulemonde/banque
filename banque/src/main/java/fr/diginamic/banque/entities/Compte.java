package fr.diginamic.banque.entities;

public class Compte {

	private String numeroCompte;
	private double soldeCompte;

	public Compte(String numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;

	}
	//retourne numero et solde compte
	public String toString () {
		return numeroCompte + " " + soldeCompte + " €";
	}
 
	// getters et setters
	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

}
