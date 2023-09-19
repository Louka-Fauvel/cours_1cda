package exo.exo1;

import java.util.ArrayList;
import java.util.List;

public class Salle {

	private String name;
	private List<Place> places = new ArrayList<>();
	
	public Salle(String name, List<Place> places) {
		
		this.setName(name);
		this.setPlaces(places);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}
	
	public Place getPlaceParNumero(String numero) {
		for(Place place : this.places) {
			if(place.getNumero().equals(numero)) {
				return place;
			}
		}
		return null;
	}

}
