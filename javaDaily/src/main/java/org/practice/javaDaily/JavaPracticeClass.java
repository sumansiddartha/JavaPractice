package org.practice.javaDaily;

import java.util.Arrays;

import com.sun.tools.javac.util.List;

public class JavaPracticeClass {

	public static void main(String[] args) {
		 int[] anArray = new int[] {5, 2, 1, 4, 8};
	        int[] anotherArray = new int[] {10, 4, 9, 11, 2};

	        int[] resultArray = new int[anArray.length + anotherArray.length];
	        for (int i = 0; i < resultArray.length; i++) {
	            resultArray[i] = (i < anArray.length ? anArray[i] : anotherArray[i - anArray.length]);
	        }
	        for (int element : resultArray) {
	            System.out.println(element);
	        }
            Arrays.sort(resultArray);
            System.out.println("This is sorted array");
            
            for(int i=0;i<resultArray.length;i++) {
            System.out.println(resultArray[i]);
            }
            System.out.println("----------------------");
	        Arrays.setAll(resultArray, i -> (i < anArray.length ? anArray[i] : anotherArray[i - anArray.length]));
	        for (int element : resultArray) {
	            System.out.println(element);
	        }
	        
	   

	}

}
