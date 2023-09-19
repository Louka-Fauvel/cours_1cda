package poo;

public class Magie {

	private String name;
	private String category;
	private String rang;
	private String description;
	
	public Magie(String name, String category, String rang, String description) {
		
		this.setName(name);
		this.setCategory(category);
		this.setRang(rang);
		this.setDescription(description);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
