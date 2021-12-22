package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer decoratedRhymer = new defaultCountingOutRhymer();

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
