package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntStack;

/**
 * This class specifies the basic Rhymer.
 */
public class DefaultCountingOutRhymer {

	private final IntStack stack;

	public DefaultCountingOutRhymer() {
		this.stack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(IntStack stack) {
		this.stack = stack;
	}

	public void countIn(int in) {
		stack.push(in);
	}

	public boolean callCheck() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.top();
	}

	public int countOut() {
		return stack.pop();
	}

}
