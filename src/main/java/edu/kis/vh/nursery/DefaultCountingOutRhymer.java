package edu.kis.vh.nursery;

/**
 * This class specifies the basic Rhymer.
 */
public class DefaultCountingOutRhymer {

	public static final int NUMBERS_MAX_SIZE = 12;
	public static final int IF_EMPTY = -1;
	public static final int INITIAL_RHYMER_INDEX = -1;

	private final int[] numbers = new int[NUMBERS_MAX_SIZE];

	/**
	 * This method returns the total count of numbers stored.
	 * @return current size of Rhymer.
	 */
	public int getTotal() {
		return total;
	}

	private int total = INITIAL_RHYMER_INDEX;

	/**
	 * This method appends a new number to Rhymer if Rhymer is not full, otherwise nothing happens.
	 * @param in the value to set to the next element
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * This method checks if it is possible to peek or pop a number from Rhymer.
	 * @return {@code true} if Rhymer is in initial state, otherwise {@code false}.
	 */
	public boolean callCheck() {
		return total == INITIAL_RHYMER_INDEX;
	}

	/**
	 * This method checks if Rhymer is full
	 * @return {@code true} if Rhymer is full otherwise {@code false}.
	 */
	public boolean isFull() {
		return total == NUMBERS_MAX_SIZE-1;
	}

	/**
	 * This method peeks an element on the current position of Rhymer.
	 * @return {@code IF_EMPTY} if Rhymer is empty otherwise the value of current element.
	 */
	protected int peekaboo() {
		if (callCheck())
			return IF_EMPTY;
		return numbers[total];
	}

	/**
	 * This method pops the current item of Rhymer if Rhymer has some elements, otherwise it returns {@code IF_EMPTY}
	 * @return the value of removed element if exists.
	 */
	public int countOut() {
		if (callCheck())
			return IF_EMPTY;
		return numbers[total--];
	}

}
