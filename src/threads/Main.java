package threads;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		MonThread2 monThread2 = new MonThread2("Hey !");
//		monThread2.start();
		
		Runnable monRunnable = new MonThread();
		Thread thread1 = new Thread(monRunnable);
		Thread thread2 = new Thread(monRunnable);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("thread 1 a finit son travail !");
		
		List<Student> students = new ArrayList<>();
		List<Double> notesAkou = new ArrayList<>();
		List<Double> notesIris = new ArrayList<>();
		notesAkou.add(15.5);
		notesAkou.add(20.0);
		notesIris.add(19.0);
		notesIris.add(19.5);
		Student akou = new Student("Akou", notesAkou);
		Student iris = new Student("Iris", notesIris);
		students.add(akou);
		students.add(iris);
		
		List<CalculMoyenne> calculs = new ArrayList<>();
		for(Student student : students) {
			
			calculs.add(new CalculMoyenne(student));
			
		}
		
		for(CalculMoyenne calcul : calculs) {
			calcul.start();
		}
		
		for(CalculMoyenne calcul : calculs) {
			try {
				calcul.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(Student student : students) {
			System.out.println(student.getName() + " - Moyenne : " + student.getMoyenne());
		}

	}

}
