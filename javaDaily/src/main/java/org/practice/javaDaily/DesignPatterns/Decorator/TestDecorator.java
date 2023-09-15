package org.practice.javaDaily.DesignPatterns.Decorator;

public class TestDecorator {

	
	public static void main(String[] args) {
		
		    ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
		    
		    System.out.println(tree1.decorate().equals("Christmas tree with Garland"));
		     
		    ChristmasTree tree2 = new BubbleLights(
		      new Garland(new Garland(new ChristmasTreeImpl())));
		    System.out.println(tree2.decorate().equals("Christmas tree with Garland with Garland with Bubble Lights"));
		    
		
	}
}
