package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntStack stack;

	public FIFORhymer() {
		this.stack = new IntArrayStack();
	}

	public FIFORhymer(IntStack stack) {
		this.stack = stack;
	}

	@Override
	public int countOut() {
		while (!callCheck())
			stack.push(super.countOut());

		int ret = stack.pop();

		while (!stack.isEmpty())
			countIn(stack.pop());

		return ret;
	}
}
