package br.com.ada.bookshop;

import br.com.ada.bookshop.model.Book;
import br.com.ada.bookshop.model.Product;
import br.com.ada.bookshop.util.BigDecimalHelper;

import java.util.HashMap;
import java.util.Map;

public class Cart {

	private final Map<Product, Item> items = new HashMap<>();
	private final BigDecimalHelper total = new BigDecimalHelper();

	public void addItem(Product product, Integer qty, Integer buyerAge) {
		if (buyerAge < 18 && product.getAdultsOnly()) {
			throw new RuntimeException(String.format("Product '%s' for Adults only!", product.getName()));
		}

		Double subTotal = total.add(qty * product.getPrice());

		total.add(subTotal);
		items.put(product, new Item(qty, subTotal));
	}

	public void removeItem(Product product, Integer qty) {
		total.subtract(qty * product.getPrice());
		items.remove(product);
	}

	public Map<Product, Item> getItems() {
		return items;
	}

	public Double getTotal() {
		Double totalValue = total.getValue();
		for (Map.Entry<Product, Item> entry : items.entrySet()) {
			if (entry.getKey() instanceof Book && entry.getValue().getSubTotal() > 200) {
				totalValue -= totalValue * 0.15;
			}
		}

		return totalValue;
	}

	static class Item {

		private Integer qty;
		private Double subTotal;

		public Item(Integer qty, Double subTotal) {
			this.qty = qty;
			this.subTotal = subTotal;
		}

		public Integer getQty() {
			return qty;
		}

		public void setQty(Integer qty) {
			this.qty = qty;
		}

		public Double getSubTotal() {
			return subTotal;
		}

		public void setSubTotal(Double subTotal) {
			this.subTotal = subTotal;
		}
	}
}
