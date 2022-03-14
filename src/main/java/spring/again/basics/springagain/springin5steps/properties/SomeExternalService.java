package spring.again.basics.springagain.springin5steps.properties;

//This demonstrates how to get and use an external url from the application.propoerties file. Eg: database url

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    //From property file(external.service.url)
    @Value("${external.service.url}")
    private String url;

    public String returnServiceUrl(){
        return url;
    }

}
