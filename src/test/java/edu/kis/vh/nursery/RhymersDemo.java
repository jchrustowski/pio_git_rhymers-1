package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.ArrayStackRhymersFactory;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

	public static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();
		RhymersFactory stackFactory = new ArrayStackRhymersFactory();
		RhymersFactory listFactory = new ListRhymersFactory();

		System.out.println("Test DefaultRhymersFactory");
		testRhymers(factory);

		System.out.println();
		System.out.println("Test ArrayStackRhymersFactory");
		testRhymers(stackFactory);

		System.out.println();
		System.out.println("Test ListRhymersFactory");
		testRhymers(listFactory);

	}
	//TODO from this method can be extracted some sub-functions to simplify code.
	private static void testRhymers(RhymersFactory factory) {
		DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			while (!rhymer.callCheck())
				System.out.print(rhymer.countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
	}
//(Intellij) ctr + alt + <- navigating backward to previous cursor, ctr + alt + -> navigating forward to next cursor
}