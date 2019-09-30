import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LCATest {

	@Test
	public void testIsEmpty() 
 	{
		LCA<Integer, Integer> test = new LCA<Integer, Integer>();
		boolean isEmpty = test.isEmpty();
		assertEquals(isEmpty, true);
		test.put(1, 2);
		test.put(2, 4);
		test.put(3, 6);
		test.put(4, 8);
		isEmpty = test.isEmpty();
		assertEquals(isEmpty, false);

 	}
	
	@Test
	public void testSize(){
		LCA<Integer, Integer> test = new LCA<Integer, Integer>();
		assertEquals(test.size(), 0);
		test.put(4, 1);
		assertEquals(test.size(), 1);
		test.put(2, 4);
		test.put(3, 6);
		assertEquals(test.size(), 3);
		test.put(4, 8);
		assertEquals(test.size(), 3); //Size remains same as element already exists
	}
