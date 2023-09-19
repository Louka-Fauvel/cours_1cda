package crea_eat;

import crea_eat.Commande.Etat;

public class Livreur implements Observer {

	private String name;
	
	public Livreur(String name) {
		
		this.setName(name);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void recupererCommande(Commande commande) {
		commande.getClient().seFaireNotifier("La commande " + commande.getId() + 
							" est cours de livraison par " + this.name);
		commande.setEtat(Etat.enCoursDeLivraison);
	}
	
	public void livrerCommande(Commande commande) {
		commande.getClient().seFaireNotifier("La commande " + commande.getId() + 
							" est cours de livraison par " + this.name);
		commande.setEtat(Etat.enCoursDeLivraison);
	}

	@Override
	public void notifier(Object data) {
		Restaurant restau = ((Commande)data).getRestaurant();
		this.recupererCommande((Commande)data);
		
	}

}
