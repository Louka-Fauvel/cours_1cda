package exo.exo1;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Seance {

	private Film film;
	private Date date;
	private Time heure;
	private Salle salle;
	private List<Reservation> reservations = new ArrayList<>();
	
	public Seance(Film film, Date date, Time heure, Salle salle) {
		
		this.setFilm(film);
		this.setDate(date);
		this.setHeure(heure);
		this.setSalle(salle);
		
	}
	
	public void initialiserPlaces() {
		
		for(Place place : this.salle.getPlaces()) {
			place.setIsDisponible(this, true);
		}
		
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getHeure() {
		return heure;
	}

	public void setHeure(Time heure) {
		this.heure = heure;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}
	
	public void addReservation(Reservation reservation) {
		this.reservations.add(reservation);
	}
	
	public boolean isFull() {
		if(this.salle.getPlaces().size() == this.reservations.size()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "";
	}

}
