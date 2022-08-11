package com.croma;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {

	private Map<Integer, Student> map = new HashMap<>();

	public int save(Student student) {

		int count = map.size() + 1;
		
		map.put(count, student);
		
		return count;

	}

}
