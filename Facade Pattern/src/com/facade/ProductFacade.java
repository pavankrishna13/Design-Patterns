package com.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductFacade {

	Connection conn;

	public ProductFacade() {
		//create a database connection
	}
	
	public Product isLowStock(int id) {
		ProductUtility pu = new ProductUtility();
		Product p = pu.getProductData(conn, id);
		
		StoreUtil su = new StoreUtil();
		StoreData data = su.getStoreData(conn, id);
		
		if(data.getBalance() < data.getRol()) {
			return p;
		} else {
			return null;
		}
	}
	
	

}
