package org.practice.Math;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class FactorialTest {

	public static void main(String[] args) {
		long fact=factorialUsingForLoop(5);
		System.out.println(fact);
		
		long streamFact=factorialUsingStreams(20);
		System.out.println(streamFact);
		
		BigInteger fact2=factorialHavingLargeResult(20);
		System.out.println(fact2);

	}

	
	
	public static long factorialUsingForLoop(int n) {
		long fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static long factorialUsingStreams(int n) {
		
		return LongStream.rangeClosed(1,n).reduce(1,(long x,long y)->x*y);
		
	}
	
	
	public static BigInteger factorialHavingLargeResult(int n) {
		BigInteger result = BigInteger.ONE;
	for (int i = 2; i < n; i++) {
	result=result.multiply(BigInteger.valueOf(i));	
	}
		
		return result;
	} 
}
