package com.facade;

import java.sql.Connection;

public class ProductUtility {
	
	public Product getProductData(Connection connection, int id) {
		return new Product(id, "product 1", 10d);
	}
}
