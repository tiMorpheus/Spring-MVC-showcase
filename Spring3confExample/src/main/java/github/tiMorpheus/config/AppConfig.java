package github.tiMorpheus.config;


import github.tiMorpheus.hello.HelloWorld;
import github.tiMorpheus.hello.impl.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "helloBean")
    public HelloWorld helloWorld(){
        return new HelloWorldImpl();
    }
}
