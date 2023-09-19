package exo.restoration;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	
	private String name;
	private String address;
	private List<Plat> plats = new ArrayList<>();

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

	public List<Plat> getPlats() {
		return plats;
	}
	
	public void ajouterPlat(Plat plat) {
		this.plats.add(plat);
	}

	@Override
	public String toString() {
		
		String lesPlats = "";
		for (Plat plat : plats) {
			lesPlats += "\n- " + plat.getName() + " (" + plat.price + " €)" ;
		}
		
		return "Nom du restaurant : " + this.name + "\n" +
				"Adresse : " + this.address + "\n" +
				"Les plats : " + lesPlats;
		
	}

}
