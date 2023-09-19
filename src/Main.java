public class Main {
	
	public static void main(String[] args) {
		
		int myInt;
		String myString;
		int[] myTab = {1, 2, 3};
		int[] myOtherTab;
		Object[] myObejectTab = {1, true, "Iris Sheeban"};
		final int myConst = 15;
		Integer myInteger = 10;
		Character myCharacter;
		Double myDouble;
		String nb;
		
		myInt = 15;
		myString = "Akou Velfau";
		double result = 10.0/3;
		System.out.println(myString.charAt(0));
		System.out.println(result);
		System.out.println(myString.replace('u', 'i'));
		myOtherTab = new int[3];
		String[] myStringTab = myString.split(" ");
		System.out.println(myStringTab[0]);
		sum(15, 100);
		int res2 = sum2(15, 50);
		System.out.println(res2);
		nb = "15";
		int nbInt = Integer.parseInt(nb);
		
		System.out.println("-------------------------------------------------");
		//---------------------------------------------------------------------
		String categorieColis = solve(15, 15, 15, 15);
		String categorieColis2 = solve(150000, 150000, 150000, 15);
		String categorieColis3 = solve(15, 15, 15, 20);
		String categorieColis4 = solve(150000, 150000, 150000, 20);
		System.out.println(categorieColis);
		System.out.println(categorieColis2);
		System.out.println(categorieColis3);
		System.out.println(categorieColis4);
		
	}
	
	public static void sum(int var1, int var2) {
		
		int res = var1 + var2;
		System.out.println(res);
		
	}
	
	public static int sum2(int var1, int var2) {
		
		int res = var1 + var2;
		return res;
		
	}
	
	public static String solve(int width, int height, int length, int mass) {
		
		int volume = width * height * length;
		boolean encombrant = false;
		boolean lourd = false;
		
		if((volume >= 1000000) || (width == 150 || height == 150 || length == 150)) {
			encombrant = true;
		}
		if(mass >= 20) {
			lourd = true;
		}
		
		if(encombrant == false && lourd == false) {
			
			return "STANDARD";
			
		} else if(encombrant == false && lourd == true || encombrant == true && lourd == false) {
			
			return "SPECIAL";
			
		} else if(encombrant == true && lourd == true) {
			
			return "REJETE";
			
		} else {
			
			return "ERREUR";
			
		}
		
	}
	
}
