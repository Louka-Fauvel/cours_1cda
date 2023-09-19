package observer;

public class Twisto extends Subject {

	private boolean actif;
	
	public void seMettreEngreve() {
		this.actif = false;
		notifyObserver(this.actif);
	}
	
	public void finirLaGreve() {
		this.actif = true;
		notifyObserver(this.actif);
	}
	
}
