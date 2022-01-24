package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntStack {

	public static final int NUMBERS_MAX_SIZE = 12;
	public static final int INITIAL_RHYMER_INDEX = -1;

	private final int[] numbers = new int[NUMBERS_MAX_SIZE];

	public int getTotal() {
		return total;
	}

	private int total = INITIAL_RHYMER_INDEX;

	@Override
	public void push(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	@Override
	public boolean isEmpty() {
		return total == INITIAL_RHYMER_INDEX;
	}

	@Override
	public boolean isFull() {
		return total == NUMBERS_MAX_SIZE - 1;
	}

	@Override
	public int top() {
		if (isEmpty())
			return IF_EMPTY;
		return numbers[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return IF_EMPTY;
		return numbers[total--];
	}

}
