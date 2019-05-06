package sampleQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


class QueueTest {

	/**
	 * Tests for Queue.
	 */

	private static final String SOME_ITEM = "some-content";
	private Queue<String> q;


	@Test
	@DisplayName("is instantiated with new Queue()")
	void isInstantiatedWithNew() {
		new Queue<>();
	}

	@BeforeEach
	void init() {
		this.q = new Queue<String>();
	}

	@Test
	@DisplayName("Verify Queue isEmpty when queue is initialized")
	void isEmptyShouldGiveTrueOnQueueInit() {
		assertTrue(q.isEmpty());
	}

	//Example of Wrong Test! 
	@Test
	@Disabled
	@DisplayName("Verify Queue isEmpty returns false when queue is not empty")
	void isEmptyShouldGiveFalseWhenQueueIsNotEmpty() {
		this.q.enqueue(SOME_ITEM);
		assertFalse(q.isEmpty());
	}

	@Test

	@DisplayName("Queue should add ")
	void VerifyQueueAdds() {
	q.enqueue("1");
	assertTrue(q.peek()=="1");
	
	}
	
	@Test
	
	@DisplayName("Queue should remove ")
	public void testRemove() 
    {
		q.enqueue("3");
        q.enqueue("1");
        assertTrue(q.size()==2);
        q.dequeue();
        assertTrue(q.size()==1);
        
    }
	
@Test
//this checks to make sure that enqueueing then dequeueing doesn't break isEmpty()
public void isEmptyAfterRemove() {
	q.enqueue("5");
	q.dequeue();
	assertTrue(q.isEmpty());
}
@Test
public void CheckQueueSize() {
	q.enqueue("3");
	assertTrue(q.size()==1);
}
}