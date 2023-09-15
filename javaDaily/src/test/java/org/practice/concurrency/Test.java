package org.practice.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Integer> list1= Arrays.asList(1,2,3,4);
		List<Integer> list2= Arrays.asList(1,5,3,6);
		
		List<Integer> result = new ArrayList<Integer>();
		result.addAll(list1);
		result.addAll(list2);
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7};
		int arr1Len=arr1.length;
		int arr2Len=arr2.length;
		int arrLen=arr1Len+arr2Len;
		int arr[]=new int[arrLen];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i < arr1Len)
		{
			arr[k++] = arr1[i++];
		}
		while(j < arr2Len)
		{
			arr[k++] = arr2[j++];
		}
		
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
		
		String str = "I am Java and I know Java";
		String[] st=str.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String s : st)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
		}
		
		System.out.println();
		
		for(Map.Entry<String, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		
		
		
		
	
		
		
	}

}
