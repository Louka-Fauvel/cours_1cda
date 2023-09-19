import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		String sumString = "";
		myList.add("Akou Velfau");
		myList.add("Iris Sheeban");
		myList.add("Diemos");
		myList.add("Seiki");
		myList.add("Prometheus");
		
		System.out.println(myList.size());
		System.out.println(myList);
		myList.remove(4);
		System.out.println(myList.size());
		System.out.println(myList);
		
		System.out.println("");
		for(int i = 0; i < myList.size(); i++) {
			sumString = sumString + myList.get(i) + " ";
			System.out.println(sumString);
		}
		
		System.out.println("");
		sumString = "";
		for(String leString : myList) {
			sumString = sumString + leString + " ";
			System.out.println(sumString);
		}
		
		System.out.println("");
		String[] tab1 = {"Akou", "Velfau", "Feu et Néant"};
		String[] tab2 = {"Iris", "Sheeban", "Création et Destruction"};
		String[] tab3 = {"Prometheus", "Alpha", "Nanotechnologie"};
		
		List<String[]> listOfTab = new ArrayList<>();
		
		listOfTab.add(tab1);
		listOfTab.add(tab2);
		listOfTab.add(tab3);
		
		List<String> listOfSumTabs = new ArrayList<>();
		
		for(String[] tab : listOfTab) {
			
			String sum = "";
			for(String elt : tab) {
				
				sum = sum + elt + " ";
				
			}
			listOfSumTabs.add(sum);
			
		}
		System.out.println(listOfSumTabs);
		
		System.out.println("");
		Map<String, Integer> ageGardiens = new HashMap<>();
		ageGardiens.put("Akou Velfau", 1500);
		ageGardiens.put("Iris Sheeban", 2000);
		
		System.out.println(ageGardiens.get("Akou Velfau"));
		
		for(Map.Entry<String, Integer> entry : ageGardiens.entrySet()) {
			
			System.out.println(entry.getKey() + " a " + entry.getValue() + " ans.");
			
		}
		
		Map<String, List<Double>> notesOfGardiens = new HashMap<>();
		notesOfGardiens.put("Akou Velfau", new ArrayList<>());
		notesOfGardiens.put("Iris Sheeban", new ArrayList<>());
		
		notesOfGardiens.put("Prometheus", new ArrayList<>());
		
		notesOfGardiens.get("Akou Velfau").add(15.5);
		notesOfGardiens.get("Akou Velfau").add(19.0);
		notesOfGardiens.get("Iris Sheeban").add(20.0);
		notesOfGardiens.get("Iris Sheeban").add(19.5);
		notesOfGardiens.get("Prometheus").add(19.5);
		
		double moyenneClass = 0;
		for(Map.Entry<String, List<Double>> entry : notesOfGardiens.entrySet()) {
			
			moyenneClass += claculMoyenne(entry.getValue());
			
		}
		moyenneClass = moyenneClass / notesOfGardiens.size();
		System.out.println(moyenneClass);
		
		System.out.println("");
		int [] tab = {1, 99, 15, 150, 42};
		List<Integer> list = new ArrayList<>();
		for(int nb : tab) {
			list.add(nb);
		}
		System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			
			if(itr.next() > 50) {
				itr.remove();
			}
			
		}
		System.out.println(list);

	}
	
	public static double claculMoyenne(List<Double> notes) {
		
		double moyenne = 0;
		for(double note : notes) {
			
			moyenne += note;
			
		}
		
		return moyenne / notes.size();
		
	}

}
