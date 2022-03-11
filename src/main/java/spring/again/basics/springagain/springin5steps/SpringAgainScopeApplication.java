package spring.again.basics.springagain.springin5steps;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger; //Included this manually
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.again.basics.springagain.springin5steps.scope.PersonDAO;


@SpringBootApplication
public class SpringAgainScopeApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringAgainScopeApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringAgainScopeApplication.class, args);
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());


	}

}
