package org.practice.javaDaily.DesignPatterns.Decorator;

public abstract class TreeDecorator implements ChristmasTree {
	 private ChristmasTree tree;
	    
	    public TreeDecorator(ChristmasTree tree) {
	        this.tree = tree;
	    }
	    
	    
	    public String decorate() {
	        return tree.decorate();
	    }


}
