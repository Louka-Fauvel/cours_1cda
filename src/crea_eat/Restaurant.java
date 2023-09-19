package crea_eat;

import java.util.ArrayList;
import java.util.List;

import crea_eat.Commande.Etat;

public class Restaurant extends Subject {

	private String name;
	private String address;
	private List<Commande> commandesEnAttenteDePreparation = new ArrayList<>();
	private List<Commande> commandesEnCoursDePreparation = new ArrayList<>();
	private List<Commande> commandesEnAttenteDeLivraison = new ArrayList<>();
	
	public Restaurant(String name, String address) {
		
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
	
	public List<Commande> getCommandesEnAttenteDePreparation() {
		return commandesEnAttenteDePreparation;
	}

	public List<Commande> getCommandesEnCoursDePreparation() {
		return commandesEnCoursDePreparation;
	}

	public List<Commande> getCommandesEnAttenteDeLivraison() {
		return commandesEnAttenteDeLivraison;
	}

	public void recoitNouvelleCommande(Commande commande) {
		this.commandesEnAttenteDePreparation.add(commande);
		System.out.println(this.name + " reçoit une nouvelle commande : " + commande.getId());
	}
	
	public void preparerCommande() {
		Commande commande = this.commandesEnAttenteDePreparation.remove(0);
		this.commandesEnCoursDePreparation.add(commande);
		commande.setEtat(Etat.enCoursDePreparation);
		commande.getClient().seFaireNotifier("La commande : " + commande.getId() + " est en cours de préparation");
	}
	
	public void preparerCommandePrioritaire(Commande commande) {
		this.commandesEnAttenteDePreparation.remove(commande);
		this.commandesEnCoursDePreparation.add(commande);
		commande.setEtat(Etat.enCoursDePreparation);
		commande.getClient().seFaireNotifier("La commande : " + commande.getId() + " est en cours de préparation");
	}
	
	public void terminerLaPreparation(Commande commande) {
		this.commandesEnCoursDePreparation.remove(commande);
		this.commandesEnAttenteDeLivraison.add(commande);
		commande.setEtat(Etat.enAttenteDeLivraison);
		this.notifyObserver(commande);
		commande.getClient().seFaireNotifier("La commande : " + commande.getId() + " est prête et en attente de livraison");
	}
	
	public void testPourAkou(Commande commande, List<Commande> listSource, List<Commande> listDestination, Etat etat, String message) {
		listSource.remove(commande);
		listDestination.add(commande);
		commande.setEtat(etat);
	}

}
