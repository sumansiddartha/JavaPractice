package org.practice.javaDaily.DataStructures.Queue;

public interface Queue<E> {
public int size();
public boolean isEmpty();
public E front() throws EmptyQueueException;


public void enqueue(E element);
public E dequeue() throws EmptyQueueException;

}
