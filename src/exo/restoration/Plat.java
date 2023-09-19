package exo.restoration;

public class Plat {

	String name;
	double price;
	
	public Plat(String name, double price) {
		
		this.setName(name);
		this.setPrice(price);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Nom du plat : " + this.name + "\n" +
				"Prix : " + this.price + " €";
	}

}
