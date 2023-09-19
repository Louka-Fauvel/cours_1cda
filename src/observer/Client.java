package observer;

public class Client implements Observer {

	@Override
	public void notifier(Object data) {
		
		if((boolean)data) {
			System.out.println("Je prends le bus.");
		} else {
			System.out.println("Je prends ma voiture.");
		}
		
	}
	
}
