package spring.again.basics.springagain.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.again.basics.springagain.springin5steps.basics.BinarySearchImpl;

@SpringBootApplication
public class SpringAgainBasicApplication { //demonstrate loose coupling

	public static void main(String[] args) {
		//Spring Application Context maintains all the beans
		ApplicationContext applicationContext = SpringApplication.run(SpringAgainBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);


	}

}
