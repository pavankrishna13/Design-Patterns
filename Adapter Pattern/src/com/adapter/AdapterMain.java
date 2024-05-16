package com.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		
		TempAdapter adapter = new TempClassAdapter();
		adapter.setTempInC(21.5);
		
		System.out.println(adapter.getTempInF());
		System.out.println(adapter.getTempInC());
		
		adapter.setTempInF(78.2);
		
		System.out.println(adapter.getTempInF());
		System.out.println(adapter.getTempInC());
		
		System.out.println("\nObject Apapter: ");
		
		TempAdapter objAdapter = new TempObjectAdapter();
		objAdapter.setTempInC(21.5);
		
		System.out.println(objAdapter.getTempInF());
		System.out.println(objAdapter.getTempInC());
		
		objAdapter.setTempInF(78.2);
		
		System.out.println(objAdapter.getTempInF());
		System.out.println(objAdapter.getTempInC());
		
	}

}
