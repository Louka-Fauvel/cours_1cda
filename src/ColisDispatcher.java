
public class ColisDispatcher {

	public static void main(String[] args) {
		String categorieColis = solve(15, 15, 15, 15);
		String categorieColis2 = solve(150000, 150000, 150000, 15);
		String categorieColis3 = solve(15, 15, 15, 20);
		String categorieColis4 = solve(150000, 150000, 150000, 20);
		System.out.println(categorieColis);
		System.out.println(categorieColis2);
		System.out.println(categorieColis3);
		System.out.println(categorieColis4);
	}
	
	public static String solve(int width, int height, int length, int mass) {
		
		final int VOLUME_MAX = 1000000;
		final int DIMENSION_MAX = 150;
		final int POIDS_MAX = 20;
		
		int volume = width * height * length;
		boolean encombrant = volume >= VOLUME_MAX 
				|| width >= DIMENSION_MAX 
				|| height >= DIMENSION_MAX 
				|| length >= DIMENSION_MAX;
		boolean lourd = mass >= POIDS_MAX;
		
		if(!encombrant&& !lourd) {
			
			return "STANDARD";
			
		} else if(!encombrant && lourd || encombrant && !lourd) {
			
			return "SPECIAL";
			
		} else if(encombrant && lourd) {
			
			return "REJETE";
			
		} else {
			
			return "ERREUR";
			
		}
		
	}

}
