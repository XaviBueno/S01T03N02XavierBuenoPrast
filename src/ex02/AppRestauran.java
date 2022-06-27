package ex02;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;


public class AppRestauran {

	public static void main(String[] args) {
		
		HashSet<Restaurant> restaurants= new HashSet<Restaurant>();
		
		restaurants.add(new Restaurant("La Torrada",5));
		restaurants.add(new Restaurant("Pepe",5));
		restaurants.add(new Restaurant("Nuria",5));
		restaurants.add(new Restaurant("La Torrada",5));
		restaurants.add(new Restaurant("Pepe",5));
		restaurants.add(new Restaurant("Pepe",7));
		restaurants.add(new Restaurant("Canigó",9));
		restaurants.add(new Restaurant("Visca",1));
		restaurants.add(new Restaurant("Gràcia",6));

		restaurants.add(new Restaurant("La Torrada",10));
		restaurants.add(new Restaurant("Pepe",11));
		restaurants.add(new Restaurant("Nuria",40));
		restaurants.add(new Restaurant("La Torrada",50));
		restaurants.add(new Restaurant("Pepe",60));
		restaurants.add(new Restaurant("Pepe",70));
		restaurants.add(new Restaurant("Canigó",80));
		restaurants.add(new Restaurant("Visca",90));
		restaurants.add(new Restaurant("Gràcia",90));

		restaurants.add(new Restaurant("La Torrada",5));
		restaurants.add(new Restaurant("Pepe",5));
		restaurants.add(new Restaurant("Nuria",5));
		restaurants.add(new Restaurant("La Torrada",5));
		restaurants.add(new Restaurant("Pepe",5));
		restaurants.add(new Restaurant("Pepe",7));
		restaurants.add(new Restaurant("Canigó",9));
		restaurants.add(new Restaurant("Visca",1));
		restaurants.add(new Restaurant("Gràcia",6));
		
		restaurants.add(new Restaurant("La Torrada",10));
		restaurants.add(new Restaurant("Pepe",11));
		restaurants.add(new Restaurant("Nuria",40));
		restaurants.add(new Restaurant("La Torrada",50));
		restaurants.add(new Restaurant("Pepe",60));
		restaurants.add(new Restaurant("Pepe",70));
		restaurants.add(new Restaurant("Canigó",80));
		restaurants.add(new Restaurant("Visca",90));
		restaurants.add(new Restaurant("Gràcia",90));
		
		 //ES PASA A UN ARRAYLIST EL HASHSET, JA QUE UN HASHSET NO ES POT ORDENAR
		 ArrayList<Restaurant> arrayRest=new ArrayList<Restaurant>(restaurants);
		 
		 //ES LLISTA PER PANTALLA EL HASHSET (DESORDENAT)
		 System.out.println("DESORDENATS");
		 Iterator<Restaurant> it =restaurants.iterator();
		 while(it.hasNext()) {
			 Restaurant rest=it.next();
			 System.out.println("Nom:"+rest.getNom()+"   Punts:"+rest.getPuntuacio());
			 
			 
		 }
		 //ORDENA L'ARRAYLIST SEGONS LA NOVA IMPLEMENTACIÓ DE COMPARETO
		 Collections.sort(arrayRest);
		 
		 //LLISTA L'ARRAYLIST JA ORDENAT
		 System.out.println("ORDENATS");
		 Iterator<Restaurant> it2 =arrayRest.iterator();
		  while(it2.hasNext()) {
			 Restaurant mirest=it2.next();
			 System.out.println("Nom:"+mirest.getNom()+"   Punts:"+mirest.getPuntuacio());
			 
		 }
		 
		
		
	}
	
/*	static void afegirRestaurant(Restaurant restaurant,HashSet<Restaurant> restaurants) {
		
		restaurants.add(restaurant);
		
	}*/
	
static void afegirRestaurant(String restaurant,HashSet<String> restaurants) {
		
		restaurants.add(restaurant);
		
	}

}
