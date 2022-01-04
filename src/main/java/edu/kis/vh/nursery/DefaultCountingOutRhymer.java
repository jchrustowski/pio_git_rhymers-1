package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int NUMBERS_MAX_SIZE = 12;
	public static final int IS_EMPTY = -1;
	public static final int IS_FULL = 11;

	private int[] numbers = new int[NUMBERS_MAX_SIZE];

	public int getTotal() {
		return total;
	}

	private int total = IS_EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == IS_EMPTY;
	}

	public boolean isFull() {
		return total == IS_FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return IS_EMPTY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return IS_EMPTY;
		return numbers[total--];
	}

}
