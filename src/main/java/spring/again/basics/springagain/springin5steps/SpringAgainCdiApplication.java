package spring.again.basics.springagain.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.again.basics.springagain.springin5steps.cdi.SomeCdiBusiness;


@SpringBootApplication
public class SpringAgainCdiApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringAgainCdiApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringAgainCdiApplication.class, args);
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);


		LOGGER.info("{}", business);


	}

}
