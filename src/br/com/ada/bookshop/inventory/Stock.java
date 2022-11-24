package br.com.ada.bookshop.inventory;

import br.com.ada.bookshop.model.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stock {

	private final Map<Product, Integer> currentStock = new HashMap<>();

	public Integer addToStock(Product product, Integer qty) {
		return this.currentStock.put(product, qty);
	}

	public Integer subtractFromStock(Product product, Integer qty) {
		if (this.currentStock.get(product) < qty) {
			throw new RuntimeException(String.format("Not enough stock for '%s'!", product.getName()));
		}
		return this.currentStock.put(product, this.currentStock.get(product) - qty);
	}

	public void getProducts(String category) {
		Stream<Product> productStream = this.currentStock.keySet().stream();
		if (category != null && !category.isEmpty()) {
			productStream = productStream.filter(p -> category.equals(p.getCategory()));
		}

		for (Product product : productStream.collect(Collectors.toList())) {
			System.out.println(String.format("'%s' has '%d' in stock.", product.getName(), this.currentStock.get(product)));
		}
	}

	public void createProduct(Product product) {
		this.currentStock.put(product, 0);
		System.out.println(String.format("'%s' has been created.", product.getName()));
	}

	public Product readProduct(Long id) {
		Product product = this.currentStock.keySet().stream().filter(p -> id.equals(p.getId())).findFirst().orElse(null);
		if (product != null) {
			return product;
		} else {
			throw new RuntimeException(String.format("'%s' not found.", product.getName()));
		}
	}

	public void updateProduct(Product product) {
		this.currentStock.put(product, this.currentStock.get(product));
		System.out.println(String.format("'%s' has been updated.", product.getName()));
	}

	public void deleteProduct(Long id) {
		Product product = this.currentStock.keySet().stream().filter(p -> id.equals(p.getId())).findFirst().orElse(null);
		if (product != null) {
			this.currentStock.remove(this.currentStock.keySet().stream().filter(p -> id.equals(p.getId())).findFirst().orElse(null));
			System.out.println(String.format("'%s' has been removed.", product.getName()));
		} else {
			throw new RuntimeException(String.format("'%s' not found.", product.getName()));
		}
	}
}
