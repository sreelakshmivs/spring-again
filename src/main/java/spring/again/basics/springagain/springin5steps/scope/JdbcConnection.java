package spring.again.basics.springagain.springin5steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
//Configure a proxy to get new instances of jdbc connection each time.
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection { //Constructor

    public JdbcConnection(){
        System.out.println("JDBC connection");
    }
}
