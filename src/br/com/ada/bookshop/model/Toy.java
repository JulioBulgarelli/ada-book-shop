package br.com.ada.bookshop.model;

public class Toy extends Product {

	private String type;

	public Toy() {
		super();
	}

	public Toy(Long id, String name, Double price, Boolean adultsOnly, String type) {
		super("toy", id, name, price, adultsOnly);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
