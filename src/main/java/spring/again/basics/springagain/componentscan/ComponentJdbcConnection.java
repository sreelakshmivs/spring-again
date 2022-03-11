package spring.again.basics.springagain.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//Configure a proxy to get new instances of jdbc connection each time.
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection { //Constructor

    public ComponentJdbcConnection(){
        System.out.println("JDBC connection");
    }
}
