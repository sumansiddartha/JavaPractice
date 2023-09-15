package org.practice.javaDaily.DesignPatterns.Decorator;

public class BubbleLights extends TreeDecorator{
	
	public BubbleLights(ChristmasTree tree) {
        super(tree);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }
    
    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }

}
