package spring.again.basics.springagain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import spring.again.basics.springagain.springin5steps.testfile.MyMath;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = MyMath.class)
public class MyMathTests {
	MyMath myMath = new MyMath();

	@Test
	public void sum_with3numbers() {
		//Absence of failure is success
		int result = myMath.sum(new int[]{1,2,3});
		System.out.println("Result2:" + result);
		assertEquals(6, result); //Check that the result is 6
	}

	@Test
	public void sum_with1number(){
		int result1 = myMath.sum(new int[] {3});
		System.out.println("Result1:" + result1);
		assertEquals(3, result1);
	}
	//OTher Assert methods are: assertArrayEquals, AssertTrue,assertFalse, assertNull, asserNotnull etc
	//Other annotations are:@Before (eg: for new db connection before each test), @after, @beforeclass, @afterclass (For
	//beforeclass and afterclass the methods should be static)
}
