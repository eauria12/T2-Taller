/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class OrderCalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		OrderCalculator order=new OrderCalculator();
		double order2=order.applyQuantityDiscount(55.0,2);
		assertEquals("Num 1 no es mayor que Num 2", order2);

	}

}
