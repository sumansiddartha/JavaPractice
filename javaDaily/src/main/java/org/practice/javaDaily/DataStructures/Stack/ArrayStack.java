/**
 * 
 */
package org.practice.javaDaily.DataStructures.Stack;

/**
 * @author NIC
 *
 */
public class ArrayStack<E> implements Stack<E> {
	
	//default capacity
	public static final int CAPACITY=1000;
	public int capacity;
	//generic array used to implement stack
	protected E S[];
	protected int  top=-1;
	
public ArrayStack() {
		
		this(CAPACITY);
	}

	public ArrayStack(int capacity) {
		
		this.capacity = capacity;
		S=(E[])new Object[capacity];
	}

	public int size() {
		// TODO Auto-generated method stub
		return (top+1);
	}

	public boolean isEmpty() {
		
		return top<0;
	}

	public E top() throws EmptyStackException {
		if(isEmpty()) throw new EmptyStackException("Stack is empty!!!");
		return S[top];
	}

	public void push(E element) throws FullStackException{
		if(size()==capacity) throw new FullStackException("Stack is full !!!");
		S[++top]=element;
		

	}

	public E pop() throws EmptyStackException {
		E element;
		if(isEmpty()) throw new EmptyStackException("Stack is Empty");
		element=S[top];
		S[top--]=null;   //dereference S[top] for garbage collection
		return element;
	}

	
	public String toString() {
	String s;
	s="[";
	if(size()>0) s+=S[0];
	if(size()>1)
		for(int i=0;i<=size()-1;i++) {
			s+=","+S[i];
		}
		
		return s+"]";
	}
	public void status(String op,Object element) {
		System.out.println("----------------------->"+op);  //print the operation
		System.out.println(", returns"+element);
		System.out.println("result:size="+size()+", isEmpty="+isEmpty());
		System.out.println(", stack:"+this);
		}
	
	public static void main(String[] args) {
		Object o;
		ArrayStack<Integer> A=new ArrayStack<Integer>();
		A.status("new ArrayStack<Integer> A", null);
		A.push(7);
		A.status("A.push(7)",null);
		o=A.pop();
		A.status("A.pop()",o);
		A.push(9);
		A.status("A.push(9)",null);
		o=A.pop();
		A.status("A.pop()",o);
		ArrayStack<String> B=new ArrayStack<String>();
		B.status("new ArrayStack<Integer> B", null);
		B.push("Bob");
		B.status("B.push(\"Bob\")",null);
		o=B.pop();
		B.status("B.pop()",o);
		B.push("Suman");
		B.status("B.push(\"Suman\")",null);
		o=B.pop();
		B.status("B.pop()",o);
		B.push("Siddartha");
		B.status("B.push(\"Siddartha\")",null);
		
	}
	
}
