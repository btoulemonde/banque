package fr.diginamic.banque.entities;

public class Debit extends Operation {

	public Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
	}
	
	public String afficherType() {
		return "débit";
	}
}
