package threads;

public class CalculMoyenne extends Thread {

	private Student student;
	
	public CalculMoyenne(Student student) {
		this.student = student;
	}
	
	@Override
	public void run() {
		double somme = 0.0;
		for(Double note : this.student.getNotes()) {
			somme += note;
		}
		this.student.setMoyenne(somme / this.student.getNotes().size());
	}
	
}
