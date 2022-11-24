package br.com.ada.bookshop.util;

import java.math.BigDecimal;

public class BigDecimalHelper {

	private final BigDecimal bigDecimalValue = BigDecimal.valueOf(0.0);

	public Double add(Double value) {
		return bigDecimalValue.add(BigDecimal.valueOf(value)).doubleValue();
	}

	public Double subtract(Double value) {
		return bigDecimalValue.subtract(BigDecimal.valueOf(value)).doubleValue();
	}

	public Double getValue() {
		return bigDecimalValue.doubleValue();
	}
}
