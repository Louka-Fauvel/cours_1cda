package threads;

import java.util.List;

public class Student {

	private String name;
	private List<Double> notes;
	private double moyenne = 0.0;
	
	public Student(String name, List<Double> notes) {
		
		this.setName(name);
		this.setNotes(notes);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getNotes() {
		return notes;
	}

	public void setNotes(List<Double> notes) {
		this.notes = notes;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

}
