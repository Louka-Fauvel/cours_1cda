package observer.football;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<>();
	
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	public void unrigisterObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void notifyObserver(Object data, Object data2) {
		for (Observer observer : this.observers) {
			observer.notifier(data, data2);
		}
	}
	
}
