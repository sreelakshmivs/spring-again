package spring.again.basics.springagain.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import spring.again.basics.springagain.springin5steps.basics.BinarySearchImpl;
import spring.again.basics.springagain.springin5steps.properties.SomeExternalService;


@SpringBootApplication
@PropertySource("classpath:app.properties") //load app.properties
public class SpringAgainPropertiesApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringAgainPropertiesApplication.class, args);
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		System.out.println(service);
		System.out.println(service.returnServiceUrl());




	}

}
