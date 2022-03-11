package spring.again.basics.springagain.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import spring.again.basics.springagain.componentscan.ComponentDAO;
import spring.again.basics.springagain.springin5steps.scope.PersonDAO;


@SpringBootApplication
@ComponentScan("spring.again.basics.springagain.componentscan")
public class SpringAgainComponentScanApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringAgainComponentScanApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringAgainComponentScanApplication.class, args);
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDao);


	}

}
