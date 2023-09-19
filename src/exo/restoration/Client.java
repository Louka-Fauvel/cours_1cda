package exo.restoration;

public class Client extends Personne {

	private String address;
	private String phone;
	
	public Client(String firsname, String lastname, String address, String phone) {
		super(firsname, lastname);
		
		this.setAddress(address);
		this.setPhone(phone);
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Commande passerCommande(Restaurant restaurant, Livreur livreur) {
		return new Commande(this, restaurant, livreur);
	}

	@Override
	public String toString() {
		return "Prénom Nom : " + this.getFirstname() + " " + this.getLastname() + "\n" +
				"Téléphone : " + this.phone + "\n" +
				"Adresse : " + this.address;
	}

}
