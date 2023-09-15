package org.practice.javaDaily.streams;

import java.util.Arrays;
import java.util.List;

public class StreamForEach {

	public static void main(String[] args) {
		List<String> list =Arrays.asList("cat", "dog","fox", "elephant", "fox", "rabbit", "duck");
		for (int i = 0; i < list.size(); i++) {
		    String item = list.get(i);
		    System.out.println(item.length());
		    if (item.length() % 2 == 0) {
		    	
		        break;
		    }
		    System.out.println(item);
		}
		

	}

}
