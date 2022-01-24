package edu.kis.vh.nursery;

/**
 * This class specifies the basic Rhymer.
 */
public class DefaultCountingOutRhymer {

	private final IntArrayStack stack;

	public DefaultCountingOutRhymer() {
		this.stack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		this.stack = stack;
	}

	public int getTotal() {
		return stack.getTotal();
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
