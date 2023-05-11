package TP3;

import java.lang.annotation.Retention;

public class Livre {
	
	private int numLivre; 
	private String titre ;
	private String auteur;
	private double prix;
	
	public Livre(double prix, String titre, int numLivre) {
		this.numLivre = numLivre;
		this.prix = prix;
		this.titre = titre;
	}
	
	public int getNumLivr() {
		return numLivre;
		
	}
	public double getPrix( ) {
		return prix;
		
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String toString() {
		return this.titre;
		
	}	
	
}
	

