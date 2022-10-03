package org.tamil;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Empdetails {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new LinkedHashMap();
		
		m.put(10, "Java");
		m.put(20, "Maven");
		m.put(30, "Selenium");
		m.put(40,"Framework");
		System.out.println(m);
		
		
		int size = m.size();
		System.err.println(size);
		
		String string = m.get(40);
		System.out.println(string);
		
		m.remove(40);
		System.out.println(m);
		
		boolean containsKey = m.containsKey(10);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("Java");
		System.out.println(containsValue);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> x : entrySet) {
			
			System.out.println(x.getKey());
			System.out.println(x.getValue());
			
		}
		
		for (Entry<Integer, String> y : entrySet) {
			
			System.out.println(y);
			
		}
	
		
		m.clear();
		System.out.println(m);
		
		
		
		
		
		
	}	
}
