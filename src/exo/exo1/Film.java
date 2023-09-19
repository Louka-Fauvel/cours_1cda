package exo.exo1;

public class Film {

	private String nom;
	private String synopsis;
	private int date;
	
	public Film(String nom, String synopsis, int date) {
		
		this.setNom(nom);
		this.setSynopsis(synopsis);
		this.setDate(date);
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

}
