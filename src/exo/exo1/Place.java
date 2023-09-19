package exo.exo1;

import java.util.HashMap;
import java.util.Map;

public class Place {

	private String numero;
	private Map<Seance, Boolean> disponible = new HashMap<>();
	
	public Place(String numero) {
		
		this.setNumero(numero);
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Boolean isDisponible(Seance seance) {
		return disponible.get(seance);
	}

	public void setIsDisponible(Seance seance, Boolean value) {
		this.disponible.put(seance, value);
	}

}
