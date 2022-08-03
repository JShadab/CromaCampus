package p3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put("India", "New Delhi");
		map.put("Pakistan", "Islamabad");
		map.put("Nepal", "Kathmandu");
		map.put("SriLanka", "Columbo");
		map.put("USA", "Washington DC");
		map.put("Netherlands", "Amsterdam");
		map.put("Pakistan", "Karachi");

		System.out.println("#1 way to print key and value");
		Set allKeys = map.keySet();
		for (Object key : allKeys) {
			Object value = map.get(key);
			System.out.println(key + " -> " + value);
		}
		System.out.println("--------------------------");

		System.out.println("#2 way to print only values");
		Collection values = map.values();
		for (Object value : values) {
			System.out.println(value);
		}

		System.out.println("--------------------------");

		System.out.println("#3 way to print key and value by using entries");
		Set<Entry> allEntries = map.entrySet();
		for (Entry entry : allEntries) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " -> " + value);
		}

		System.out.println("----------------------------");
		System.out.println("Way #4 by using Java ForEach()");

		map.forEach((k, v) -> {
			System.out.println(k + " -> " + v);
		});

	}

}
