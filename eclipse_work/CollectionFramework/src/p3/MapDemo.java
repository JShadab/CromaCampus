package p3;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map map = new HashMap();

		System.out.println(map.size());
		System.out.println(map.isEmpty());

		System.out.println("---------------------");

		map.put("India", "New Delhi");
		map.put("Pakistan", "Islamabad");
		map.put("Nepal", "Kathmandu");
		map.put("SriLanka", "Columbo");
		map.put("USA", "Washington DC");
		map.put("Netherlands", "Amsterdam");
		map.put("Pakistan", "Karachi");

		map.put(null, "null");

		System.out.println(map.size()); //
		System.out.println(map.isEmpty());

		System.out.println(map);

		System.out.println("---------------------");

		System.out.println(map.get("France"));
		System.out.println("---------------------");

		System.out.println(map.containsKey("Karachi"));
		System.out.println(map.containsValue("Karachi"));
		
		System.out.println("---------------------");

		System.out.println(map.remove("SriLanka"));
		System.out.println(map);
		
		
	}

}
