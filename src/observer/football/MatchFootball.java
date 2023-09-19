package observer.football;

public class MatchFootball extends Subject {
	
	String equipeName1 = "equipe1";
	String equipeName2 = "equipe2";
	int equipePoint1 = 0;
	int equipePoint2 = 0;
	
	public void butMarque(String equipe) {
		
		if(equipe == this.equipeName1) {
			this.equipePoint1++;
			notifyObserver(equipe, 1);
		} else {
			this.equipePoint2++;
			notifyObserver(equipe, 2);
		}
		
	}
	
}
