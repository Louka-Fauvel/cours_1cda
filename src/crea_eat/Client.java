package crea_eat;

import java.util.List;

import crea_eat.Commande.Etat;

public class Client {

	private String name;
	private String address;
	
	public Client(String name, String address) {
		
		this.setName(name);
		this.setAddress(address);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void passerCommande(int id, List<Plat> plats, Restaurant restaurant) {
		
		Commande commande = new Commande(id, this, restaurant, plats);
		restaurant.recoitNouvelleCommande(commande);
		
	}
	
	public void seFaireNotifier(String message) {
		System.out.println(this.name + "reçoit le message : " + message);
	}
	
	public void validerLivraison(Commande commande) {
		System.out.println("La commande " + commande.getId() + " est arrivée");
		commande.setEtat(Etat.livree);
	}

}
