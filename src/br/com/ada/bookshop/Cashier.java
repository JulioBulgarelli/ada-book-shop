package br.com.ada.bookshop;

import br.com.ada.bookshop.inventory.Product;

import java.math.BigDecimal;

public class Cashier {

	private final Stock stock = new Stock();

	private final BigDecimal balance = new BigDecimal("0.0");

	public Cashier() {
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void checkoutProduct(Product product, Integer qty) {
		add(qty * product.getPrice());
		stock.subtractFromStock(product, qty);
	}

	public void returnProduct(Product product, Integer qty) {
		subtract(qty * product.getPrice());
		stock.addToStock(product, qty);
	}

	private BigDecimal add(Double value) {
		return this.balance.add(BigDecimal.valueOf(value));
	}

	private BigDecimal subtract(Double value) {
		return this.balance.subtract(BigDecimal.valueOf(value));
	}
}
