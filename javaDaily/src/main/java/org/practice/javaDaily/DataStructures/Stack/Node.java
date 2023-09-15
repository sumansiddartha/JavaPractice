package org.practice.javaDaily.DataStructures.Stack;

public class Node<E> {
private E element;
private Node<E> next;
public Node() {
	this(null,null);
}
public Node(E e, Node<E> n) {
	element=e;
	next=n;
}
/**
 * @return the element
 */
public E getElement() {
	return element;
}
/**
 * @param element the element to set
 */
public void setElement(E element) {
	this.element = element;
}
/**
 * @return the next
 */
public Node<E> getNext() {
	return next;
}
/**
 * @param next the next to set
 */
public void setNext(Node<E> next) {
	this.next = next;
}


}
