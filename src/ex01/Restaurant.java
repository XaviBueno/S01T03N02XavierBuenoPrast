package ex01;

import java.util.Objects;

public class Restaurant {
	
	private String nom;
	private int puntuacio;

	Restaurant(String nom, int puntuacio){
		
		this.nom=nom;
		this.puntuacio=puntuacio;
		
	}
	public String getNom() {
		return nom;
	}
	
	public int getPuntuacio() {
		return puntuacio;
	}
	
	/*Es sobreescriuen equals i hasCode ja que Java considera que dos objectes son diferents 
		si s'han fet en dues instàncies encara que tinguin els camps iguals*/
	
	@Override
	
	public boolean equals(Object rest) {
		
		Restaurant restaurant =(Restaurant)rest;
		
		return Objects.equals(nom, restaurant.nom)&& puntuacio==restaurant.puntuacio;
		
	}
	
	@Override
	 public int hashCode() {
		return Objects.hash(nom,puntuacio);
	}
	
	
/*	public boolean equals(Object r) {
		if(this.nom==r.nom) return true;
		else return false;
		
	}*/

}
