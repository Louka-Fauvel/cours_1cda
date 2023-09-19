package observer;

public class Main {

	public static void main(String[] args) {
		
		Twisto twisto = new Twisto();
		Client client = new Client();
		Employe employe = new Employe();
		
		twisto.registerObserver(client);
		twisto.registerObserver(employe);
		
		twisto.seMettreEngreve();
		twisto.finirLaGreve();

	}

}
