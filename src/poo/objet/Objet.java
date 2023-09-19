package poo.objet;

import java.util.ArrayList;
import java.util.List;

public class Objet {

	private String name;
	private String magie;
	private String categorie;
	private List<String> materiaux = new ArrayList<>();
	
	public Objet(String name, String magie, String categorie) {
		this.name = name;
		this.magie = magie;
		this.categorie = categorie;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMagie() {
		return magie;
	}
	
	public void setMagie(String magie) {
		this.magie = magie;
	}
	
	public String getCategorie() {
		return categorie;
	}
	
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public List<String> getMateriaux() {
		return materiaux;
	}
	
	public void setMateriaux(List<String> materiaux) {
		this.materiaux = materiaux;
	}
	
}
