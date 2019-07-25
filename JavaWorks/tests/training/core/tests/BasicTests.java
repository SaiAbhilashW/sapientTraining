package training.core.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasicTests {
	
	SampleBL sb1 = null;
	@BeforeEach
	public void setUp() {
		sb1 = new SampleBL();
	}
	
	@BeforeAll
	public static void setUpBeforeAll() {
		System.out.println("Hi, im before all");
	}
	
	@AfterAll
	public static void tearDownAfterAll() {
		System.out.println("Hi, im after all");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("After each method call");
	}

	@Test
	void checktest() {
		SampleBL sb1 = new SampleBL();
		
//		boolean actual = sb1.check();
//		boolean expected = true;
//		
		assertEquals(true, sb1.check());
	}
	
	@Disabled
	@Test
	void checkFailTest() {
		SampleBL sb1 = new SampleBL();
			
		assertEquals(false, sb1.check());
	}
	
	@Test
	public void checkStringTest() {
		SampleBL sb1 = new SampleBL();
		String name = "sai";
		assertEquals("hi " + name, sb1.sayHi(name));
	}
	
	@DisplayName(value="myCustomExceptionTestCase")
	@Test
	public void checkExceptionTest() {
		assertThrows(RuntimeException.class, () -> sb1.throwException());
	}

	
	@DisplayName(value="myLateExceptionTestCase")
	@Test
	public void checkLateExceptionTest() {
		assertTimeout(Duration.ofMillis(1000), () -> sb1.lateException());
	}

}
