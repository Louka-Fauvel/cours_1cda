package crea_eat;

import java.util.List;

public class Commande {

	private int id;
	private Client client;
	private Restaurant restaurant;
	private List<Plat> plats;
	private Etat etat;
	
	public Commande(int id, Client client, Restaurant restaurant, List<Plat> plats) {
		this.setId(id);
		this.setClient(client);
		this.setRestaurant(restaurant);
		this.setPlats(plats);
		this.setEtat(Etat.enAttenteDePreparation);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Plat> getPlats() {
		return plats;
	}

	public void setPlats(List<Plat> plats) {
		this.plats = plats;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public enum Etat {
		enAttenteDePreparation,
		enCoursDePreparation,
		enAttenteDeLivraison,
		enCoursDeLivraison,
		livree
	}

}
