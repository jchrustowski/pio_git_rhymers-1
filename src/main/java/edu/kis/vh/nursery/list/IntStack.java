package edu.kis.vh.nursery.list;

public interface IntStack {
	int IF_EMPTY = -1;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();
}
