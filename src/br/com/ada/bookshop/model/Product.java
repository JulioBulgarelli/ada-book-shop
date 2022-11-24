package br.com.ada.bookshop.model;

public class Product {

	private String category;
	private Long id;
	private String name;
	private Double price;
	private Boolean adultsOnly;

	public Product() {
	}

	public Product(String category, Long id, String name, Double price, Boolean adultsOnly) {
		this.category = category;
		this.id = id;
		this.name = name;
		this.price = price;
		this.adultsOnly = adultsOnly;
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

	public Boolean getAdultsOnly() {
		return adultsOnly;
	}

	public void setAdultsOnly(Boolean adultsOnly) {
		this.adultsOnly = adultsOnly;
	}
}
