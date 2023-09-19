package crea_eat;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Restaurant restau = new Restaurant("Chez Akou", "12 rue Fermat");
		Livreur prometheus = new Livreur("Prometheus");
		restau.registerObserver(prometheus);
		
		Client iris = new Client("Iris", "15 rue Ferm");
		
		Plat plat = new Plat();
		List<Plat> plats = new ArrayList<>();
		
		iris.passerCommande(1, plats, restau);
		
//		restau.testPourAkou(restau.getCommandesEnAttenteDePreparation().get(0), 
//				restau.getCommandesEnAttenteDePreparation(), 
//				restau.getCommandesEnCoursDePreparation(), Etat.enCoursDePreparation,
//				"La commande : " + "");
		
		restau.preparerCommande();
		Commande commande = restau.getCommandesEnCoursDePreparation().get(0);
		restau.terminerLaPreparation(commande);
		
		iris.validerLivraison(commande);

	}

}
