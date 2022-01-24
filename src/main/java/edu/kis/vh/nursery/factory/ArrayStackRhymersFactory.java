package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;

public class ArrayStackRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		IntArrayStack stack = new IntArrayStack();
		return new DefaultCountingOutRhymer(stack);
	}

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		IntLinkedList list = new IntLinkedList();
		return new DefaultCountingOutRhymer(list);
	}

	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		IntArrayStack stack = new IntArrayStack();
		return new FIFORhymer(stack);
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		IntArrayStack stack = new IntArrayStack();
		return new HanoiRhymer(stack);
	}
}
