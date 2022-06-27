package ex01;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class AppRestauran {

	public static void main(String[] args) {
		
		HashSet<Restaurant> restaurants= new HashSet<Restaurant>();
		
		
	
		 restaurants.add(new Restaurant("Pepe",5));
		 restaurants.add(new Restaurant("Nuria",5));
		 restaurants.add(new Restaurant("La Torrada",5));
		 restaurants.add(new Restaurant("Pepe",5));
		 restaurants.add(new Restaurant("Pepe",7));
		 restaurants.add(new Restaurant("Canigó",9));
		 restaurants.add(new Restaurant("Visca",1));
		 restaurants.add(new Restaurant("Gràcia",6));
		 restaurants.add(new Restaurant("La Torrada",5));
		 
		
		 ArrayList<Restaurant> restaurant=new  ArrayList<Restaurant>(restaurants);
		
		 Iterator<Restaurant> it =restaurants.iterator();
		 while(it.hasNext()) {
			 Restaurant rest=it.next();
			 System.out.println("Nom:"+rest.getNom()+"   Punts:"+rest.getPuntuacio());
			 
			 
		 }
		 
		 
		
		
	}
	
/*	static void afegirRestaurant(Restaurant restaurant,HashSet<Restaurant> restaurants) {
		
		restaurants.add(restaurant);
		
	}*/
	
static void afegirRestaurant(String restaurant,HashSet<String> restaurants) {
		
		restaurants.add(restaurant);
		
	}

}
