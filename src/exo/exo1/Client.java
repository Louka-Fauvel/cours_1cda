package exo.exo1;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String firstname;
	private String lastname;
	private String email;
	private List<Reservation> reservations = new ArrayList<>();
	
	public Client(String firstname, String lastname, String email) {
		
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setEmail(email);
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}
	
	public Reservation reserve(Seance seance, Place place) {
		if(!seance.isFull()) {
			if(place.isDisponible(seance)) {
				
				place.setIsDisponible(seance, false);
				Reservation reservation = new Reservation(this, seance, place);
				seance.addReservation(reservation);
				this.reservations.add(reservation);
				return reservation;
				
			} else {
				System.out.println("Cette place n'est plus disponible");
				return null;
			}
		}
		return null;
	}
}
