package br.com.ada.bookshop.inventory;

public class Product {

	private String category;
	private Long id;
	private String name;
	private Double price;

	public Product() {
	}

	public Product(String category, Long id, String name, Double price) {
		this.category = category;
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
