package br.com.ada.bookshop;

import br.com.ada.bookshop.inventory.Stock;
import br.com.ada.bookshop.model.Product;
import br.com.ada.bookshop.util.BigDecimalHelper;

import java.util.Map;
import java.util.function.Consumer;

public class Cashier {

	private final Stock stock = new Stock();

	private final BigDecimalHelper balance = new BigDecimalHelper();

	public Cashier() {
	}

	public Double getBalance() {
		return balance.getValue();
	}

	public void checkoutCart(Cart cart) {
		balance.add(cart.getTotal());
		handleStock(cart, entry -> stock.subtractFromStock(entry.getKey(), entry.getValue().getQty()));
	}

	public void returnCart(Cart cart) {
		balance.subtract(cart.getTotal());
		handleStock(cart, entry -> stock.addToStock(entry.getKey(), entry.getValue().getQty()));
	}

	private void handleStock(Cart cart, Consumer<Map.Entry<Product, Cart.Item>> handler) {
		for (Map.Entry<Product, Cart.Item> entry : cart.getItems().entrySet()) {
			handler.accept(entry);
		}
	}
}
