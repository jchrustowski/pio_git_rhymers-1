package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;

public class ListRhymersFactory implements RhymersFactory{

	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		IntLinkedList list = new IntLinkedList();
		return new DefaultCountingOutRhymer(list);
	}

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		IntArrayStack stack = new IntArrayStack();
		return new DefaultCountingOutRhymer(stack);
	}

	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		IntLinkedList list = new IntLinkedList();
		return new FIFORhymer(list);
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		IntLinkedList list = new IntLinkedList();
		return new HanoiRhymer(list);
	}
}
