package observer.football;

public class Supportaire implements Observer {

	@Override
	public void notifier(Object data, Object data2) {
		
		if((Integer)data2 == 1) {
			System.out.println("Yeah !!!");
		} else {
			System.out.println("NOOO !!!");
		}
		
	}
	
}
