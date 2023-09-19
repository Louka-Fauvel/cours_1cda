package poo.objet;

public class Artefact extends Objet {

	private String effet;
	
	public Artefact(String name, String magie, String categorie) {
		super(name, magie, categorie);
	}

	public String getEffet() {
		return effet;
	}

	public void setEffet(String effet) {
		this.effet = effet;
	}
	
}
