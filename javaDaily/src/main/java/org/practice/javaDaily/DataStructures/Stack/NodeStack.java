/**
 * 
 */
package org.practice.javaDaily.DataStructures.Stack;

/**
 * @author NIC
 *
 */
public class NodeStack<E> implements Stack<E> {
    protected Node<E> top;
    protected int size;
    
	
	
	public NodeStack() {
		super();
		this.top = null;
		this.size = 0;
	}

	public int size() {
		
		return size;
	}

	public boolean isEmpty() {
		if(top==null) return true;
		return false;
	}

	public E top() throws EmptyStackException {
		if(isEmpty()) throw new EmptyStackException("Stack is Empty");
		return top.getElement();
	}

	public void push(E element)  {
		
       Node<E> v=new Node<E>(element,top);
       top=v;
       size++;
	}

	public E pop() throws EmptyStackException {
		if(isEmpty()) throw new EmptyStackException("Stack is Empty");
		E temp=top.getElement();
		top=top.getNext();
		size--;
		return temp;
	}

}
