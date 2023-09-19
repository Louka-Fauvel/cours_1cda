package observer.football;

public class Main {

	public static void main(String[] args) {
		
		MatchFootball matchFootball = new MatchFootball();
		Supportaire supportaire = new Supportaire();
		
		matchFootball.registerObserver(supportaire);
		
		matchFootball.butMarque("equipe1");
		matchFootball.butMarque("equipe2");

	}

}
