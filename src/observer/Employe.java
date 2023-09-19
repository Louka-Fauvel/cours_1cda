package observer;

public class Employe implements Observer {

	@Override
	public void notifier(Object data) {

		System.out.println("Je ne vais pas au travail.");
		if((boolean)data) {
			System.out.println("Je rentre à la maison.");
		} else {
			System.out.println("Je ne vais pas au travail.");
		}
		
	}
	
}
