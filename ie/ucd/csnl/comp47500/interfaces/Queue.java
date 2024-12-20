package ie.ucd.csnl.comp47500.interfaces;

import java.util.Collection;
import java.util.NoSuchElementException;

public interface Queue<E> extends Iterable<E> {

	/**
	 * Inserts the specified element into this queue if it is possible to do so
	 * immediately without violating capacity restrictions, returning {@code true}
	 * upon success and throwing an {@code IllegalStateException} if no space is
	 * currently available.
	 *
	 * @param e the element to add
	 * @return {@code true} (as specified by {@link Collection#add})
	 * @throws IllegalStateException    if the element cannot be added at this time
	 *                                  due to capacity restrictions
	 * @throws ClassCastException       if the class of the specified element
	 *                                  prevents it from being added to this queue
	 * @throws NullPointerException     if the specified element is null and this
	 *                                  queue does not permit null elements
	 * @throws IllegalArgumentException if some property of this element prevents it
	 *                                  from being added to this queue
	 */
	boolean add(E e);

	/**
	 * Inserts the specified element into this queue if it is possible to do so
	 * immediately without violating capacity restrictions. When using a
	 * capacity-restricted queue, this method is generally preferable to
	 * {@link #add}, which can fail to insert an element only by throwing an
	 * exception.
	 *
	 * @param e the element to add
	 * @return {@code true} if the element was added to this queue, else
	 *         {@code false}
	 * @throws ClassCastException       if the class of the specified element
	 *                                  prevents it from being added to this queue
	 * @throws NullPointerException     if the specified element is null and this
	 *                                  queue does not permit null elements
	 * @throws IllegalArgumentException if some property of this element prevents it
	 *                                  from being added to this queue
	 */
	boolean offer(E e);

	/**
	 * Retrieves and removes the head of this queue. This method differs from
	 * {@link #poll() poll()} only in that it throws an exception if this queue is
	 * empty.
	 *
	 * @return the head of this queue
	 * @throws NoSuchElementException if this queue is empty
	 */
	E remove();

	/**
	 * Retrieves and removes the head of this queue, or returns {@code null} if this
	 * queue is empty.
	 *
	 * @return the head of this queue, or {@code null} if this queue is empty
	 */
	E poll();

	/**
	 * Retrieves, but does not remove, the head of this queue. This method differs
	 * from {@link #peek peek} only in that it throws an exception if this queue is
	 * empty.
	 *
	 * @return the head of this queue
	 * @throws NoSuchElementException if this queue is empty
	 */
	E element();

	/**
	 * Retrieves, but does not remove, the head of this queue, or returns
	 * {@code null} if this queue is empty.
	 *
	 * @return the head of this queue, or {@code null} if this queue is empty
	 */
	E peek();

	/**
	 * Returns {@code true} if this queue contains the specified element. More
	 * formally, returns {@code true} if and only if this queue contains at least
	 * one element {@code e} such that {@code Objects.equals(o, e)}.
	 *
	 * @param o element whose presence in this queue is to be tested
	 * @return {@code true} if this queue contains the specified element
	 */
	boolean contains(Object o);

	
	boolean isEmpty();
	
	/**
	 * Returns the number of elements in this deque.
	 *
	 * @return the number of elements in this deque
	 */
	int size();

}
