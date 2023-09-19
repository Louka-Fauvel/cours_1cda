package exo.restoration;

public class Main {

	public static void main(String[] args) {
		
		Plat crepeChevreMiel = new Plat("Crêpe chèvre miel", 9.0);
		Plat crepeSavoyarde = new Plat("Crêpe savoyarde", 9.9);
		
		Client akou = new Client("Akou", "Velfau", "12 rue Fermat, 14000 Caen", "0674018434");
		Client iris = new Client("Iris", "Sheeban", "12 rue Fermat, 14000 Caen", "0774340184");
		
		System.out.println(akou);
		System.out.println("");
		System.out.println(iris);
		
		Restaurant crepeGaby = new Restaurant("Crêperie Gaby", "21 Rue Prte au Berger, 14000 Caen");
		crepeGaby.ajouterPlat(crepeChevreMiel);
		crepeGaby.ajouterPlat(crepeSavoyarde);
		
		System.out.println("");
		System.out.println(crepeGaby);
		
		Livreur prometheus = new Livreur("Prometheus", "Alpha", "Scooter");
		
		System.out.println("");
		System.out.println(prometheus);
		
		Commande commandeAkou = new Commande(akou, crepeGaby, prometheus);
		
		commandeAkou.ajouterPlat(crepeChevreMiel);
		commandeAkou.ajouterPlat(crepeSavoyarde);
		
		System.out.println("");
		System.out.println(commandeAkou);
		
		System.out.println("");
		prometheus.livrerCommande(commandeAkou);
		
		commandeAkou.setCommandee(true);
		
		prometheus.livrerCommande(commandeAkou);

	}

}
