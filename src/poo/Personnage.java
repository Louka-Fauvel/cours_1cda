package poo;
import java.util.ArrayList;
import java.util.List;

public class Personnage {

	private String firstname;
	private String lastname;
	private int age;
	private List<Magie> magies = new ArrayList<>();
	
	public Personnage(String firstname, String lastname, int age) {
		
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setAge(age);
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Magie> getMagies() {
		return magies;
	}

	public void setMagies(List<Magie> magies) {
		this.magies = magies;
	}
	
	public void addMagies(Magie magies) {
		this.magies.add(magies);
	}
	
}
