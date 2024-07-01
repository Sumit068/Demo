package demo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class practice2 {
	
	public static String findMax(Map<String, Integer> map) {
		return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
	}

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("Rahul", 1);
		map.put("Amit", 1);
		map.put("Swati", 2);
		map.put("Kamal", 3);
		map.put("Ajay", 4);
		map.put("Sachin", 1);
		System.out.println("Employee with maximum number of project is "+findMax(map));
	}

}
