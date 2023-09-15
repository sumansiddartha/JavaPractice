package org.practice.javaDaily.DataStructures.Stack;

import java.util.Arrays;

public class ReverseArrayStack {

	public static <E> void reverse(E[] a) {
		Stack<E> S=new ArrayStack<E>(a.length);
		for(int i=0;i<a.length;i++) {
			S.push(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			a[i]=S.pop();
		}
	}
	public static void main(String[] args) {
	Integer[] a= {4,5,6,7,9,34};
	String[] s= {"suman","siddartha","ravi","somesh","kamesh"};
	System.out.println("a="+Arrays.toString(a));
	System.out.println("s="+Arrays.toString(s));
	System.out.println("Reversing..........");
	reverse(a);
	reverse(s);
	System.out.println("a="+Arrays.toString(a));
	System.out.println("s="+Arrays.toString(s));
}
}
