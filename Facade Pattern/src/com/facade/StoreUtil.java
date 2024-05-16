package com.facade;

import java.sql.Connection;

public class StoreUtil {
	
	public StoreData getStoreData(Connection connection, int id) {
		return new StoreData(id, 192, 200);
	}
	
}
