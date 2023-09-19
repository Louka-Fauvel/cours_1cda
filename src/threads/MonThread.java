package threads;

public class MonThread implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getId() + " est à l'itération : " + i);
		}
		
	}

}
