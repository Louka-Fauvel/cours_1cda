package exo.restoration;

public abstract class Personne {

	private String firstname;
	private String lastname;
	
	public Personne(String firsname, String lastname) {
		
		this.setFirstname(firsname);
		this.setLastname(lastname);
		
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

}
