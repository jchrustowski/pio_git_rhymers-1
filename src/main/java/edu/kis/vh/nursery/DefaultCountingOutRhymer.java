package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int NUMBERS_MAX_SIZE = 12;
	public static final int IF_EMPTY = -1;
	public static final int INITIAL_RHYMER_INDEX = -1;

	private final int[] numbers = new int[NUMBERS_MAX_SIZE];

	public int getTotal() {
		return total;
	}

	private int total = INITIAL_RHYMER_INDEX;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == IF_EMPTY;
	}

	public boolean isFull() {
		return total == NUMBERS_MAX_SIZE-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return IF_EMPTY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return IF_EMPTY;
		return numbers[total--];
	}

}
