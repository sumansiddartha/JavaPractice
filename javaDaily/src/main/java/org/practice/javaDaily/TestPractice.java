package org.practice.javaDaily;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public abstract class TestPractice {

	public static void main(String[] args) {
		Integer a = Integer.valueOf(1);
		Integer b = Integer.valueOf(1);
		System.out.println("hello" == null);
		
		Person naveen=new Person("naveen","bolli");
		Person joe=new Person("joe","biden");
		 
		Person sattar=new Person("sattar","gudda"); 
		System.out.println(Objects.equals(sattar, naveen));

		
		
		Comparator<Person> compareByFirstNames=Comparator.comparing(Person::getFirstName);
		
		List<Person> people = new ArrayList();
		people.add(joe);
		people.add(naveen);
		people.sort(compareByFirstNames);
   System.out.println(people);
   
   
   int x = 1;
   int y = 2;
   System.out.println(x==1);
   System.out.println(y==2);
   modify(x, y);
   System.out.println(x==1);
   System.out.println(y==2);
   
   
   
   Foo c = new Foo(1);
   Foo d = new Foo(1);
   System.out.println("###############################");
   System.out.println(c.num==1);
   System.out.println(d.num==1);
   modify1(c,d);
   System.out.println(c.num==1);
   System.out.println(d.num==1);
   
	}
	
	 public static void modify(int x1, int y1) {
		 x1=5;
		 y1=10;
	 }

	 public static void modify1(Foo a1, Foo b1) {
	        a1.num++;
	       
	        b1 = new Foo(1);
	        b1.num++;
	    }
	 
	 
}
class Foo {
    public int num;
   
    public Foo(int num) {
        this.num = num;
    }} 
