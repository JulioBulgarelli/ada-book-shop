package br.com.ada.bookshop.inventory;

public class Toy extends Product {

	private String type;

	public Toy() {
		super();
	}

	public Toy(Long id, String name, Double price, String type) {
		super("toy", id, name, price);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
