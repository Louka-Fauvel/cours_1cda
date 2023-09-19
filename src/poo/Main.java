package poo;

public class Main {

	public static void main(String[] args) {
		
		Magie feu = new Magie("Feu", "Elémentaire", "B", "Provoque des brûlures à la cible.");
		Magie neant = new Magie("Néant", "Immaginaire", "S", "Déchire le voile de la réalité.");
		
		Personnage akou = new Personnage("Akou", "Velfau", 1500);
		
		akou.addMagies(feu);
		akou.addMagies(neant);
		
		System.out.println("Je suis " + akou.getFirstname() + " " + akou.getLastname() + 
				". \nJ'ai " + akou.getAge() + " ans. \nMes pouvoirs sont :");
		
		for (Magie magie : akou.getMagies()) {
			
			System.out.println("- " + magie.getName());
			
		}
		
	}
	
}
