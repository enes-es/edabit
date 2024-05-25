/** 
==================================== 
TestGen 4.0 for JUnit 4.13.0 		
Test Case: BasicOperation::operation 
Timestamp: 11/10/2020 06:46:54 AM 
------------------------------------ 
® DARKKO 2020 ©
==================================== 

**/ 

import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class BasicOperationTest { 
	
	@Test
	public void test01() { 
		assertEquals(3, BasicOperation.operation("1", "2", "add"));
	}

	@Test
	public void test02() { 
		assertEquals(-19, BasicOperation.operation("1", "-20", "add"));
	}

	@Test
	public void test03() { 
		assertEquals(-2147483648, BasicOperation.operation("9", "0", "divide"));
	}

	@Test
	public void test04() { 
		assertEquals(100, BasicOperation.operation("10", "10", "multiply"));
	}

	@Test
	public void test05() { 
		assertEquals(100, BasicOperation.operation("-10", "-10", "multiply"));
	}

	@Test
	public void test06() { 
		assertEquals(0, BasicOperation.operation("10", "10", "subtract"));
	}

	@Test
	public void test07() { 
		assertEquals(0, BasicOperation.operation("0", "0", "subtract"));
	}

	@Test
	public void test08() { 
		assertEquals(0, BasicOperation.operation("0", "1", "divide"));
	}

	@Test
	public void test09() { 
		assertEquals(0, BasicOperation.operation("0", "25415", "divide"));
	}

	@Test
	public void test10() { 
		assertEquals(1, BasicOperation.operation("4", "3", "divide"));
	}

	@Test
	public void test11() { 
		assertEquals(5, BasicOperation.operation("21", "4", "divide"));
	}

	@Test
	public void test12() { 
		assertEquals(4, BasicOperation.operation("13", "3", "divide"));
	}

}
// end of tests