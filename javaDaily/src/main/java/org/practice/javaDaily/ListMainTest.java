package org.practice.javaDaily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import javax.sound.midi.Soundbank;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class ListMainTest {

	
	
	public static void main(String[] args) {
		
		
		CopyList() ;
		
}
	public static void givenListShouldReturnRandomNumber() {
		List<Integer> givenList = Arrays.asList(1,2,3);
		
		Random rand=new Random();
		
		//For MultiThreaded Environment
		int randomElementIndex=ThreadLocalRandom.current().nextInt(givenList.size())%givenList.size();
//		Integer RandomElement = givenList.get(rand.nextInt(givenList.size()));
		Integer RandomElement = givenList.get(randomElementIndex);
	
	System.out.println("The Random Element is "+RandomElement);
	}
	
	public static void givenList_whenNumberElementsChosen_shouldReturnRandomElementsRepeat() {
		 Random rand = new Random();
		    List<String> givenList = Arrays.asList("one", "two", "three", "four");

		    int numberOfElements = 2;

		    for (int i = 0; i < numberOfElements; i++) {
		        int randomIndex = rand.nextInt(givenList.size());
		        String randomElement = givenList.get(randomIndex);
		        System.out.println(randomElement);
		    }
	} 
	
	
//	Select Random Items Without Repetitions
	public static void givenList_whenNumberElementsChosen_shouldReturnRandomElementsNoRepeat() {
		  Random rand = new Random();
		  List<String> givenList =Lists.newArrayList("one", "two", "three", "four");

		    int numberOfElements = 2;

		    for (int i = 0; i < numberOfElements; i++) {
		        int randomIndex = rand.nextInt(givenList.size());
		        String randomElement = givenList.get(randomIndex);
		        givenList.remove(randomIndex);
		        System.out.println(randomElement);
		    }
	}
	
	public static void givenList_whenSeriesLengthChosen_shouldReturnRandomSeries() {
	    List<Integer> givenList = Lists.newArrayList(1, 2, 3, 4, 5, 6);
	    Collections.shuffle(givenList);

	    int randomSeriesLength = 3;

	    List<Integer> randomSeries = givenList.subList(0, randomSeriesLength);
	    for(int i=0;i<randomSeries.size();i++) {
	    	System.out.println(randomSeries.get(i));
	    }
	}
	
	//Removing null Elements from the list
	public static void givenListContainsNulls_whenRemovingNullsWithPlainJava_thenCorrect() {
		ArrayList<Integer> list = Lists.newArrayList(null,1,null,2,3,null,5);
		while(list.remove(null));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static void givenListContainsNulls_whenRemovingNullsWithPlainJavaAlternative_thenCorrect() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(null);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(null);
		list.add(null);
		list.add(7);
		list.removeAll(Collections.singleton(null));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
//	Nulls From a List Using Apache Commons Collections
	public static void givenListContainsNulls_whenRemovingNullsWithCommonsCollections_thenCorrect() {
		List<Integer> list = Lists.newArrayList(null, 1, 2, null, 3, null);
		
	}
	
//	Remove Nulls From a List Using Lambdas
	public static void givenListContainsNulls_whenFilteringParallel_thenCorrect() {
		ArrayList<Integer> list = Lists.newArrayList(null,1,2,3,null,5,6,null,7,10,null);
		List<Integer> listWithoutNull = list.parallelStream().filter(Objects::nonNull).collect(Collectors.toList());
		for (int i = 0; i < listWithoutNull.size(); i++) {
			System.out.println(listWithoutNull.get(i));
		}
	}
	
//	Remove Duplicates From the list using java
	public static void givenListContainsDuplicates_whenRemovingDuplicatesWithPlainJava_thenCorrect() {
		List<Integer> listWithDuplicates = Lists.newArrayList(5, 0, 3, 1, 2, 3, 0, 0);
		
		List<Integer> listWithoutDuplicates=new ArrayList<>(new HashSet<>(listWithDuplicates));
		for (int i = 0; i < listWithoutDuplicates.size(); i++) {
			System.out.println(listWithoutDuplicates.get(i));
			
		}
	}
	//In order to preserve the order
	public static  void  givenListContainsDuplicates_whenRemovingDuplicatesPreservingOrderWithPlainJava_thenCorrect() {
		List<Integer> listWithDuplicates = Lists.newArrayList(5, 0, 3, 1, 2, 3, 0, 0);
		 List<Integer> listWithoutDuplicates = new ArrayList<>(
			      new LinkedHashSet<>(listWithDuplicates));
		
			for (int i = 0; i < listWithoutDuplicates.size(); i++) {
				System.out.println(listWithoutDuplicates.get(i));
				
			}
	}
	//with guava
	public static void 
	  givenListContainsDuplicates_whenRemovingDuplicatesPreservingOrderWithGuava_thenCorrect() {
		List<Integer> listWithDuplicates = Lists.newArrayList(5, 0, 3, 1, 2, 3, 0, 0);
		ArrayList<Integer> listWithoutDuplicates = Lists.newArrayList(Sets.newLinkedHashSet(listWithDuplicates));
		int i=0;
		while(i<listWithoutDuplicates.size()) {
			System.out.println(listWithoutDuplicates.get(i));
			i++;
		}
	}
	
//	Remove Duplicates From a List Using Java 8 Lambdas
	public static void 
	  givenListContainsDuplicates_whenRemovingDuplicatesWithJava8_thenCorrect() {
		List<Integer> listWithDuplicates = Lists.newArrayList(5, 0, 3, 1, 2, 3, 0, 0);
		List<Integer> listWithoutDuplicates = listWithDuplicates.stream().distinct().collect(Collectors.toList());
	for (int i = 0; i < listWithoutDuplicates.size(); i++) {
		System.out.println(listWithoutDuplicates.get(i));
		
	}
	
	}
	
	
	//java-list-iterate-backwards
	
	public static void IterationsForReverseList() {
		ArrayList<Object> newArrayList = Lists.newArrayList(1,2,3,"suman","siddartha",7,8);
//		using ListIterator
//		ListIterator listIterator=newArrayList.listIterator(newArrayList.size());
//		while(listIterator.hasPrevious()) {
//			System.out.println(listIterator.previous());
//			
//		}
		Collections.reverse(newArrayList);
		for(Object item:newArrayList) {
			System.out.println(item);
		}
	}
//	Remove the First Element from a List
	
	
	
//	find-list-element-java
	
	
//	java-collections-emptylist-new-list
	public static void givenArrayList_whenAddingElement_addsNewElement() {
		List<String> mutableList = new ArrayList<>();
		mutableList.add("suman");
		mutableList.add("siddartha");
		System.out.println(mutableList.get(0));
	}
	public static void givenCollectionsEmptyList_whenAdding_throwsException() {	 	 
	    List<String> immutableList = Collections.emptyList();	 	 
	    immutableList.add("test");	 	 
	    System.out.println(immutableList.get(0));
	}
	
	//Copy list
	
	public static void CopyList() {
		List<Integer> source = Arrays.asList(1,2,3);
		List<Integer> dest = Arrays.asList(4,5,6,7,8,9,10);
		Collections.copy(dest, source);
		for (int i = 0; i < dest.size(); i++) {
			System.out.println(dest.get(i));
		}
		
	}
}
