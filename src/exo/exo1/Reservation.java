package exo.exo1;

public class Reservation {

	private Client client;
	private Seance seance;
	private Place place;
	
	public Reservation(Client client, Seance seance, Place place) {
		
		this.setClient(client);
		this.setSeance(seance);
		this.setPlace(place);
		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
	
	public String toString() {
		return client.getFirstname() + " " + this.client.getLastname() + 
				" - " + this.seance.getFilm().getNom() + " - " + this.seance.getSalle().getName() + 
				" : " + this.place.getNumero();
	}

}
