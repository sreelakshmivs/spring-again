package spring.again.basics.springagain.scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection { //Constructor

    public JdbcConnection(){
        System.out.println("JDBC connection");
    }
}
