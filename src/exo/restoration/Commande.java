package exo.restoration;

import java.util.ArrayList;
import java.util.List;

public class Commande extends Subject {

	private Client client;
	private Restaurant restaurant;
	private Livreur livreur;
	private List<Plat> plats = new ArrayList<>();
	private boolean commandee = false;
	private boolean livree = false;
	
	public Commande(Client client, Restaurant restaurant, Livreur livreur) {
		
		this.setClient(client);
		this.setRestaurant(restaurant);
		this.setLivreur(livreur);
		this.registerObserver(livreur);
		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Livreur getLivreur() {
		return livreur;
	}

	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}
	
	public List<Plat> getPlats() {
		return plats;
	}

	public boolean isCommandee() {
		return commandee;
	}

	public void setCommandee(boolean commandee) {
		this.commandee = commandee;
	}

	public boolean isLivree() {
		return livree;
	}

	public void setLivree(boolean livree) {
		if(this.commandee && livree) {
			
			this.livree = livree;
			notifyObserver(true, true);
			
		} else if(this.commandee && !livree) {
			
			notifyObserver(true, false);
			
		} else if(!this.commandee && !livree || !this.commandee && livree) {
			
			notifyObserver(false, false);
			
		}
	}

	public void ajouterPlat(Plat plat) {
		this.plats.add(plat);
	}
	
	public double calculerTotal() {
		double priceTotal = 0.0;
		for (Plat plat : plats) {
			priceTotal += plat.price;
		}
		return priceTotal;
	}

	@Override
	public String toString() {
		
		String lesPlats = "";
		for (Plat plat : plats) {
			lesPlats += "\n- " + plat.getName() + " (" + plat.price + " €)" ;
		}
		
		return "Restaurant : " + this.restaurant.getName() + "\n" +
				"Adresse du restaurant : " + this.restaurant.getAddress() + "\n" +
				"Client : " + this.client.getFirstname() + " " + this.client.getLastname() + "\n" +
				"Livreur : " + this.livreur.getFirstname() + " " + this.livreur.getLastname() + "\n" +
				"Les plats : " + lesPlats + "\nTotal : " + this.calculerTotal() + " €";
		
	}

}
