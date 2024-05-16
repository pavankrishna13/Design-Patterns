package com.facade;

public class FacadeMain {

	public static void main(String[] args) {
		ProductFacade pf = new ProductFacade();
		Product p = pf.isLowStock(100);
		
		System.out.println(p);

	}

}
