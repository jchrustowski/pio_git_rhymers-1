package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer decoratedRhymer = new DefaultCountingOutRhymer();

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
