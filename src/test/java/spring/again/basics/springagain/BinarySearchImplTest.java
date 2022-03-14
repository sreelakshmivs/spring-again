package spring.again.basics.springagain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.again.basics.springagain.springin5steps.SpringAgainBasicApplication;
import spring.again.basics.springagain.springin5steps.basics.BinarySearchImpl;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = SpringAgainBasicApplication.class) //If you are not using springboot use: @ContextConfiguration(classes = classname.class) and also load the context using @RunWith(SpringRunner.class)
class BinarySearchImplTest {

	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		int result = binarySearch.binarySearch(new int[]{}, 5);
		System.out.println(result);
		assertEquals(3, result);
	}

}
