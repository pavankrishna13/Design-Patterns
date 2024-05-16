package com.proxy;

public class ProxyMain {

	public static void main(String[] args) {
		ComplexProxy proxy = new ComplexProxy();
		proxy.display();
		
		CacheProxy cacheProxy = new CacheProxy();
		System.out.println(cacheProxy.getCapital("Bihar"));
		
		System.out.println(cacheProxy.getCapital("Bihar"));
		
		System.out.println(cacheProxy.getCapital("AP"));
		
		System.out.println(cacheProxy.getCapital("Kerala"));
		
		System.out.println(cacheProxy.getCapital("AP"));
	}

}
