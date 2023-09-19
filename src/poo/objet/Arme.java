package poo.objet;

import java.util.ArrayList;
import java.util.List;

public class Arme extends Objet {
	
	private String typeDegat;
	
	public static int cpt = 0;
	
	public Arme(String name, String magie, String categorie, String typeDegat) {
		super(name, magie, categorie);
		
		this.typeDegat = typeDegat;
		
		cpt++;
	}

	public String getTypeDegat() {
		return typeDegat;
	}

	public void setTypeDegat(String typeDegat) {
		this.typeDegat = typeDegat;
	}
	
}
