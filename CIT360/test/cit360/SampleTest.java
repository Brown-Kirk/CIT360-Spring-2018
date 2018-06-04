package cit360;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author reddo
 */
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SampleTest {


	@Test
	public void testAdd() {

		Sample sample = new Sample();

		int result = sample.add(2, 2);

		assertEquals(4, result);

		assertThat("Not good - should not equal 1", result, is(not(1))); // Test result against not being 1

	}

	@Test
	public void testFalse() {

		Sample sample = new Sample();
		boolean result = sample.returnFalse();
                assertFalse("Not Good - This one should succeed", result); // Test true and false
                assertTrue("Good - This one should fail", result);

	}

	@Test
	public void testCreateBig() {

		Sample sample = new Sample();

		BigDecimal b1 = sample.createBig("2.0");
		BigDecimal b2 = sample.createBig("2.0");
		BigDecimal b3 = b1;
                BigDecimal b4 = null;

		assertNotNull("Not good - Object is null but shouldn't be", b1); // Make sure there is something there
		assertNull("Not good - Object is not null but should be", b4);

		assertSame("Not good - these are the same object", b1, b3); // Points to the same object in memory
                assertNotSame("Not good - These are separate objects", b1, b2); // Does not point to the same object in memory, even though the value is the same

	}

	@Test
	public void testCreateArray() {
                
                int[] list1 = new int[]{ 1,2,3 };
                int[] list2 = new int[]{ 1,2,3 };
		assertArrayEquals(list1, list2); // compare two lists

	}

}


