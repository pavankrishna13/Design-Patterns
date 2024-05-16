package com.proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy {

	StatesUtil statesUtil;
	
	Map<String, String> cache;
	
	public String getCapital(String state) {
		if(cache != null && cache.containsKey(state) ) {
			System.out.println("Got from cache");
			return cache.get(state);
		}
		if(statesUtil == null) {
			statesUtil = new StatesUtil();
		}
		String capital = statesUtil.getCapital(state);
		System.out.println("Got from remote call");
		if(cache == null) {
			cache = new HashMap<>();
		}
		cache.put(state, capital);
		return capital;
	}
}
