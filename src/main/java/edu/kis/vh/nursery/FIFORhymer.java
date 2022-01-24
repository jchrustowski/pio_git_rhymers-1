package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer decoratedRhymer = new DefaultCountingOutRhymer();

	public FIFORhymer() {
	}

	public FIFORhymer(IntStack stack) {
		super(stack);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			decoratedRhymer.countIn(super.countOut());

		int ret = decoratedRhymer.countOut();

		while (!decoratedRhymer.callCheck())
			countIn(decoratedRhymer.countOut());

		return ret;
	}
}
