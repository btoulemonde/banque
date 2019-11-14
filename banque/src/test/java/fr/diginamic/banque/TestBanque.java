package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte client1 = new Compte (123456789, 1458.25);
		
		//setter pour modifier numero compte
		client1.setNumeroCompte(1245678910);
		
		//getter pour modifier solde compte
		client1.setSoldeCompte(2458.25);
		
		System.out.println("numero compte client1: " + client1.getNumeroCompte());
		System.out.println("solde compte client1: " + client1.getSoldeCompte());
		
	}

}

