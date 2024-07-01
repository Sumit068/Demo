package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Practice1 {
	
	public static List<Integer> removeDuplicates(List<Integer> list){
		return new ArrayList(new LinkedHashSet(list));
		
	}

	public static void main(String[] args) {
		List<Integer> items = new ArrayList(Arrays.asList(10, 15, 21, 15, 10));
		System.out.println(removeDuplicates(items));

	}

}
