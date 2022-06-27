package ex02;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
	
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
	
	/* 
	 * Sobreescritura de compareTo per tal de que el mètode sort ordeni primer per nom i després per puntuació
	 */
	@Override
	
	public int compareTo(Restaurant rest) {
		
		if (this.nom==rest.getNom()) {
			if(this.puntuacio==rest.puntuacio) return 0;
			else if(this.puntuacio>rest.puntuacio) return 1;
			else return -1;
		}
		return this.nom.compareTo(rest.getNom());
		
	}
	

}
