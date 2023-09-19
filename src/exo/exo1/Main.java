package exo.exo1;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		List<Place> places = new ArrayList<>();
		List<Salle> salles = new ArrayList<>();
		
		String[] tabP = {"A", "B", "C", "D"};
		for (int i = 1; i < 10; i++) {
			for (String str : tabP) {
				places.add(new Place(str+i));
			}
		}
		
		Salle salle1 = new Salle("Salle 1", places);
		Salle salle2 = new Salle("Salle 2", places);
		
		salles.add(salle1);
		salles.add(salle2);
		
		Cinema cinema = new Cinema("Pathé", "123 rue de Paris", salles);
		System.out.println(cinema);
		
		Film inception = new Film("Inception", "Film de science fiction", 2011);
		cinema.addFilm(inception);
		Film titanic = new Film ("Titanic", "Film romantique", 1999);
		cinema.addFilm(titanic);
		
		Seance s1 = new Seance(inception, today, new Time(20, 55, 00), salle1);
		Seance s2 = new Seance(inception, today, new Time(22, 00, 00), salle1);
		Seance s3 = new Seance(titanic, today, new Time(19, 55, 00), salle2);
		Seance s4 = new Seance(titanic, today, new Time(23, 00, 00), salle2);
		s1.initialiserPlaces();
		s2.initialiserPlaces();
		s3.initialiserPlaces();
		s4.initialiserPlaces();
		
		cinema.addSeance(s1);
		cinema.addSeance(s2);
		cinema.addSeance(s3);
		cinema.addSeance(s3);
		
		System.out.println("");
		System.out.println(cinema.getSeances().size());
		
		System.out.println("");
		List<Seance> seancesChoisis = cinema.getAllSeancesForFilmOnDate(titanic, today);
		Seance seanceChoisie = seancesChoisis.get(0);
		
		Client akou = new Client("Akou", "Velfau", "akou.velfau@gmail.com");
		Client iris = new Client("Iris", "Sheeban", "iris@gmail.com");
		
		Place placeChoisie = seanceChoisie.getSalle().getPlaceParNumero("B3");
		
		Reservation reservation = akou.reserve(seanceChoisie, placeChoisie);
		if(reservation == null) {
			System.out.println("Séance complet !");
		} else {
			System.out.println(reservation);
		}
//		
//		Reservation res2 = iris.reserve(seancesChoisis.get(0), places.get(0));
//		if(res2 == null) {
//			System.out.println("Séance complet !");
//		} else {
//			System.out.println(res2);
//		}
//		
//		for (int i = 0; i < seancesChoisis.get(1).getSalle().getPlaces().size(); i++) {
//			iris.reserve(seancesChoisis.get(1));
//		}
//		Reservation res3 = iris.reserve(seancesChoisis.get(1));
//		if(res3 == null) {
//			System.out.println("Séance complet !");
//		} else {
//			System.out.println(res3);
//		}

	}

}
