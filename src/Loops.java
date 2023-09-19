import java.util.Iterator;

public class Loops {

	public static void main(String[] args) {
		
		int[] myTab = {1, 3, 5, 15};
		
		// While
		int i = 0;
		int sum = 0;
		while(i < myTab.length) {
			
			sum += myTab[i];
			i++;
			
		}

		System.out.println(sum);
		
		// Do While
		i = 0;
		sum = 0;
		do {
			
			sum += myTab[i];
			i++;
			
		} while (i < myTab.length);
		
		System.out.println(sum);
		
		// For
		System.out.println("");
		sum = 0;
		for (int j = 0; j < myTab.length; j++) {
			
			sum += myTab[j];
			System.out.println(myTab[j]);
			
		}
		System.out.println("");
		System.out.println(sum);
		System.out.println("");
		
		for (i = myTab.length - 1; i >= 0; i--) {
			
			System.out.println(myTab[i]);
			
		}
		
	}

}
