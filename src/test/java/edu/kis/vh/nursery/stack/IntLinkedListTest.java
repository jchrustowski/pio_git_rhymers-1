package edu.kis.vh.nursery.stack;

import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

	@Test
	public void testPush() {
		IntLinkedList linkedList = new IntLinkedList();
		int testValue = 10;
		linkedList.push(testValue);
		Assert.assertFalse(linkedList.isEmpty());
		Assert.assertEquals(testValue, linkedList.pop());
	}

	@Test
	public void testIsEmpty() {
		IntLinkedList linkedList = new IntLinkedList();
		Assert.assertTrue(linkedList.isEmpty());
		Assert.assertEquals(-1, linkedList.top());
	}

	@Test
	public void testTop() {
		IntLinkedList linkedList = new IntLinkedList();
		int testValue = 10;
		linkedList.push(testValue + 10);
		linkedList.push(testValue + 5);
		linkedList.push(testValue);

		Assert.assertEquals(testValue, linkedList.top());
	}

	@Test
	public void testPop() {
		IntLinkedList linkedList = new IntLinkedList();
		int testValue = 10;
		linkedList.push(testValue);
		Assert.assertFalse(linkedList.isEmpty());
		Assert.assertEquals(testValue, linkedList.pop());
		Assert.assertEquals(-1, linkedList.pop());
		Assert.assertTrue(linkedList.isEmpty());
	}
}