package exo.restoration;

public class Livreur extends Personne implements Observer {

	private String transport;
	
	public Livreur(String firsname, String lastname, String transport) {
		super(firsname, lastname);
		
		this.setTransport(transport);
		
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}
	
	public void livrerCommande(Commande commande) {
		if(commande.getLivreur() == this) {
			commande.setLivree(true);
		} else {
			System.out.println("Cette commande n'est pas assignée au livreur");
		}
	}
	
	@Override
	public String toString() {
		return "Prénom Nom : " + this.getFirstname() + " " + this.getLastname() + "\n" +
				"Transport : " + this.transport;
	}

	@Override
	public void notifier(Object data, Object data2) {
		
		if((boolean)data && (boolean)data2) {
			
			System.out.println("Livrée");
			
		} else if((boolean)data && !(boolean)data2) {
			
			System.out.println("Pas encore livrée");
			
		} else if(!(boolean)data && !(boolean)data2 || !(boolean)data && (boolean)data2) {
			
			System.out.println("La commande n'est pas terminée");
			
		}
		
	}

}
