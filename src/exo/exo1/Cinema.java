package exo.exo1;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {

	private String nom;
	private String adresse;
	private List<Film> films = new ArrayList<>();
	private List<Seance> seances = new ArrayList<>();
	private List<Salle> salles = new ArrayList<>();
	
	public Cinema(String nom, String adresse, List<Salle> salles) {
		
		this.setNom(nom);
		this.setAdresse(adresse);
		this.salles = salles;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Film> getFilms() {
		return films;
	}
	
	public void addFilm(Film film) {
		this.films.add(film);
	}
	
	public void removeFilm(Film film) {
		this.films.remove(film);
	}

	public List<Seance> getSeances() {
		return seances;
	}
	
	public void addSeance(Seance seance) {
		this.seances.add(seance);
	}
	
	public void scheduleSeance(Film film, Date date, Time heure, Salle salle) {
		Seance elm = new Seance(film, date, heure, salle);
		this.seances.add(elm);
	}
	
	public List<Seance> getAllSeancesForFilmOnDate(Film film, Date date) {
		List<Seance> seancesForFilmOnDate = new ArrayList<>();
		for(Seance seance : this.seances) {
			if(seance.getDate().equals(date) && seance.getFilm() == film) {
				seancesForFilmOnDate.add(seance);
			}
		}
		return seancesForFilmOnDate;
	}

	public List<Salle> getSalles() {
		return salles;
	}
	
	public String toString() {
		String listDesSalles = "";
		for (Salle salle : this.salles) {
			if(salle.getName() != this.salles.get(this.salles.size()-1).getName()) {
				listDesSalles += salle.getName() + " - ";
			} else {
				listDesSalles += salle.getName();
			}
		}
		
		return "Nom du Cinéma : " + this.nom + "\nL'addresse : " + this.adresse + 
				"\nListe des salles : " + listDesSalles;
	}

}
